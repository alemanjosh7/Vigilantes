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
public class EntradaController {
    //Atributos de los portones
    private Connection cn;
    private int idRegistroEntrada;
    private int idTipoES;
    private int idVisitante;
    private int idPorton;
    private int idResidencia;
    private String motivoIngreso;
    private String fechaHora;
    private int permisoEntrada;
    private int emergencia;
    private int idPersonal;
    
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
    
    public void setIdTipoES(int idTipoES){
        this.idTipoES = idTipoES;
    }
    //id de el visitante
    public Integer getIdVisitante(){
        return idVisitante;
    }
    
    public void setIdVisitante(int idVisitante){
        this.idVisitante = idVisitante;
    }
    //id de Porton
    public Integer getIdPorton(){
        return idPorton;
    }
    
    public void setIdPorton(int idPorton){
        this.idPorton = idPorton;
    }
    //id de Residencia
    public Integer getIdResidencia(){
        return idResidencia;
    }
    
    public void setIdResidencia(int idResidencia){
        this.idResidencia = idResidencia;
    }    
    //motivo de Entrada
    public String getMotivoEntrada(){
        return motivoIngreso;
    }
    
    public void setMotivoEntrada(String motivoIngreso){
        this.motivoIngreso = motivoIngreso;
    }
    //fecha y hora de la entrada
    public String getFechaHora(){
        return fechaHora;
    }
    
