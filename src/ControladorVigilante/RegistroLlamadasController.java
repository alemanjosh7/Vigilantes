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
public class RegistroLlamadasController {
    
    private Connection cn;
    private Integer idRegistro;
    private Integer idPersonal;
    private Integer idPorton;
    private Integer idResidencia;
    private String fecha;
    private String motivo;
    
    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    

    public Integer getIdRegistro() {
        return idRegistro;
    }
    
    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }
    
    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdPorton() {
        return idPorton;
    }

    public void setIdPorton(Integer idPorton) {
        this.idPorton = idPorton;
    }
    
    public Integer getIdResidencia() {
        return idResidencia;
    }
    
    public void setIdResidencia(Integer idResidencia) {
        this.idResidencia = idResidencia;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }    
     
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

     public RegistroLlamadasController(){
   //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
   
    //método para guardar
    public boolean guardarRegistro(){
        boolean res = false; 
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO RegistroLlamadas(idPersonal, idPorton, idResidencia, fecha, motivoLlamada) values(?,?,?,?,?)"; //se pasan por referencia por seguridad
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la tabla
           //codigoP es como se definio en la clase aunque en la base se llama codigoProyecto
           cmd.setInt(1, idPersonal);
           cmd.setInt(2, idPorton);
           cmd.setInt(3, idResidencia);
           cmd.setString(4, fecha);
           cmd.setString(5, motivo);

            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
           
        }catch(Exception ex ){
            System.out.println(ex.toString());
        }
        return res;
    }
    
    //método para modificar
    public boolean modificarRegistro(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE RegistroLlamadas SET  idPersonal =?, idPorton =?, idResidencia=?, fecha=?, motivoLlamada=? WHERE idRegistroLl=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta        
           cmd.setInt(1, idPersonal);
           cmd.setInt(2, idPorton);
           cmd.setInt(3, idResidencia);
           cmd.setString(4, fecha);
           cmd.setString(5, motivo);
           cmd.setInt(6, idRegistro);

            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();       
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para eliminar
    public boolean eliminarRegistro(){
        boolean res = false;
        try{ //Realizar consulta DELETE
           String sql = "DELETE FROM RegistroLlamadas WHERE idRegistroLl=?";
           PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
           cmd.setInt(1, idRegistro); 
            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para consultar
    public boolean consultarRegistro(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "SELECT * FROM RegistroLlamadas WHERE idRegistroLl =?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setInt(1, idRegistro);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase             
              idRegistro = rs.getInt(1);
              idPersonal = rs.getInt(2);
              idPorton = rs.getInt(3);
              idResidencia = rs.getInt(4);
              fecha = rs.getString(5);
              motivo = rs.getString(6);
             
            }
            //cerrando conexion
            cmd.close();
           
        }catch(Exception e ){
            System.out.println(e.toString());
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
        
        public DefaultComboBoxModel consultarPersonal(){
        DefaultComboBoxModel PersonalList = new DefaultComboBoxModel();
        PersonalList.addElement("Seleccione Personal ");
        ResultSet res = this.consultaDatos("SELECT * FROM TipoPersonal");
        try{
            while (res.next()) {
                PersonalList.addElement(res.getString("idTipoPersonal"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return PersonalList;
    }
        
        public boolean convertirPersonal(String Zonas){
        boolean res = false;
        try{
            String sql = ("SELECT idTipoPersonal FROM TipoPersonal WHERE idTipoPersonal =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Zonas);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdRegistro(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
        
        public DefaultComboBoxModel consultarPorton(){
        DefaultComboBoxModel PortonlList = new DefaultComboBoxModel();
        PortonlList.addElement("Seleccione Porton ");
        ResultSet res = this.consultaDatos("SELECT * FROM Porton");
        try{
            while (res.next()) {
                PortonlList.addElement(res.getString("idPorton"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return PortonlList;
    }
        
        public boolean convertirPorton(String Zonas){
        boolean res = false;
        try{
            String sql = ("SELECT idPorton FROM Porton WHERE idPorton =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Zonas);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdRegistro(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
        
         public DefaultComboBoxModel consultarResidente(){
        DefaultComboBoxModel ResidentelList = new DefaultComboBoxModel();
        ResidentelList.addElement("Seleccione Residente ");
        ResultSet res = this.consultaDatos("SELECT * FROM Residente");
        try{
            while (res.next()) {
                ResidentelList.addElement(res.getString("idResidente"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return ResidentelList;
    }
        
        public boolean convertirResidente(String Zonas){
        boolean res = false;
        try{
            String sql = ("SELECT idResidente FROM Residente WHERE idResidente =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Zonas);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdRegistro(rs.getInt(1));
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
            DefaultTableModel tLlamada = new DefaultTableModel();
            tLlamada.addColumn("Indentificación");
            tLlamada.addColumn("Personal");
            tLlamada.addColumn("Porton");  
            tLlamada.addColumn("Residencia");
            tLlamada.addColumn("Fecha");  
            tLlamada.addColumn("Motivo");
            
            String[] datos = new String[6];
           
            ResultSet res = this.consultaDatos("select RL.idRegistroLl, TP.idTipoPersonal, RL.idPorton, R.nombres, RL.fecha, RL.motivoLlamada from RegistroLlamadas RL join TipoPersonal TP on RL.idPersonal = TP.idTipoPersonal  join Residente R  on RL.idResidencia = R.idResidente");

            try{
                while(res.next()){
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6); 
                tLlamada.addRow(datos);
                }
                }
             catch(Exception ex){
                System.out.println(ex.getMessage());
                }
                return tLlamada;
}
   
    }

    
