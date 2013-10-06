/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metroprasad;

import java.sql.Connection;
import java.sql.*;
import javax.sql.*;

/**
 *
 * @author PRASAD
 */
public class MetroPrasad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GUI_project.InterfaceProject m = new GUI_project.InterfaceProject();
        m.setVisible(true);
        
        // TODO code application logic here
        
//        String connectionString = "jdbc:sqlserver://wworkstation id=metroDB.mssql.somee.com;packet size=4096;user id=prasad1991_SQLLogin_1;pwd=zzaggfe73f;data source=metroDB.mssql.somee.com;persist security info=False;initial catalog=metroDB;";
//        String query = "Select * FROM products";
//        String result;
//
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection (connectionString);
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//
//            while (rs.next()) 
//            {
//                result = rs.getString(1);
//                System.out.println(result);
//            } 
//        con.close();
//
//            } 
//
//        catch(Exception e) 
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
