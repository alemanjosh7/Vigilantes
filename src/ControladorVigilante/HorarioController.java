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
 * @author CRISTIAN
 */
public class HorarioController {
   
    //Datos a utilizar
    private Connection cn;
    private Integer idTurno;
    private Integer idPersonal;
    private Integer idPorton;
    private String horaIngreso;
    private String horaSalida;
    private String fecha;
    private Integer busquedaIDTurno;
 
    
    public HorarioController(){
        //Establecemos la conexion
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    public ResultSet consultarTabla(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select h.idTurno, p.idPersonal, p.nombres, p.apellidos, h.idPorton, h.horaIngreso, h.horaSalida, h.fecha FROM Turno AS h \n" + 
            "Inner Join Personal AS p ON h.idPersonal = p.idPersonal");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public boolean insertarHorario(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "INSERT INTO Turno(idPersonal, idPorton, horaIngreso, horaSalida, fecha) values (?, ?, ?, ?, ?)"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = getCn().prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idPersonal);
            cmd.setInt(2, idPorton);
            cmd.setString(3, fecha + " " + horaIngreso);
            cmd.setString(4, fecha + " " + horaSalida);
            cmd.setString(5, fecha );
            //Si da error devuelve 1, caso contrario 
            //Tomar en cuenta que el ! es negación
            if(!cmd.execute()){
              res=true;
            }
           
            //cerrando conexion
            cmd.close();
            getCn().close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean modificarHorario(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "UPDATE Turno SET idPersonal = ?, idPorton = ?, horaIngreso = ?, horaSalida = ?, fecha = ? WHERE idTurno = ?"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = getCn().prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idPersonal);
            cmd.setInt(2, idPorton);
            cmd.setString(3, fecha + " " + horaIngreso);
            cmd.setString(4, fecha + " " + horaSalida);
            cmd.setString(5, fecha );
            cmd.setInt(6, idTurno);

            //Si da error devuelve 1, caso contrario 
            //Tomar en cuenta que el ! es negación
            if(!cmd.execute()){
              res=true;
            }
           
            //cerrando conexion
            cmd.close();
            getCn().close();
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
            String sql = "Select h.idTurno, p.idPersonal, p.nombres, p.apellidos, h.idPorton, h.horaIngreso, h.horaSalida, h.fecha FROM Turno AS h \n" + 
            "Inner Join Personal AS p ON h.idPersonal = p.idPersonal \n"+
            "WHERE h.idTurno = ?"; //se pasan por referencia por seguridad //se pasan por referencia por seguridad
            st=getCn().prepareStatement(sql);
            st.setInt(1, busquedaIDTurno);
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
        modelo.addColumn("idPersonal");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("idPorton");
        modelo.addColumn("Hora de ingreso");
        modelo.addColumn("Hora de salida");
        modelo.addColumn("Fecha");
    
        try {
            ResultSet rs = consultarTabla();
            
            while(rs.next()){
                Object [] fila = new Object[8];
                for (int i=0;i<8;i++) fila[i] = rs.getObject(i+1);
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
        modelo.addColumn("idPersonal");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("idPorton");
        modelo.addColumn("Hora de ingreso");
        modelo.addColumn("Hora de salida");
        modelo.addColumn("Fecha");
        
        try {
            ResultSet rs = consultarTablaFiltrada();
            
            while(rs.next()){
                Object [] fila = new Object[8];
                for (int i=0;i<8;i++) fila[i] = rs.getObject(i+1);
                modelo.addRow(fila);
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTablaPorton(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select * FROM Porton");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel generarComboBoxPorton(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaPorton();
            modelo.addElement(new ComboItems( 0,  "Seleccionar Portón:" ) );
            
            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()), rs.getObject(1).toString()));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    public ResultSet consultarTablaPersonal(){
        boolean res = false;
        Statement st;
        ResultSet datos = null;
        try{
            st=getCn().createStatement();
            datos=st.executeQuery("Select p.idPersonal, p.nombres, p.apellidos FROM Personal as p WHERE p.idEstadoPersonal = 1 AND p.idTipoPersonal = 2");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public DefaultComboBoxModel generarComboBoxPersonal(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        try {
            ResultSet rs = consultarTablaPersonal();
            modelo.addElement(new ComboItems( 0,  "Seleccionar Personal:" ) );

            while(rs.next()){
                modelo.addElement(new ComboItems( Integer.parseInt(rs.getObject(1).toString()),  rs.getObject(1).toString() + "- " + rs.getObject(2).toString() + " " + rs.getObject(3).toString() ) );
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
     * @return the idTurno
     */
    public Integer getIdTurno() {
        return idTurno;
    }

    /**
     * @param idTurno the idTurno to set
     */
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    /**
     * @return the idPorton
     */
    public Integer getIdPorton() {
        return idPorton;
    }

    /**
     * @param idPorton the idPorton to set
     */
    public void setIdPorton(Integer idPorton) {
        this.idPorton = idPorton;
    }

    /**
     * @return the horaIngreso
     */
    public String getHoraIngreso() {
        return horaIngreso;
    }

    /**
     * @param horaIngreso the horaIngreso to set
     */
    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
     * @return the busquedaIDTurno
     */
    public Integer getBusquedaIDTurno() {
        return busquedaIDTurno;
    }

    /**
     * @param busquedaIDTurno the busquedaIDTurno to set
     */
    public void setBusquedaIDTurno(Integer busquedaIDTurno) {
        this.busquedaIDTurno = busquedaIDTurno;
    }
    
    
}
