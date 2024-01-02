package com.mycompany.snippts.Snippts;

import java.sql.*;

public class Db {
    public static Connection con(){
        Connection con=null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","Password");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("e");
        }
      return con;  
    }
}
