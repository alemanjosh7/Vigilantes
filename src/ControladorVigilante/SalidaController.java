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
public class SalidaController {
    //Atributos de los portones
    private Connection cn;
    private int idRegistroSalida;
    private int idTipoES;
    private int idPorton;
    private int idVisitante;

    
     //get -- set
    
    public Connection getCn(){
        return cn;
    }
    
    //id de el Registro de la salida
    public Integer getIdRegistroSalida(){
        return idRegistroSalida;
    }
    
    public void setIdRegistroSalida(int idRegistroSalida){
        this.idRegistroSalida = idRegistroSalida;
    }

    //id de el tipo de la Entrada o Salida
    public Integer getIdTipoES(){
        return idTipoES;
    }
    
    public void setIdIdTipoES(int idTipoES){
        this.idTipoES = idTipoES;
    }    
    
    //Id del Porton
    public Integer getIdPorton(){
        return idPorton;
    }
    
    public void setIdPorton(int idPorton){
        this.idPorton = idPorton;
    }
    
    //id de el visitante
    public Integer getIdVisitante(){
        return idVisitante;
    }
    
    public void setIdVisitante(int idVisitante){
        this.idVisitante = idVisitante;
    }
    
    //Estableciendo la conexión en el constructor
    public SalidaController(){
    //Establecemos la conexion
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
    
    //Guardar los datos
    public boolean guardarSalida(){
        boolean res = false;
        try{
            String sql = "INSERT INTO RegistroSalida(idTipoES, idPorton, idVisitante) values (?,?,?) ";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idPorton);
            cmd.setInt(3, idVisitante);
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
    public boolean modificarSalida(){
        boolean res = false;
        try{
            String sql = "UPDATE RegistroSalida SET idTipoES =?, idPorton =?, idVisitante =? WHERE idRegistroSalida =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1,idTipoES);
            cmd.setInt(2, idPorton);
            cmd.setInt(3, idVisitante);
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
    public boolean eliminarSalida(){
        boolean res = false;
        try{
            String sql = "DELETE FROM RegistroSalida WHERE idRegistroSalida =?";//se pasan por referencia por seguridad
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idRegistroSalida);
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
            cn.close();
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
              setIdIdTipoES(rs.getInt(1));
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }
        catch(Exception ex){
            
        }   
        return res;
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
    
    //Obtener los datos para el combobox de Tipo Porton
    public DefaultComboBoxModel consultarTipoPorton(){
        DefaultComboBoxModel TipoPortonList = new DefaultComboBoxModel();
        TipoPortonList.addElement("Tipo de Porton");
        ResultSet res = this.consultaDatos("SELECT * FROM TipoPorton");
        try{
            while (res.next()) {
                TipoPortonList.addElement(res.getString("descripciónTipoPorton"));
            }
            res.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return TipoPortonList;
    }
    
    //Generar la tabla de Salida
    public DefaultTableModel consultarDatosTabla(){
        DefaultTableModel tSalida = new DefaultTableModel();
        tSalida.addColumn("Indentificación");
        tSalida.addColumn("Porton");
        tSalida.addColumn("Tipo Salida");
        tSalida.addColumn("Nombre");
        tSalida.addColumn("Apellido");
                
        String[] datos =  new String[5];
        ResultSet res = this.consultaDatos("SELECT RS.idRegistroSalida, P.idPorton, TES.descripcion, V.nombres, V.apellidos FROM RegistroSalida RS JOIN Porton P ON RS.idPorton = P.idPorton JOIN TipoEntradaSalida TES ON RS.idTipoES = TES.idTipoES JOIN Visitante v ON RS.idVisitante = V.idVisitante");

        try{            
            while(res.next()){
                datos[0] = res.getString(1);    
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                tSalida.addRow(datos);                      
            }
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tSalida;
    }    
    
}