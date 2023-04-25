package tn.enicarthage.club.dbutil;

import java.sql.*;
public class DBUtil {
   private static  Connection  connection=null;
    public static  Connection  getConnection() throws SQLException{
        if(connection!=null) // if the cnx mawjouda
            return connection;
        else {
            String driver= "com.mysql.cj.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/Eniclubs?autoReconnect=true&useSSL=false&createDatabaseIfNotExist=true";
            String user="root";
            String password="";
            try {
                Class.forName(driver);
                connection= DriverManager.getConnection(url, user , password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
