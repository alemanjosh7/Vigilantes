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
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CRISTIAN
 */
public class PersonalController {
    
     
    //Datos a utilizar
    private Connection cn;
    private String busquedaNombrePersonal;
    private Integer idPersonal;
    private Integer idTipoPersonal ;
    private String nombres;
    private String apellidos;
    private String  telefono; 
    private String dui;
    private String correo;
    private Integer idEstadoPersonal;
    private Integer idUsuario;
    private Float salarioMensual;
    
    public PersonalController(){
        //Establecemos la conexion
        Modelo.Conexion con = new Modelo.Conexion();
        cn = con.conectar();
    }
    public ResultSet consultarTabla(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select p.idPersonal, p.nombres, p.apellidos, tp.nombreTipo, p.telefono, p.dui, p.correo, ep.nombreEstado, p.salarioMensual FROM Personal AS p\n" + 
            "Inner Join TipoPersonal AS tp ON p.idTipoPersonal = tp.idTipoPersonal\n" +
            "Inner Join EstadoPersonal AS ep ON p.idEstadoPersonal = ep.idEstadoPersonal");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public ResultSet consultarTablaCargo(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select * FROM TipoPersonal");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel generarComboBoxCargo(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaCargo();
            
            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTablaEstadoPersonal(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select * FROM EstadoPersonal");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel generarComboBoxEstadoPersonal(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaEstadoPersonal();
            
            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTablaUsuario(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select idUsuario, nombreUsuario FROM Usuario");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel generarComboBoxUsuario(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaUsuario();
            
            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(2).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public boolean insertarPersonal(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "INSERT INTO Personal(idTipoPersonal, nombres, apellidos, telefono, dui, correo, idEstadoPersonal, idUsuario, salarioMensual) values(?, ?, ?, ?, ?, ?, ?, ?, ?)"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idTipoPersonal);
            cmd.setString(2, nombres);
            cmd.setString(3, apellidos);
            cmd.setString(4, telefono);
            cmd.setString(5, dui);
            cmd.setString(6, correo);
            cmd.setInt(7, idEstadoPersonal);
            cmd.setInt(8, idUsuario);
            cmd.setFloat(9, salarioMensual);
            //Si da error devuelve 1, caso contrario 
            //Tomar en cuenta que el ! es negación
            if(!cmd.execute()){
              res=true;
            }
           
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean modificarPersonal(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "UPDATE Personal SET idTipoPersonal = ?, nombres = ?, apellidos = ?, telefono = ?, dui = ?, correo = ?, idEstadoPersonal = ?, idUsuario = ?, salarioMensual = ? WHERE idPersonal = ?"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idTipoPersonal);
            cmd.setString(2, nombres);
            cmd.setString(3, apellidos);
            cmd.setString(4, telefono);
            cmd.setString(5, dui);
            cmd.setString(6, correo);
            cmd.setInt(7, idEstadoPersonal);
            cmd.setInt(8, idUsuario);
            cmd.setFloat(9, salarioMensual);
            cmd.setInt(10, idPersonal);
            //Si da error devuelve 1, caso contrario 
            //Tomar en cuenta que el ! es negación
            if(!cmd.execute()){
              res=true;
            }
           
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public ResultSet consultarTablaFiltrada(){
        
        boolean res = false;
        PreparedStatement st;
        ResultSet datos = null;
        try{
            String sql = "Select p.idPersonal, p.nombres, p.apellidos, tp.nombreTipo, p.telefono, p.dui, p.correo, ep.nombreEstado, p.salarioMensual FROM Personal AS p\n" +
            "Inner Join TipoPersonal AS tp ON p.idTipoPersonal = tp.idTipoPersonal\n" +
            "Inner Join EstadoPersonal AS ep ON p.idEstadoPersonal = ep.idEstadoPersonal\n" +
            "Where p.nombres LIKE CONCAT( '%',?,'%')"; //se pasan por referencia por seguridad //se pasan por referencia por seguridad
            st=getCn().prepareStatement(sql);
            st.setString(1, busquedaNombrePersonal);
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
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cargo");
        modelo.addColumn("Telefono");
        modelo.addColumn("DUI");
        modelo.addColumn("Correo");
        modelo.addColumn("Estado");
        modelo.addColumn("Salario");
        
        try {
            ResultSet rs = consultarTabla();
            
            while(rs.next()){
                Object [] fila = new Object[9];
                for (int i=0;i<9;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
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
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cargo");
        modelo.addColumn("Telefono");
        modelo.addColumn("DUI");
        modelo.addColumn("Correo");
        modelo.addColumn("Estado");
        modelo.addColumn("Salario");
        
        try {
            ResultSet rs = consultarTablaFiltrada();
            
            while(rs.next()){
                Object [] fila = new Object[9];
                for (int i=0;i<9;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the busquedaNombrePersonal
     */
    public String getBusquedaNombrePersonal() {
        return busquedaNombrePersonal;
    }

    /**
     * @param busquedaNombrePersonal the busquedaNombrePersonal to set
     */
    public void setBusquedaNombrePersonal(String busquedaNombrePersonal) {
        this.busquedaNombrePersonal = busquedaNombrePersonal;
    }

    /**
     * @return the idPersonal
     */
    public Integer getIdPersonal() {
        return idPersonal;
    }

    /**
     * @param idPersonal the idPersonal to set
     */
    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    /**
     * @return the idTipoPersonal
     */
    public Integer getIdTipoPersonal() {
        return idTipoPersonal;
    }

    /**
     * @param idTipoPersonal the idTipoPersonal to set
     */
    public void setIdTipoPersonal(Integer idTipoPersonal) {
        this.idTipoPersonal = idTipoPersonal;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the dui
     */
    public String getDui() {
        return dui;
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui = dui;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the idEstadoPersonal
     */
    public Integer getIdEstadoPersonal() {
        return idEstadoPersonal;
    }

    /**
     * @param idEstadoPersonal the idEstadoPersonal to set
     */
    public void setIdEstadoPersonal(Integer idEstadoPersonal) {
        this.idEstadoPersonal = idEstadoPersonal;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the salarioMensual
     */
    public Float getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * @param salarioMensual the salarioMensual to set
     */
    public void setSalarioMensual(Float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    
}
