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
 * @author ALFARO
 */
public class ClaseRegistroLlamadas {
 public Connection conectar(){
        
     Connection cn = null;
     try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //*pedira importar import java.sql.DriverManager;*/
        cn = DriverManager.getConnection("jdbc:sqlserver: DESKTOP-QJCLPUN\\SQLEXPRESS; databaseName=TBDS_Sistema_Vigilante; IntegratedSecurity=true;");
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

