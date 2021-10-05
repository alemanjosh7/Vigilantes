/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import java.sql.Connection;
import Clases.Conexion;
import Modelo.ComboItems;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Miguel
 */
public class PagoController {
  //Atributos de los Pagos
    private Connection cn;
    private int idPago;
    private int idPersonalEmisor;
    private int idPersonalReceptor;
    private int cantidadPago;
    private String fechaPago;
    private String busquedaPersonal;
    public int Salario;
     //get -- set
    public boolean consultaDato;
    
    public Connection getCn(){
        return cn;
    }
    //id de Pago
    public Integer getIdPago(){
        return idPago;
    }

    public void setIdPago(int idPago){
        this.idPago = idPago;
    }
    //id de el Personal Emisor
    public Integer getIdPersonalEmisor(){
        return idPersonalEmisor;
    }

    public void setIdPersonalEmisor(int idPersonalEmisor){
        this.idPersonalEmisor = idPersonalEmisor;
    }
    //id de el Personal Receptor
    public Integer getIdPersonalReceptor(){
        return idPersonalReceptor;
    }
    
    public void setIdPersonalReceptor(int idPersonalReceptor){
        this.idPersonalReceptor = idPersonalReceptor;
    }
    //Cantidad de Pago
   public int getCantidadPago(){
        return cantidadPago;
    }

    public void setCantidadPago(int cantidadPago){
        this.cantidadPago = cantidadPago;
    }
    //Fecha de Pago
    public String getfechaPago(){
        return fechaPago;
    }
    
    public void setfechaPago(String fechaPago){
        this.fechaPago = fechaPago;
    }
    
    //personal
    public String getPersonal(){
        return busquedaPersonal;
    }

    public void setPersonal(String busquedaPersonal){
        this.busquedaPersonal = busquedaPersonal;
    }
    
     //Estableciendo la conexión en el constructor
    public PagoController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //Guardar los datos
    public boolean guardarPagos(){
               boolean res = false;
        try{
            String sql = "INSERT INTO PagoRealizado(idPersonalEmisor, idPersonalReceptor, cantidadPago, fechaPago) values (?,?,?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idPersonalEmisor);
            cmd.setInt(2, idPersonalReceptor);
            cmd.setInt(3, (int) cantidadPago);
            cmd.setString(4,fechaPago);
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
    public boolean modificarPago(){
        boolean res = false;
        try{
            String sql = "UPDATE PagoRealizado SET idPersonalEmisor =?, idPersonalReceptor =?, cantidadPago =?, fechaPago =? WHERE idPago =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idPersonalEmisor);
            cmd.setInt(2, idPersonalReceptor);
            cmd.setInt(3, (int) cantidadPago);
            cmd.setString(4,fechaPago);
            cmd.setInt(5, idPago);
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
    public boolean eliminarPago(){
        boolean res = false;
        try{
            String sql = "DELETE FROM PagoRealizado WHERE idPago =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idPago);
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
    
    //Obtener los datos para el combobox del personal
    
    public ResultSet consultarTablaPersonal(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select p.idPersonal, p.nombres FROM Personal as p WHERE p.idTipoPersonal = 2");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel consultarPersonal(){
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
      
        try {
            ResultSet rs = consultarTablaPersonal();
            modelo.addElement(new ComboItems( 0,  "Seleccionar Personal:" ) );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()),  rs.getObject(1).toString() + "- " + rs.getObject(2).toString() ) );
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    //Obtener los datos para el combobox el encargado
    
    public ResultSet consultarTablaPersonalEncargado(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select p.idPersonal, p.nombres FROM Personal as p WHERE p.idTipoPersonal = 1 AND p.idEstadoPersonal = 1");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel consultarEncargado(){
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
      
        try {
            ResultSet rs = consultarTablaPersonalEncargado();
            modelo.addElement(new ComboItems( 0,  "Seleccionar Encargado:" ) );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()),  rs.getObject(1).toString() + "- " + rs.getObject(2).toString() ) );
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }


    
    //Generar la tabla de Pago
    public DefaultTableModel consultarDatosTablaPago(){
        DefaultTableModel TPago = new DefaultTableModel();
        TPago.addColumn("Identificacion");
        TPago.addColumn("Recpetor");
        TPago.addColumn("DUI");
        TPago.addColumn("Cantidad a Pagar");
        TPago.addColumn("Fecha de pago");
        String[] datos =  new String[5];
         ResultSet res = this.consultaDatos("SELECT PR.idPago,PS.nombres, PS.dui, PS.salarioMensual, PR.fechaPago FROM PagoRealizado PR JOIN Personal PS ON PR.idPersonalReceptor = PS.idPersonal and PR.idPersonalReceptor = PS.idPersonal SELECT * from Personal");        
            try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                TPago.addRow(datos);                      
            }

        }
            catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return TPago;
    }


    
    
   public DefaultTableModel consultarTablaFiltrada(){
        DefaultTableModel TPago = new DefaultTableModel();
         TPago.addColumn("Identificacion");
        TPago.addColumn("Encragado");
        TPago.addColumn("Receptor");
        TPago.addColumn("Cantidad a Pagar");
        TPago.addColumn("Fecha de pago");

        String[] datos =  new String[5];
        try{
            //Realizar consulta
            String sql = "SELECT PR.idPago,PS.nombres, PS.dui, PS.salarioMensual, PR.fechaPago FROM PagoRealizado PR JOIN Personal PS ON PR.idPersonalReceptor = PS.idPersonal and PR.idPersonalReceptor = PS.idPersonal SELECT * from Personal WHERE idPago =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idPago);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                TPago.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return TPago;
    }
     
     
     
     
    
      
    public boolean consultarPago(){
        boolean bres = false;
        try{
            //Realizar consulta
            String sql = "SELECT * FROM pagoRealizado WHERE idPago =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idPago);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idPago = res.getInt(1);
                idPersonalEmisor = res.getInt(2);
                idPersonalReceptor = res.getInt(3);
                cantidadPago = res.getInt(4);
                fechaPago = res.getString(5);
            }    
        //cerrando conexion
        cmd.close();
       }
       catch(Exception ex){
         System.out.println(ex.toString());
        }
        return bres;
    }

    public boolean consultarSalario(Integer idPersonal) {
        boolean bres = false;
        try{
            //Realizar consulta
            String sql = "SELECT salarioMensual FROM Personal WHERE idPersonal =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idPersonal);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                Salario = res.getInt(1);
            }    
        //cerrando conexion
        cmd.close();
       }
       catch(Exception ex){
         System.out.println(ex.toString());
        }
        return bres;
    }
    
 }  

