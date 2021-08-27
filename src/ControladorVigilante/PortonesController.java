/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import java.sql.Connection;
import Clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CRISTIAN
 */
public class PortonesController {
    //Atributos de los portones
    private Connection cn;
    private int idPorton;
    private int idZona;
    private int idTipoPorton;

    
    //get -- set
    public Connection getCn(){
        return cn;
    }
    
    
    //Id del Porton
    public Integer getIdPorton(){
        return idPorton;
    }
    
    public void setIdPorton(int idPorton){
        this.idPorton = idPorton;
    }
    
    //Id de la Zona
    public Integer getIdZona(){
        return idZona;
    }
    
    public void setIdZona(int idZona){
        this.idZona = idZona;
    }
    
    //Id del Tipo de Porton
    public Integer getIdTipoPorton(){
        return idTipoPorton;
    }
    
    public void setIdTipoPorton(int idTipoPorton){
        this.idTipoPorton = idTipoPorton;
    }
    
    //Estableciendo la conexión en el constructor
    public PortonesController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //Guardar los datos
    public boolean guardarPorton(){
        boolean res = false;
        try{
            String sql = "INSERT INTO Porton(idZona, idTipoPorton) values (?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idZona);
            cmd.setInt(2,idTipoPorton);
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
    public boolean modificarPorton(){
        boolean res = false;
        try{
            String sql = "UPDATE Porton SET idZona =?, idTipoPorton =? WHERE idPorton =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idZona);
            cmd.setInt(2,idTipoPorton);
            cmd.setInt(3,idPorton);    
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
    public boolean eliminarPorton(){
        boolean res = false;
        try{
            String sql = "DELETE FROM Porton WHERE idPorton =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idPorton);
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
    
    //Obtener los datos para el combobox de Zonas
    public DefaultComboBoxModel consultarZona(){
        DefaultComboBoxModel ZonasList = new DefaultComboBoxModel();
        ZonasList.addElement("Seleccione zona");
        ResultSet res = this.consultaDatos("SELECT * FROM Zonas");
        try{
            while (res.next()) {
                ZonasList.addElement(res.getString("nombreZona"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return ZonasList;
    }

    //Obtener los datos para el combobox de Tipo Porton
    public DefaultComboBoxModel consultarTipoPorton(){
        DefaultComboBoxModel TipoPortonList = new DefaultComboBoxModel();
        TipoPortonList.addElement("Tipo de Porton");
        ResultSet res = this.consultaDatos("SELECT * FROM TipoPorton");
        try{
            while (res.next()) {
                TipoPortonList.addElement(res.getString("descripciónTipoPorton"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return TipoPortonList;
    }
    
    //Generar la tabla de Portones
    public DefaultTableModel consultarDatosTabla(){
        DefaultTableModel tPortones = new DefaultTableModel();
        tPortones.addColumn("Indentificación");
        tPortones.addColumn("Zona");
        tPortones.addColumn("Tipo Porton");
                
        String[] datos =  new String[3];
        ResultSet res = this.consultaDatos("SELECT P.idPorton, Z.nombreZona, TP.descripciónTipoPorton FROM Porton P JOIN Zonas Z ON P.idZona = Z.idZona JOIN TipoPorton TP ON P.idTipoPorton = TP.idTipoPorton");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                tPortones.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tPortones;
    }    
 
    //Convirtiendo el valor del combobox a Id: Zonas
    public boolean convertirZonas(String visitante){
        boolean res = false;
        try{
            String sql = ("SELECT idZona FROM Zonas WHERE nombreZona =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, visitante);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdZona(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
    //Convirtiendo el valor del combobox a Id: Tipo Portones
    public boolean convertirTipoPorton(String TipoPorton){
        boolean res = false;
        try{
            String sql = ("SELECT idTipoPorton FROM TipoPorton WHERE descripciónTipoPorton =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, TipoPorton);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdTipoPorton(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }      

    public boolean consultarPortones(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM Porton WHERE idPorton =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idPorton);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idPorton = res.getInt(1);
                idZona = res.getInt(2);
                idTipoPorton = res.getInt(3);
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
        DefaultTableModel tPortonFiltrado = new DefaultTableModel();
        tPortonFiltrado.addColumn("Indentificación");
        tPortonFiltrado.addColumn("Zona");
        tPortonFiltrado.addColumn("Tipo Porton");
                
        String[] datos =  new String[5];
        try{
            //Realizar consulta
            String sql = "SELECT P.idPorton, Z.nombreZona, TP.descripciónTipoPorton FROM Porton P JOIN Zonas Z ON P.idZona = Z.idZona JOIN TipoPorton TP ON P.idTipoPorton = TP.idTipoPorton WHERE idPorton =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idPorton);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                tPortonFiltrado.addRow(datos);                      
            }            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tPortonFiltrado;
    }    
}
