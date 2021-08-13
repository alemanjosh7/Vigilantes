/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRISTIAN
 */
public class TurnoController {
    
    //Datos a utilizar
    private Connection cn;
    private Integer idTurno;
    private Integer idPersonal;
    private Integer idPorton;
    private String horaIngreso;
    private String horaSalida;
    private String fecha;
 
    
    public TurnoController(){
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
            datos=st.executeQuery("Select * FROM Turno");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public boolean insertarPersonal(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "INSERT INTO Turno(idPersonal, idPorton, horaIngreso, horaSalida, fecha) values (?, ?, ?, ?, ?)"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = getCn().prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idPersonal);
            cmd.setInt(2, idPorton);
            cmd.setString(3, horaIngreso);
            cmd.setString(4, horaSalida);
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
    
    public boolean modificarPersonal(){
        boolean res = false;
        try{ //Realizar consulta INSERT
            String sql = "UPDATE Turnos SET idPersonal = ?, idPorton = ?, horaIngreso = ?, horaSalida = ?, fecha = ? WHERE idTurno = ?"; //se pasan por referencia por seguridad
            //pide importar clase Prepared Statement
            PreparedStatement cmd = getCn().prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la tabla
            cmd.setInt(1, idPorton);
            cmd.setString(2, horaIngreso);
            cmd.setString(3, horaSalida);
            cmd.setString(4, fecha );
            cmd.setInt(5, idPersonal);

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
            String sql = "Select * FROM Turno"; //se pasan por referencia por seguridad //se pasan por referencia por seguridad
            st=getCn().prepareStatement(sql);
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
        modelo.addColumn("idPorton");
        modelo.addColumn("Hora de ingreso");
        modelo.addColumn("Hora de salida");
        modelo.addColumn("Fecha");
    
        try {
            ResultSet rs = consultarTabla();
            
            while(rs.next()){
                Object [] fila = new Object[6];
                for (int i=0;i<6;i++) fila[i] = rs.getObject(i+1);
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
        modelo.addColumn("idPorton");
        modelo.addColumn("Hora de ingreso");
        modelo.addColumn("Hora de salida");
        modelo.addColumn("Fecha");
        
        try {
            ResultSet rs = consultarTablaFiltrada();
            
            while(rs.next()){
                Object [] fila = new Object[6];
                for (int i=0;i<6;i++) fila[i] = rs.getObject(i+1);
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
    
}
