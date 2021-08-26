/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Josue 
 * Clase que permite enlazar con SQL Server
 * Segundo desarrollo de software
 */
public class Conexion {
    public Connection cn = null;

    public Connection conectar(){
     try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //*pedira importar import java.sql.DriverManager;*/
        cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-8K90LO2P\\SQLSERVER; databaseName=TBDS_Sistema_Vigilantes; IntegratedSecurity=true;");
        //"jdbc:sqlserver://LAPTOP-7QMN6CMR\\SQLEXPRESS
        if(cn!=null){
            System.out.println("se conecta");
        }
      }
      catch(Exception ex){
         System.out.println(ex.getMessage());
      }
        return cn;
    }
}
