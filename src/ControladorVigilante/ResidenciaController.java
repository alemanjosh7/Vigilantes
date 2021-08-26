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
 * @author CRISTIAN
 */
public class ResidenciaController {
    private Connection cn;
    private Integer idResidencia;
    private Integer numeroResidencia;
    private String direccionResidencia;
    private Integer idZona;
    private Integer idResidente;
    
    
      //get -- set
    public Connection getCn(){
        return cn;
    }
    
    public void setCn(Connection cn) {
        this.cn = cn;
    }  
    
    public Integer getIdResidencia(){
        return idResidencia;
    }
    
    public void setIdResidencia(Integer numeroResidencia){
        this.idResidencia = numeroResidencia;
    }
    
    //NumeroResidencia
    public Integer getNumeroResidencia(){
        return numeroResidencia;
    }
    
    public void setNumeroResidencia(Integer numeroResidencia){
        this.numeroResidencia = numeroResidencia;
    }
    
    //Direccion Residencia
    public String getDireccionResidencia(){
        return direccionResidencia;
    }
    
    public void setDireccionResidencia(String direccionResidencia){
        this.direccionResidencia = direccionResidencia;
    }
    
    //Id Zona
    public Integer getIdZona(){
        return idZona;
    }
    
    public void setIdZona(Integer idZona){
        this.idZona = idZona;
    }
    
    //Id Residente
    public Integer getIdResidente(){
        return idResidente;
    }
    
    public void setIdResidente(Integer idResidente){
        this.idResidente = idResidente;
    }
     
    public ResidenciaController(){
   //Establecemos la conexion
      Conexion con = new Conexion();
       cn = con.conectar();
    }
   
    //método para guardar
    public boolean guardarResidencia(){
        boolean res = false; 
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO Residencia (numeroResidencia, direccionResidencia, idZona, idResidente) values (?,?,?,?)";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);                           
           cmd.setInt(1, numeroResidencia);
           cmd.setString(2, direccionResidencia);
           cmd.setInt(3, idZona);
           cmd.setInt(4, idResidente);           
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
    
    //método para modificar
    public boolean modificarResidencia(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE Residencia SET  numeroResidencia =?, direccionResidencia =?, idZona=?, idResidente=? WHERE idResidencia=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);                  
           cmd.setInt(1, numeroResidencia);
           cmd.setString(2, direccionResidencia);
           cmd.setInt(3, idZona);
           cmd.setInt(4, idResidente); 
           cmd.setInt(5, idResidencia); 
          
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();          
        }
        catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para eliminar
    public boolean eliminarResidencia(){
        boolean res = false;
        try{ //Realizar consulta DELETE
           String sql = "DELETE FROM Residencia WHERE idResidencia=?";
           PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
           cmd.setInt(1, idResidencia);            
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
    
  public boolean consultarResidencia(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "SELECT * FROM Residencia WHERE idResidencia =?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setInt(1, idResidencia);        
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase            
              idResidencia = rs.getInt(1);
              numeroResidencia = rs.getInt(2);
              direccionResidencia = rs.getString(3);
              idZona = rs.getInt(4);
              idResidente = rs.getInt(5);             
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
        
        public DefaultComboBoxModel consultarZona(){
        DefaultComboBoxModel ZonasList = new DefaultComboBoxModel();
        ZonasList.addElement("Seleccione Zona");
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
    public DefaultComboBoxModel consultarResidente(){
        DefaultComboBoxModel ResidenteList = new DefaultComboBoxModel();
        ResidenteList.addElement("Seleccione Residente");
        ResultSet res = this.consultaDatos("SELECT * FROM Residente");
        try{
            while (res.next()) {
                ResidenteList.addElement(res.getString("nombres"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return ResidenteList;
    }
    
    public boolean convertirZona(String Zonas){
        boolean res = false;
        try{
            String sql = ("SELECT idZona FROM Zonas WHERE nombreZona =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Zonas);
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
    public boolean convertirResidente(String Residente){
        boolean res = false;
        try{
            String sql = ("SELECT idResidente FROM Residente WHERE nombres =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, Residente);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdResidente(rs.getInt(1));
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
            DefaultTableModel tResidencia = new DefaultTableModel();
            tResidencia.addColumn("Indentificación");
            tResidencia.addColumn("Numero");
            tResidencia.addColumn("Direccion");  
            tResidencia.addColumn("Zona");
            tResidencia.addColumn("Residente");  
            String[] datos = new String[5];         
            ResultSet res = this.consultaDatos("select R.idResidencia, R.numeroResidencia, R.direccionResidencia, Z.nombreZona, RD.nombres from Residencia R join Zonas Z on R.idZona = Z.idZona  join Residente RD  on R.idResidente = RD.idResidente");

            try{
                while(res.next()){
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tResidencia.addRow(datos);
                }
                }
             catch(Exception ex){
                System.out.println(ex.getMessage());
                }
                return tResidencia;
}
        
         public DefaultTableModel DatosTablaTecleado(){
           DefaultTableModel tResidencia = new DefaultTableModel();
            tResidencia.addColumn("Indentificación");
            tResidencia.addColumn("Numero");
            tResidencia.addColumn("Direccion");  
            tResidencia.addColumn("Zona");
            tResidencia.addColumn("Residente");                
            String[] datos = new String[5];         
           try{
            //Realizar consulta
            String sql = "select R.idResidencia, R.numeroResidencia, R.direccionResidencia, Z.nombreZona, RD.nombres from Residencia R join Zonas Z on R.idZona = Z.idZona  join Residente RD  on R.idResidente = RD.idResidente WHERE idResidencia LIKE CONCAT('%',?,'%')";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idResidencia);                                
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tResidencia.addRow(datos);                      
            }            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tResidencia;
    }
         
    public DefaultTableModel filtrarDatosTabla(){
        DefaultTableModel tResidenteFiltrada = new DefaultTableModel();
        tResidenteFiltrada.addColumn("Indentificación");
        tResidenteFiltrada.addColumn("Numero");
        tResidenteFiltrada.addColumn("Direccion");
        tResidenteFiltrada.addColumn("Zona");
        tResidenteFiltrada.addColumn("Residente");           
        String[] datos =  new String[5];
        try{
            //Realizar consulta
            String sql = "select R.idResidencia, R.numeroResidencia, R.direccionResidencia, Z.nombreZona, RD.nombres from Residencia R join Zonas Z on R.idZona = Z.idZona  join Residente RD  on R.idResidente = RD.idResidente WHERE idResidencia =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idResidente);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tResidenteFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tResidenteFiltrada; 
    }
    
    public DefaultTableModel filtrarDatosTablaNum(){
        DefaultTableModel tResidenteFiltrada = new DefaultTableModel();
        tResidenteFiltrada.addColumn("Indentificación");
        tResidenteFiltrada.addColumn("Numero");
        tResidenteFiltrada.addColumn("Direccion");
        tResidenteFiltrada.addColumn("Zona");
        tResidenteFiltrada.addColumn("Residente");           
        String[] datos =  new String[5];
        try{
            //Realizar consulta
            String sql = "select R.idResidencia, R.numeroResidencia, R.direccionResidencia, Z.nombreZona, RD.nombres from Residencia R join Zonas Z on R.idZona = Z.idZona  join Residente RD  on R.idResidente = RD.idResidente WHERE numeroResidencia LIKE CONCAT('%',?,'%')";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, numeroResidencia);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tResidenteFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tResidenteFiltrada; 
    }    
}
