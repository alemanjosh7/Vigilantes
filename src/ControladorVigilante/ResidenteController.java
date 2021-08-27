/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class ResidenteController {
    //Atributos de los residente
    private Connection cn;    
    private int idResidente;
    private String nombreResidente;
    private String apellidosResidente;
    private String dui;
    private String nit;
    private int mayorEdad;
    private int idEstadoResidente;

    //get -- set
    
    public Connection getCn(){
        return cn;
    }
    
    //id de el Registro de la residente
    public Integer getidResidente(){
        return idResidente;
    }
    
    public void setidResidente(int idResidente){
        this.idResidente = idResidente;
    }

    //nombre de Residente
    public String getNombreResidente(){
        return nombreResidente;
    }
    
    public void setNombreResidente(String nombreResidente){
        this.nombreResidente = nombreResidente;
    }  
    
    //apellido de Residente
    public String getApellidoResidente(){
        return apellidosResidente;
    }
    
    public void setApellidoResidente(String apellidosResidente){
        this.apellidosResidente = apellidosResidente;
    }

    //dui de Residente
    public String getDUI(){
        return dui;
    }
    
    public void setDui(String dui){
        this.dui = dui;
    }
    
    //nit de Residente
    public String getNIT(){
        return nit;
    }
    
    public void setNIT(String nit){
        this.nit = nit;
    }    

    //Si el residente es mayor de Edad
    public Integer getMayorEdad(){
        return mayorEdad;
    }
    
    public void setMayorEdad(int mayorEdad){
        this.mayorEdad = mayorEdad;
    }    

    //Si el residente es mayor de Edad
    public Integer getidEstadoResidente(){
        return idEstadoResidente;
    }
    
    public void setidEstadoResidente(int idEstadoResidente){
        this.idEstadoResidente = idEstadoResidente;
    }  
            
    //Estableciendo la conexión en el constructor
    public ResidenteController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //Guardar los datos
    public boolean guardarResidentes(){
        boolean res = false;
        try{
            String sql = "INSERT INTO Residente(nombres, apellidos, dui, nit, mayoriaEdad, idEstadoResidente) values (?,?,?,?,?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,nombreResidente);
            cmd.setString(2, apellidosResidente);
            cmd.setString(3, dui);
            cmd.setString(4, nit);
            cmd.setInt(5, mayorEdad);
            cmd.setInt(6,idEstadoResidente);
            if (!cmd.execute()) {
                res=true;
            }
            //cerrando conexión
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return res;
    }
    
    //Modificar los datos
    public boolean modificarResidentes(){
        boolean res = false;
        try{
            String sql = "UPDATE Residente SET nombres =?, apellidos =?, dui =?, nit =?, mayoriaEdad =?, idEstadoResidente =? WHERE idResidente =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,nombreResidente);
            cmd.setString(2, apellidosResidente);
            cmd.setString(3, dui);
            cmd.setString(4, nit);
            cmd.setInt(5, mayorEdad);
            cmd.setInt(6,idEstadoResidente);
            cmd.setInt(7, idResidente);
            if (!cmd.execute()) {
                res=true;
            }
            //cerrando conexión
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return res;
    }
    
    //Eliminar los datos
    public boolean eliminarResidentes(){
        boolean res = false;
        try{
            String sql = "DELETE FROM Residente WHERE idResidente =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idResidente);
            if (!cmd.execute()) {
                res=true;
            }
            //cerrando conexión
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return res;
    }    
      
    
    //Consultar los datos
    public ResultSet consultaDatos(String sql){
        ResultSet res = null;
        try{
            PreparedStatement cmd = cn.prepareStatement(sql);
            res = cmd.executeQuery();
        }
        catch(SQLException ex){
            System.out.println("Error de consulta: "+ex.toString());
        }
        return res;
    }    
    
    
    //Obtener los datos para el combobox de Porton de Salida
    public DefaultComboBoxModel consultarEsResidente(){
        DefaultComboBoxModel EstadoResidenteList = new DefaultComboBoxModel();
        EstadoResidenteList.addElement("Estado de Residente");
        ResultSet res = this.consultaDatos("SELECT * FROM EstadoResidente");
        try{
            while (res.next()) {
                EstadoResidenteList.addElement(res.getString("nombreEstado"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return EstadoResidenteList;
    }            
    
    
    //Convirtiendo el valor del combobox a Id: TipoES
    public boolean convertirEsResidente(String estadoResidente){
        boolean res = false;
        try{
            String sql = ("SELECT idEstadoResidente FROM EstadoResidente WHERE nombreEstado =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, estadoResidente);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setidEstadoResidente(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
        
    
    //Generar la tabla de Entrada
    public DefaultTableModel consultarDatosTabla(){
        DefaultTableModel tResidente = new DefaultTableModel();
        tResidente.addColumn("Indentificación");
        tResidente.addColumn("Nombre");
        tResidente.addColumn("Apellido");
        tResidente.addColumn("DUI");
        tResidente.addColumn("¿Es mayor de edad?");
        tResidente.addColumn("Estado del Residente");
                
        String[] datos =  new String[6];
        int mayorEdad;
        ResultSet res = this.consultaDatos("SELECT R.idResidente, R.nombres, R.apellidos, R.dui, R.mayoriaEdad, ER.nombreEstado FROM Residente R JOIN EstadoResidente ER  ON ER.idEstadoResidente = R.idEstadoResidente");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                mayorEdad = res.getInt(5);
                if (mayorEdad == 1) {
                    datos[4] = "Mayor de Edad";
                }
                else{
                    datos[4] = "Menor de Edad";
                }
                datos[5] = res.getString(6);
                
                tResidente.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tResidente;
    }

    public boolean consultarResidente(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM Residente WHERE idResidente =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idResidente);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idResidente = res.getInt(1);
                nombreResidente = res.getString(2);
                apellidosResidente = res.getString(3);
                dui = res.getString(4);
                nit = res.getString(5);
                mayorEdad = res.getInt(6);
                idEstadoResidente = res.getInt(7);

            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return bres;
    }
    
    public DefaultTableModel filtrarDatosTabla(){
        DefaultTableModel tEntradaFiltrada = new DefaultTableModel();
        tEntradaFiltrada.addColumn("Indentificación");
        tEntradaFiltrada.addColumn("Nombre");
        tEntradaFiltrada.addColumn("Apellido");
        tEntradaFiltrada.addColumn("DUI");
        tEntradaFiltrada.addColumn("¿Es mayor de edad?");
        tEntradaFiltrada.addColumn("Estado del Residente");
                
        String[] datos =  new String[6];
        int mayorEdad;
        try{
            //Realizar consulta
            String sql = "SELECT R.idResidente, R.nombres, R.apellidos, R.dui, R.mayoriaEdad, ER.nombreEstado FROM Residente R JOIN EstadoResidente ER ON ER.idEstadoResidente = R.idEstadoResidente  WHERE idResidente =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1,idResidente);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                mayorEdad = res.getInt(5);
                if (mayorEdad == 1) {
                    datos[4] = "Mayor de Edad";
                }
                else{
                    datos[4] = "Menor de Edad";
                }
                datos[5] = res.getString(6);                
                tEntradaFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tEntradaFiltrada; 
    }
    
    
    public DefaultTableModel filtrarDatosTablaNombre(){
        DefaultTableModel tResidenteFiltrada = new DefaultTableModel();
        tResidenteFiltrada.addColumn("Indentificación");
        tResidenteFiltrada.addColumn("Nombre");
        tResidenteFiltrada.addColumn("Apellido");
        tResidenteFiltrada.addColumn("DUI");
        tResidenteFiltrada.addColumn("¿Es mayor de edad?");
        tResidenteFiltrada.addColumn("Estado del Residente");

        int mayorEdad;        
        String[] datos =  new String[6];
        try{
            //Realizar consulta
            String sql = "SELECT R.idResidente, R.nombres, R.apellidos, R.dui, R.mayoriaEdad, ER.nombreEstado FROM Residente R JOIN EstadoResidente ER ON ER.idEstadoResidente = R.idEstadoResidente WHERE nombres LIKE CONCAT('%',?,'%')";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setString(1, nombreResidente);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                mayorEdad = res.getInt(5);
                if (mayorEdad == 1) {
                    datos[4] = "Mayor de Edad";
                }
                else{
                    datos[4] = "Menor de Edad";
                }
                datos[5] = res.getString(6);
                
                tResidenteFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tResidenteFiltrada; 
    }       
    
}
