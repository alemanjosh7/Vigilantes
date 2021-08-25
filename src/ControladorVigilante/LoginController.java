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

/**
 *
 * @author josue
 */
public class LoginController {
    private Connection cn;
    private int id_usuario;
    private String nombre_usuario;
    private String contrasena;
    private int id_tipo_usuario;
    private int id_estado_usuario;
    private String correo;
    private String nombres;
    private String apellidos;
    private String nombreTipo;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LoginController() {
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
    
    public int existenciaUsuario(String nombre, String contrasena){
        try{ //Realizar consulta UPDATE
           String sql = "SELECT idUsuario, idTipoUsuario, idEstadoUsuario, count(idUsuario) FROM Usuario where nombreUsuario = ? and contrasena = ? GROUP BY idUsuario, idTipoUsuario, idEstadoUsuario";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, nombre);
           cmd.setString(2, contrasena);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
                id_usuario = rs.getInt(1);
                id_tipo_usuario = rs.getInt(2);
                id_estado_usuario = rs.getInt(3);
                
                return rs.getInt(4);
              //asignándole a los atributos de la clase
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return 0;
    }
    
    public boolean consultarRolYDatos(int idUsuario){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "SELECT nombres, apellidos, nombreTipo from TipoPersonal, Personal Inner Join Usuario on Personal.idPersonal = Usuario.idPersonal where Usuario.idUsuario = ? and Personal.idTipoPersonal = TipoPersonal.idTipoPersonal";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setInt(1, idUsuario);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              nombres = rs.getString(1);
              apellidos = rs.getString(2);
              nombreTipo = rs.getString(3);
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    
}