    public void setFechaHora(String fechaHora){
        this.fechaHora = fechaHora;
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

    //Personal que atiende
    public Integer getidPersonal(){
        return idPersonal;
    }
    
    public void setidPersonal(int idPersonal){
        this.idPersonal = idPersonal;
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
            String sql = "INSERT INTO RegistroEntrada(idTipoES, idVisitante, idPorton, idPersonal, residenciaVisita, motivoIngreso, fechaHora, permisoIngreso, emergencia) values (?,?,?,?,?,?,?,?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idVisitante);
            cmd.setInt(3, idPorton);
            cmd.setInt(4, idPersonal);
            cmd.setInt(5, idResidencia);
            cmd.setString(6, motivoIngreso);
            cmd.setString(7, fechaHora);
            cmd.setInt(8,permisoEntrada);
            cmd.setInt(9, emergencia);
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
            String sql = "UPDATE RegistroEntrada SET idTipoES =?, idVisitante =?, idPorton =?, residenciaVisita =?, motivoIngreso =?, fechaHora =?, permisoIngreso =?, emergencia =? WHERE idRegistroIngreso =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idVisitante);
            cmd.setInt(3, idPorton);
            cmd.setInt(4, idResidencia);
            cmd.setString(5, motivoIngreso);
            cmd.setString(6, fechaHora);
            cmd.setInt(7,permisoEntrada);
            cmd.setInt(8, emergencia);
            cmd.setInt(9, idRegistroEntrada);
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
            String sql = "DELETE FROM RegistroEntrada WHERE idRegistroIngreso =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idRegistroEntrada);
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
    
    //Obtener los datos para el combobox de Porton de Salida
    public DefaultComboBoxModel consultarPorton(){
        DefaultComboBoxModel PortonList = new DefaultComboBoxModel();
        PortonList.addElement("Porton de Entrada");
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
        ResultSet res = this.consultaDatos("SELECT * FROM Visitante");
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
    
    //Obtener los datos para el combobox de Porton de Salida
    public DefaultComboBoxModel consultarResidencia(){
        DefaultComboBoxModel ResidenciaList = new DefaultComboBoxModel();
        ResidenciaList.addElement("Residencia");
        ResultSet res = this.consultaDatos("SELECT * FROM Residencia");
        try{
            while (res.next()) {
                ResidenciaList.addElement(res.getString("numeroResidencia"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return ResidenciaList;
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
        int emergencia, entrada;
        ResultSet res = this.consultaDatos("SELECT RE.idRegistroIngreso, V.nombres, V.apellidos, RE.motivoIngreso, TES.descripcion,RE.emergencia, RE.permisoIngreso FROM RegistroEntrada RE JOIN Visitante V  ON RE.idVisitante = V.idVisitante JOIN TipoEntradaSalida TES ON RE.idTipoES = TES.idTipoES");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                emergencia = res.getInt(6);
                if (emergencia == 1) {
                    datos[5] = "SI";
                }
                else{
                    datos[5] = "NO";
                }
                entrada = res.getInt(7);
                if (entrada == 1) {
                    datos[6] = "SI";
                }
                else{
                    datos[6] = "NO";
                }
                tEntrada.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tEntrada;
    }
       
    //Convirtiendo el valor del combobox a Id: Visitante
    public boolean convertirVisitante(String visitante){
        boolean res = false;
        try{
            String sql = ("SELECT idVisitante FROM Visitante WHERE nombres =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, visitante);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdVisitante(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
    
    //Convirtiendo el valor del combobox a Id: TipoES
    public boolean convertirTipoES(String TipoES){
        boolean res = false;
        try{
            String sql = ("SELECT idTipoES FROM TipoEntradaSalida WHERE descripcion =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, TipoES);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdTipoES(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }    
    
    //Convirtiendo el valor del id: Personal
    public boolean convertirPersonal(String nombre, String apellido){
        boolean res = false;
        try{
            String sql = ("SELECT idPersonal FROM Personal WHERE nombres = ? and apellidos = ?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre);
            cmd.setString(2, apellido);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setidPersonal(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();                       
        }
        catch(Exception ex){
            
        }
        return res;
    }
    
    //Convirtiendo el valor del combobox a Id: TipoES
    public boolean convertirResidencia(String residencia){
        boolean res = false;
        try{
            String sql = ("SELECT idResidencia FROM Residencia WHERE numeroResidencia =?");
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, residencia);
            //Ejecutar la consulta
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              setIdResidencia(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            
        }   
        return res;
    }
    
    public boolean consultarEntrada(){
        boolean bres = false;     
        try{
            //Realizar consulta
            String sql = "SELECT * FROM RegistroEntrada WHERE idRegistroIngreso =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idRegistroEntrada);
            ResultSet res = cmd.executeQuery();
            if (res.next()) {
                bres=true;
                idRegistroEntrada = res.getInt(1);
                idTipoES = res.getInt(2);
                idVisitante = res.getInt(3);
                idPorton = res.getInt(4);
                idPersonal = res.getInt(5);
                idResidencia = res.getInt(6);
                motivoIngreso = res.getString(7);
                fechaHora = res.getString(8);
                permisoEntrada = res.getInt(9);
                emergencia = res.getInt(10);
            }
            //cerrando conexion
            cmd.close();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return bres;
    }
    
    public DefaultTableModel filtrarDatosTabla(){
        DefaultTableModel tEntradaFiltrada = new DefaultTableModel();
        tEntradaFiltrada.addColumn("Indentificación");
        tEntradaFiltrada.addColumn("Nombre");
        tEntradaFiltrada.addColumn("Apellido");
        tEntradaFiltrada.addColumn("Motivo");
        tEntradaFiltrada.addColumn("Tipo Entrada");
        tEntradaFiltrada.addColumn("Emergencia");
        tEntradaFiltrada.addColumn("Permitio Entrada");
        
        int emergencia, entrada;
        String[] datos =  new String[7];
        try{
            //Realizar consulta
            String sql = "SELECT RE.idRegistroIngreso, V.nombres, V.apellidos, RE.motivoIngreso, TES.descripcion,RE.emergencia, RE.permisoIngreso FROM RegistroEntrada RE JOIN Visitante V  ON RE.idVisitante = V.idVisitante JOIN TipoEntradaSalida TES ON RE.idTipoES = TES.idTipoES WHERE idRegistroIngreso =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idRegistroEntrada);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                emergencia = res.getInt(6);
                if (emergencia == 1) {
                    datos[5] = "SI";
                }
                else{
                    datos[5] = "NO";
                }
                entrada = res.getInt(7);
                if (entrada == 1) {
                    datos[6] = "SI";
                }
                else{
                    datos[6] = "NO";
                }
                tEntradaFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tEntradaFiltrada; 
    }
    
    
    public DefaultTableModel DatosTablaTecleado(){
        DefaultTableModel tEntradaFiltrada = new DefaultTableModel();
        tEntradaFiltrada.addColumn("Indentificación");
        tEntradaFiltrada.addColumn("Nombre");
        tEntradaFiltrada.addColumn("Apellido");
        tEntradaFiltrada.addColumn("Motivo");
        tEntradaFiltrada.addColumn("Tipo Entrada");
        tEntradaFiltrada.addColumn("Emergencia");
        tEntradaFiltrada.addColumn("Permitio Entrada");

        int emergencia, entrada;        
        String[] datos =  new String[7];
        try{
            //Realizar consulta
            String sql = "SELECT RE.idRegistroIngreso, V.nombres, V.apellidos, RE.motivoIngreso, TES.descripcion,RE.emergencia, RE.permisoIngreso FROM RegistroEntrada RE JOIN Visitante V  ON RE.idVisitante = V.idVisitante JOIN TipoEntradaSalida TES ON RE.idTipoES = TES.idTipoES WHERE idRegistroIngreso LIKE CONCAT('%',?,'%')";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idRegistroEntrada);
            ResultSet res = cmd.executeQuery();
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                emergencia = res.getInt(6);
                if (emergencia == 1) {
                    datos[5] = "SI";
                }
                else{
                    datos[5] = "NO";
                }
                entrada = res.getInt(7);
                if (entrada == 1) {
                    datos[6] = "SI";
                }
                else{
                    datos[6] = "NO";
                }
                tEntradaFiltrada.addRow(datos);                      
            }        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());            
        }
        return tEntradaFiltrada; 
    }    
}
