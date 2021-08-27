/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorVigilante;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author josue
 */
public class RecuContraController {
    private Connection cn;
    private int id_usuario;
    private String nombre_usuario;
    private String contrasena;
    private int id_tipo_usuario;
    private int id_estado_usuario;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public RecuContraController() {
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
    
    public boolean existenciaCuentaC(String correo){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "SELECT contrasena from Personal Inner Join Usuario on Personal.idPersonal = Usuario.idPersonal where Personal.correo = ?";
       //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Cuenta  ptc2021vigilantes@gmail.com
           //Contraseña ITR2021ptcVigilantes
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setString(1, correo);
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            if(rs.next()){
              contrasena = rs.getString(1);   
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
}

