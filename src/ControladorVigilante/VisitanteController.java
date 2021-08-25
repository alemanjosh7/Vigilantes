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
 * @author ALFARO
 */
public  class VisitanteController {
    
    private Connection cn;
    private Integer idVisitante;
    private String nombre;
    private String apellido;
    private String DUI;
    private String NIT;
    private Integer edad;
    
      //get -- set
    public Connection getCn(){
        return cn;
    }
    
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    //Id de Visitante
    public Integer getIdVisitante(){
        return idVisitante;
    }
    
    public void setIdVisitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }
    //Nombre
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Apellido
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    //DUI
    public String getDUI(){
        return DUI;
    }
    
    public void setDUI(String DUI){
        this.DUI = DUI;
    }
    
    //NIT
    public String getNIT(){
        return NIT;
    }
    
    public void setNIT(String NIT){
        this.NIT = NIT;
    }
    
    //Id Residente
    public Integer getEdad(){
        return edad;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    
    public VisitanteController(){
   //Establecemos la conexion
      Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //método para guardar 
    public boolean guardarVisitante(){
        boolean res = false; 
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO Visitante (nombres, apellidos, dui, nit, mayoriaEdad) values(?,?,?,?,?)";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);                   
           cmd.setString(1, nombre);
           cmd.setString(2, apellido);
           cmd.setString(3, DUI);
           cmd.setString(4, NIT);
           cmd.setInt(5, edad);           
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            
        }
        catch(Exception ex ){
            System.out.println(ex.toString());
        }
        return res;
    }
    public boolean modificarVisitante(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE Visitante SET  nombres =?, apellidos =?, dui=?, nit=?, mayoriaEdad=? WHERE idVisitante=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);                   
           cmd.setString(1, nombre);
           cmd.setString(2, apellido);
           cmd.setString(3, DUI);
           cmd.setString(4, NIT);
           cmd.setInt(5, edad);
           cmd.setInt(6, idVisitante);             
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            
        }
        catch(Exception ex ){
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
    
  //Generar la tabla de Entrada
        public DefaultTableModel consultarDatosTabla(){
            DefaultTableModel tVisitante = new DefaultTableModel();
            tVisitante.addColumn("Indentificación");
            tVisitante.addColumn("Nombre");
            tVisitante.addColumn("Apellido");  
            tVisitante.addColumn("DUI");
            tVisitante.addColumn("NIT");
            tVisitante.addColumn("Edad");
            String[] datos = new String[6];
            int MayorEdad;
            ResultSet res = this.consultaDatos("select V.idVisitante, V.nombres, V.apellidos, V.dui, V.nit, V.mayoriaEdad from Visitante V");

            try{
                while(res.next()){
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                
                MayorEdad = res.getInt(6);             
                if(MayorEdad==1){
                datos[5]="SI";
                }
                else{
                datos[5]="NO";
                }               
                tVisitante.addRow(datos);
                }
                }
             catch(Exception ex){
                System.out.println(ex.getMessage());
                }
                return tVisitante;
}
   public boolean consultarVisitante(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM Visitante WHERE idVisitante =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idVisitante);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idVisitante = res.getInt(1);
                nombre = res.getString(2);
                apellido = res.getString(3);
                DUI = res.getString(4);
                NIT = res.getString(5);
                edad = res.getInt(6);
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return bres;
    }
   
   public DefaultTableModel DatosTablaTecleado(){
           DefaultTableModel tVisitante = new DefaultTableModel();
            tVisitante.addColumn("Indentificación");
            tVisitante.addColumn("Nombre");
            tVisitante.addColumn("Apellido");  
            tVisitante.addColumn("DUI");
            tVisitante.addColumn("NIT");
            tVisitante.addColumn("Edad");        
            String[] datos = new String[6];         
           try{
            //Realizar consulta
            String sql = "select V.idVisitante, V.nombres, V.apellidos, V.dui, V.nit, V.mayoriaEdad from Visitante V WHERE idVisitante LIKE CONCAT('%',?,'%')";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idVisitante);                     
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6);
                tVisitante.addRow(datos);                      
            }            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tVisitante;
    }
   public DefaultTableModel filtrarDatosTabla(){
        DefaultTableModel tVisitantesFiltrada = new DefaultTableModel();
        tVisitantesFiltrada.addColumn("Indentificación");
        tVisitantesFiltrada.addColumn("Nombre");
        tVisitantesFiltrada.addColumn("Apellido");
        tVisitantesFiltrada.addColumn("DUI");
        tVisitantesFiltrada.addColumn("NIT");
        tVisitantesFiltrada.addColumn("Edad");             
        String[] datos =  new String[6];
        try{
            //Realizar consulta
            String sql = "select V.idVisitante, V.nombres, V.apellidos, V.dui, V.nit, V.mayoriaEdad from Visitante V WHERE idVisitante=?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idVisitante);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6);
                tVisitantesFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tVisitantesFiltrada; 
    }
}
 