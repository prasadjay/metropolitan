/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Global_Sources;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author PRASAD
 */
public class IReportViewer extends JFrame{
    
  
    
     public IReportViewer(String fileName)
    {
        this(fileName,null);
    }
    
    public IReportViewer(String fileName, HashMap parameter)
    {
        //call a constructor in JFrame class
        super("View Report");

        //try block
       try
        {
            //Way 1 to call iReports
            //JasperDesign jasperDesign = JasperManager.loadXmlDesign(fileName);
            //JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            //JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, DBOptions.con);

            //Way 2 to call iReports
            //Here the file name must be a ".jrxml" file
            //JasperReport jasperReport = JasperCompileManager.compileReport(fileName);
            //JasperPrint print = JasperFillManager.fillReport(fileName, parameter,DBOptions.con);

            //Way 3 (Here the filename should be in .jasper extension i.e., the compiled report)
            Connection gg = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_mysql", "root", "33235000");
            JasperPrint print = JasperFillManager.fillReport(fileName, parameter,gg);

            JRViewer viewer = new JRViewer(print);

            //get content pane
            Container c = getContentPane();
            //add the report to the frame
            c.add(viewer);
        }
        //catch(ClassNotFoundException cnfe)
       // {
       //     cnfe.printStackTrace();
       // }
        catch(SQLException sqle)
        {
           sqle.printStackTrace();
        }
       catch(JRException jre)
       {
           jre.printStackTrace();
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        setBounds(10,10,600,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here

        //way 1 - call a report without passing parameters
        //Here you must make sure that you provide the correct path to .jsper file
        //This is the one
        //IReportViewer viewer = new IReportViewer("./reports/report1.jasper");

        //way 2 - call a report by passing parameters
        //you may pass any number of parameters. All the parameters must added
        //to the hash map
        HashMap param = new HashMap();
        //param.put("reportParameterName",valueForTheParameter);
        //MyReportViewer viewer = new MyReportViewer("Report File Name With Extension",param);
        //
        //This is the one
       // viewer.setVisible(true);
    }
    
}
