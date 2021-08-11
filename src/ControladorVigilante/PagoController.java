/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import java.sql.Connection;
import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Miguel
 */
public class PagoController {
  //Atributos de los portones
    private Connection cn;
      private int idPago;
    private int idPersonalEmisor;
    private int idPersonalReceptor;
    private int cantidadPago;
    private String fechaPago;
     //get -- set
    
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

    public void setIdRegistroEntrada(int idPersonalEmisor){
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
   public Integer getCantidadPago(){
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
            cmd.setInt(3, cantidadPago);
            cmd.setString(4,fechaPago);
            if (!cmd.execute()) {
                res=true;
            }
            //cerrando conexión
            cmd.close();
            cn.close();
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
            String sql = "UPDATE RegistroEntrada SET idPersonalEmisor =?, idPersonalReceptor =?, cantidadPago =?, fechaPago =? WHERE idPago =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idPersonalEmisor);
            cmd.setInt(2, idPersonalReceptor);
            cmd.setInt(3, cantidadPago);
            cmd.setString(4,fechaPago);
            cmd.setInt(5, idPago);
            if (!cmd.execute()) {
                res=true;
            }
    //cerrando conexión
            cmd.close();
            cn.close();
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
            cn.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return res;
    }
    
    //Consultar los datos
    public ResultSet consultaDatosPago(String sql){
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
    
    //Obtener los datos para el combobox de el personal
    public DefaultComboBoxModel consultarPersonal(){
        DefaultComboBoxModel PersonalList = new DefaultComboBoxModel();
        PersonalList.addElement("Nombre del personal");
        ResultSet res = this.consultaDatosPago("SELECT * FROM Personal");
        try{
            while (res.next()) {
                PersonalList.addElement(res.getString("idPersonal"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return PersonalList;
    }
     //Generar la tabla de Pago
    public DefaultTableModel consultarDatosTabla() throws SQLException{
        DefaultTableModel tPago = new DefaultTableModel();
        tPago.addColumn("Encragado del pago");
        tPago.addColumn("Recivir el pago");
        tPago.addColumn("Cantidad a Pagar");
        tPago.addColumn("Fecha de pago");
        String[] datos =  new String[5];
         ResultSet res = this.consultaDatosPago("SELECT RE.idPago, FROM PagoRealizado RE JOIN idPersonalEmisor V  ON RE.idPersonalReceptor = V.cantidadPago JOIN fechaPago");
         
            try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tPago.addRow(datos);                      
            }

        }
            catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return tPago;
    }
 }  

