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
import java.sql.Statement;
/**
 *
 * @author CRISTIAN
 */
public class PersonalController {
    private Connection cn;
    private Integer idPersonal;
    private Integer idTipoPersonal;
    private String nombre; 
    private String apellido;
    private String telefono;
    private String dui;
    private String correo;
    private Integer idEstadoPersonal;
    private Integer idUsuario;
    private Integer salarioMensual;

    public Connection getCn() {
        return cn;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdTipoPersonal() {
        return idTipoPersonal;
    }

    public void setIdTipoPersonal(Integer idTipoPersonal) {
        this.idTipoPersonal = idTipoPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdEstadoPersonal() {
        return idEstadoPersonal;
    }

    public void setIdEstadoPersonal(Integer idEstadoPersonal) {
        this.idEstadoPersonal = idEstadoPersonal;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Integer salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public PersonalController(){
       Conexion con = new Conexion();
       cn = con.conectar();
    }
    
 
    
    
}
