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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CRISTIAN
 */
public class ZonasController {
    //Atributos de los portones
    private Connection cn;
    private int idZona;
    private String nombreZona;
    private String busquedaNombreZona;
    
    //get -- set
    public Connection getCn(){
        return cn;
    }
    
    //Id de la Zona
    public Integer getIdZona(){
        return idZona;
    }
    
    public void setIdZona(int idZona){
        this.idZona = idZona;
    }
    
    //Nombre de la Zona
    public String getNombreZona(){
        return nombreZona;
    }
    
    public void setNombreZona(String nombreZona){
        this.nombreZona = nombreZona;
    }
    
    public ZonasController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //Guardar los datos
    public boolean guardarZona(){
        boolean res = false;
        try{
            String sql = "INSERT INTO Zonas(nombreZona) values (?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,nombreZona);
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
    public boolean modificarZona(){
        boolean res = false;
        try{
            String sql = "UPDATE Zonas SET nombreZona =? WHERE idZona =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,nombreZona);  
            cmd.setInt(2,idZona);
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
    public boolean eliminarZona(){
        boolean res = false;
        try{
            String sql = "DELETE FROM Zonas WHERE idZona =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idZona);
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
    
    //Generar la tabla de Zonas
    public DefaultTableModel consultarDatosTabla(){
        DefaultTableModel tZonas = new DefaultTableModel();
        tZonas.addColumn("Identificación");
        tZonas.addColumn("Zona");
                
        String[] datos =  new String[2];
        ResultSet res = this.consultaDatos("SELECT * FROM Zonas");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                tZonas.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tZonas;
    }    
    
    public boolean consultarZonas(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM Zonas WHERE idZona =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idZona);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idZona = res.getInt(1);
                nombreZona = res.getString(2);
            }
            
             //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return bres;
    }
    
    //Mostrar en la tabla los datos consultados
    public DefaultTableModel filtrarDatosTabla(){
        DefaultTableModel tZonasFiltradas = new DefaultTableModel();
        tZonasFiltradas.addColumn("Identificación");
        tZonasFiltradas.addColumn("Zona");

        String[] datos =  new String[2];
        try{            
            //Realizar consulta
            String sql = "SELECT * FROM Zonas WHERE idZona =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Enviando el dato solicitado
            cmd.setInt(1, idZona);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                tZonasFiltradas.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tZonasFiltradas;
    }
    
    private ResultSet consultarTablaFiltrada(){
        
        boolean res = false;
        PreparedStatement st;
        ResultSet datos = null;
        try{
            String sql = "Select * From Zonas WHERE nombreZona LIKE CONCAT( '%',?,'%')"; //se pasan por referencia por seguridad
            st=cn.prepareStatement(sql);
            st.setString(1, getBusquedaNombreZona());
            datos=st.executeQuery();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultTableModel generarTablaFiltrada(){
        
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        modelo.addColumn("idZona");
        modelo.addColumn("nombreZona");
        
        try {
            ResultSet rs = consultarTablaFiltrada();
            
            while(rs.next()){
                Object [] fila = new Object[2];
                for (int i=0;i<2;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }        

    /**
     * @return the busquedaNombreZona
     */
    public String getBusquedaNombreZona() {
        return busquedaNombreZona;
    }

    /**
     * @param busquedaNombreZona the busquedaNombreZona to set
     */
    public void setBusquedaNombreZona(String busquedaNombreZona) {
        this.busquedaNombreZona = busquedaNombreZona;
    }
}
