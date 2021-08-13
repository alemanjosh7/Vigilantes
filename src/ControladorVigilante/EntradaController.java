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
public class EntradaController {
    //Atributos de los portones
    private Connection cn;
    private int idRegistroEntrada;
    private int idTipoES;
    private int idVisitante;
    private String motivoIngreso;
    private int permisoEntrada;
    private int emergencia;
    
    //get -- set
    
    public Connection getCn(){
        return cn;
    }
    
    //id de el Registro de la entrada
    public Integer getIdRegistroEntrada(){
        return idRegistroEntrada;
    }
    
    public void setIdRegistroEntrada(int idRegistroEntrada){
        this.idRegistroEntrada = idRegistroEntrada;
    }
    //id de el tipo de la Entrada o Salida
    public Integer getIdTipoES(){
        return idTipoES;
    }
    
    public void setIdIdTipoES(int idTipoES){
        this.idTipoES = idTipoES;
    }
    //id de el visitante
    public Integer getIdVisitante(){
        return idVisitante;
    }
    
    public void setIdVisitante(int idVisitante){
        this.idVisitante = idVisitante;
    }
    //motivo de Entrada
    public String getMotivoEntrada(){
        return motivoIngreso;
    }
    
    public void setMotivoEntrada(String motivoIngreso){
        this.motivoIngreso = motivoIngreso;
    }
    
    //¿Se le accedio permiso para entrar?
    public Integer getPermisoEntrada(){
        return permisoEntrada;
    }
    
    public void setPermisoEntrada(int permisoEntrada){
        this.permisoEntrada = permisoEntrada;
    }
    
    //¿Era una emergencia?
    public Integer getEmergencia(){
        return emergencia;
    }
    
    public void setEmergencia(int emergencia){
        this.emergencia = emergencia;
    }

    //Estableciendo la conexión en el constructor
    public EntradaController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    //Guardar los datos
    public boolean guardarEntradas(){
        boolean res = false;
        try{
            String sql = "INSERT INTO RegistroEntrada(idTipoES, idVisitante, motivoIngreso, permisoIngreso, emergencia) values (?,?,?,?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idVisitante);
            cmd.setString(3, motivoIngreso);
            cmd.setInt(4,permisoEntrada);
            cmd.setInt(5, emergencia);
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
    public boolean modificarZona(){
        boolean res = false;
        try{
            String sql = "UPDATE RegistroEntrada SET idTipoES =?, idVisitante =?, motivoIngreso =?, permisoEntrada =?, emergencia =? WHERE idRegistroIngreso =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idVisitante);
            cmd.setString(3, motivoIngreso);
            cmd.setInt(4,permisoEntrada);
            cmd.setInt(5, emergencia);
            cmd.setInt(6, idRegistroEntrada);
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
    public boolean eliminarZona(){
        boolean res = false;
        try{
            String sql = "DELETE FROM RegistroEntrada WHERE idRegistroIngreso =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idRegistroEntrada);
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
    
    //Obtener los datos para el combobox de Porton de Salida
    public DefaultComboBoxModel consultarPorton(){
        DefaultComboBoxModel PortonList = new DefaultComboBoxModel();
        PortonList.addElement("Porton de Salida");
        ResultSet res = this.consultaDatos("SELECT * FROM Porton");
        try{
            while (res.next()) {
                PortonList.addElement(res.getString("idPorton"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return PortonList;
    }
    
    //Obtener los datos para el combobox del Visitante
    public DefaultComboBoxModel consultarVisitante(){
        DefaultComboBoxModel VisitanteList = new DefaultComboBoxModel();
        VisitanteList.addElement("Seleccione visitante");
        ResultSet res = this.consultaDatos("SELECT * FROM Visitante order by apellidos");
        try{
            while (res.next()) {
                VisitanteList.addElement(res.getString("nombres"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return VisitanteList;
    }
    
    //Obtener los datos para el combobox de Tipo de Entrada/Salida
    public DefaultComboBoxModel consultarTipoEntrada(){
        DefaultComboBoxModel TipoEntradaList = new DefaultComboBoxModel();
        TipoEntradaList.addElement("Tipo de Entrada");
        ResultSet res = this.consultaDatos("SELECT * FROM TipoEntradaSalida");
        try{
            while (res.next()) {
                TipoEntradaList.addElement(res.getString("descripcion"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return TipoEntradaList;
    }
   
    //Generar la tabla de Entrada
    public DefaultTableModel consultarDatosTabla(){
        DefaultTableModel tEntrada = new DefaultTableModel();
        tEntrada.addColumn("Indentificación");
        tEntrada.addColumn("Nombre");
        tEntrada.addColumn("Apellido");
        tEntrada.addColumn("Motivo");
        tEntrada.addColumn("Tipo Entrada");
        tEntrada.addColumn("Emergencia");
        tEntrada.addColumn("Permitio Entrada");
                
        String[] datos =  new String[7];
        ResultSet res = this.consultaDatos("SELECT RE.idRegistroIngreso, V.nombres, V.apellidos, RE.motivoIngreso, TES.descripcion,RE.emergencia, RE.permisoIngreso FROM RegistroEntrada RE JOIN Visitante V  ON RE.idVisitante = V.idVisitante JOIN TipoEntradaSalida TES ON RE.idTipoES = TES.idTipoES");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6);
                datos[6] = res.getString(7);
                tEntrada.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tEntrada;
    }
}
