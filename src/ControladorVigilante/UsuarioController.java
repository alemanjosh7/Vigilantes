/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import Modelo.ComboItems;
import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Josue Aleman
 */
public class UsuarioController {
    private Connection cn;
    private int id_usuario;
    private String nombre_usuario;
    private String contrasena;
    private int id_tipo_usuario;
    private int id_personal;
    private int id_estado_usuario;
    private String correo;
    private int BusquedaIDUsuario;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public UsuarioController() {
       Conexion con = new Conexion();
       cn = con.conectar();
//       cn = Conexion.conectar();
    }    
    
    public Connection getCn() {
        return cn;
    }
    
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public int getId_estado_usuario() {
        return id_estado_usuario;
    }

    public void setId_estado_usuario(int id_estado_usuario) {
        this.id_estado_usuario = id_estado_usuario;
    }
    
    public boolean cambiarContrasena(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE Usuario SET contrasena = ? from Usuario Inner Join Personal on Usuario.idUsuario = Personal.idUsuario where Personal.correo = ?";
       //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, contrasena);
           cmd.setString(2, correo);
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean guardarUsuario(){
        boolean res = false;
        try{
            String sql = "insert into Usuario values(?, ?, ?, ?, ?)";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_usuario);
            cmd.setString(2, contrasena);
            cmd.setInt(3, id_tipo_usuario);
            cmd.setInt(4, id_estado_usuario);
            cmd.setInt(5, id_personal);
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
    
    public boolean modificarUsuario(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE Usuario SET nombreUsuario =?, contrasena=?, idTipoUsuario=?, idEstadoUsuario=?, idPersonal=? WHERE idUsuario=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, nombre_usuario);
           cmd.setString(2, contrasena);
           cmd.setInt(3, id_tipo_usuario);
           cmd.setInt(4, id_estado_usuario);
           cmd.setInt(5, getId_personal());
           cmd.setInt(6, id_usuario);
            if (!cmd.execute()) {
               res=true;  
            }
            //cerrando conexión
            cmd.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
//

    /**
     * @return the id_personal
     */
    public int getId_personal() {
        return id_personal;
    }

    /**
     * @param id_personal the id_personal to set
     */
    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public DefaultComboBoxModel generarComboBoxEstadoUsuario() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaEstadoUsuario();
            modelo.addElement(new ComboItems( 0, "Seleccionar Estado:") );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }

    public DefaultComboBoxModel generarComboBoxTipoUsuario() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaTipoUsuario();
            modelo.addElement(new ComboItems( 0, "Seleccionar Tipo:") );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }

    public DefaultComboBoxModel generarComboBoxPersonal() {
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaPersonal();
            modelo.addElement(new ComboItems( 0, "Seleccionar Personal:") );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()),  rs.getObject(1).toString() + "- " + rs.getObject(2).toString() + " " + rs.getObject(3).toString() ) );
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }

    private ResultSet consultarTablaEstadoUsuario() {
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select * FROM EstadoUsuario");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }

    private ResultSet consultarTablaTipoUsuario() {
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select * FROM tipoUsuario");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }

    private ResultSet consultarTablaPersonal() {
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select p.idPersonal, p.nombres, p.apellidos FROM Personal as p WHERE p.idEstadoPersonal = 1");
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
        modelo.addColumn("ID");
        modelo.addColumn("Nombre de usuario");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado");
        modelo.addColumn("ID Personal");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        try {
            ResultSet rs = consultarTablaFiltrada();
            
            while(rs.next()){
                Object [] fila = new Object[7];
                for (int i=0;i<7;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTablaFiltrada(){
        
        boolean res = false;
        PreparedStatement st;
        ResultSet datos = null;
        try{
            String sql = "Select U.idUsuario, U.nombreUsuario, TU.nombreTipo, EU.nombreEstado, P.idPersonal, P.nombres, P.apellidos FROM Usuario AS U \n" + 
            "Inner Join tipoUsuario AS TU ON U.idTipoUsuario = TU.idTipoUsuario \n"+
            "Inner Join EstadoUsuario AS EU ON U.idEstadoUsuario = EU.idEstadoUsuario \n"+
            "Inner Join Personal AS P ON U.idPersonal = P.idPersonal \n"+
            "WHERE U.idUsuario = ?"; //se pasan por referencia por seguridad //se pasan por referencia por seguridad
            st=getCn().prepareStatement(sql);
            st.setInt(1, getBusquedaIDUsuario());
            datos=st.executeQuery();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultTableModel generarTabla(){
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombre de usuario");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado");
        modelo.addColumn("ID Personal");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        try {
            ResultSet rs = consultarTabla();
            
            while(rs.next()){
                Object [] fila = new Object[7];
                for (int i=0;i<7;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTabla(){
        
        boolean res = false;
        PreparedStatement st;
        ResultSet datos = null;
        try{
            String sql = "Select U.idUsuario, U.nombreUsuario, TU.nombreTipo, EU.nombreEstado, P.idPersonal, P.nombres, P.apellidos FROM Usuario AS U \n" + 
            "Inner Join tipoUsuario AS TU ON U.idTipoUsuario = TU.idTipoUsuario \n"+
            "Inner Join EstadoUsuario AS EU ON U.idEstadoUsuario = EU.idEstadoUsuario \n"+
            "Inner Join Personal AS P ON U.idPersonal = P.idPersonal";
            st=getCn().prepareStatement(sql);
            datos=st.executeQuery();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }

    /**
     * @return the BusquedaIDUsuario
     */
    public int getBusquedaIDUsuario() {
        return BusquedaIDUsuario;
    }

    /**
     * @param BusquedaIDUsuario the BusquedaIDUsuario to set
     */
    public void setBusquedaIDUsuario(int BusquedaIDUsuario) {
        this.BusquedaIDUsuario = BusquedaIDUsuario;
    }

    public boolean consultarUsuario(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM Usuario WHERE idUsuario =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, id_usuario);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                id_usuario = res.getInt(1);
                nombre_usuario = res.getString(2);
                contrasena = res.getString(3);
                id_tipo_usuario = res.getInt(4);
                id_estado_usuario = res.getInt(5);
                id_personal = res.getInt(6);
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
