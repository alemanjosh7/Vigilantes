/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author CRISTIAN
 */
public class Conexion {
    public Connection conectar(){
        Connection cn = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //*pedira importar import java.sql.DriverManager;*//
            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-8K90LO2P\\SQLEXPRESS; databaseName=TBDS_Sistema_Vigilantes; IntegratedSecurity=true;");
            if (cn!=null) {
                System.out.println("conexión exitosa");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}
