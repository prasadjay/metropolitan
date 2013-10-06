/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_project;

import Global_Sources.Dbconnect;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PRASAD
 */
public class ViewDetailedProject extends javax.swing.JFrame {

     Dbconnect db1 = new Dbconnect();
    Connection con1 = db1.connect();
    
    /**
     * Creates new form Sub_Interface
     */
    public ViewDetailedProject() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
//        if(Data.Login.getPre_UI_type()==1 || Data.Login.getPre_UI_type()==2 )
//        {
//          animation_Start a = new animation_Start(getWidth(), getHeight());
//          setVisible(true);
//          a.start();
//        }
        
        String tempKey = staticData.getTempProjectData();
        System.out.println(tempKey);
        
        //getting count of items
        
        String gene = "select count(*) as 'field' from item where iPID = '"+tempKey+"'";
   
        int num=0;
      
        
        ResultSet count13 = db1.executeSQLQuery(gene);
        
        try
        {
            if(count13.next())
            {
                num += Integer.parseInt(count13.getString("field"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        
        
        
        //load data
        
        
        
        String pro = "select * from project where pID = '"+tempKey+"'";
       
        
        ResultSet result1= db1.executeSQLQuery(pro);
        
        
        try
        {
        while(result1.next())
        {
            this.txtProID1.setText(result1.getString("pID"));
            this.txtName.setText(result1.getString("pName"));
            this.jTextField21.setText(getDateInString(result1.getDate("pEndDate")));
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        
        //loading item data
        
        String itm = "select * from item where iPID = '"+tempKey+"'";
       
        
        ResultSet result2= db1.executeSQLQuery(itm);
        
        if(num==1)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
        
        //2 ................................
        
         if(num==2)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
         
         //3 ................................
        
         if(num==3)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
           //4 ................................
        
         if(num==4)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
          //5 ................................
        
         if(num==5)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
        
         
          //6 ................................
        
         if(num==6)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem16.setText(result2.getString("iName"));
            this.txtQ16.setText(result2.getString("iQtyA"));
            this.jTextField6.setText(result2.getString("iGdate"));
            this.jTextField16.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
          //7 ................................
        
         if(num==7)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem16.setText(result2.getString("iName"));
            this.txtQ16.setText(result2.getString("iQtyA"));
            this.jTextField6.setText(result2.getString("iGdate"));
            this.jTextField16.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem17.setText(result2.getString("iName"));
            this.txtQ17.setText(result2.getString("iQtyA"));
            this.jTextField7.setText(result2.getString("iGdate"));
            this.jTextField17.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
         //8 ................................
        
         if(num==8)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem16.setText(result2.getString("iName"));
            this.txtQ16.setText(result2.getString("iQtyA"));
            this.jTextField6.setText(result2.getString("iGdate"));
            this.jTextField16.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem17.setText(result2.getString("iName"));
            this.txtQ17.setText(result2.getString("iQtyA"));
            this.jTextField7.setText(result2.getString("iGdate"));
            this.jTextField17.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem18.setText(result2.getString("iName"));
            this.txtQ18.setText(result2.getString("iQtyA"));
            this.jTextField8.setText(result2.getString("iGdate"));
            this.jTextField18.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
         
         //9 ................................
        
         if(num==9)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem16.setText(result2.getString("iName"));
            this.txtQ16.setText(result2.getString("iQtyA"));
            this.jTextField6.setText(result2.getString("iGdate"));
            this.jTextField16.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem17.setText(result2.getString("iName"));
            this.txtQ17.setText(result2.getString("iQtyA"));
            this.jTextField7.setText(result2.getString("iGdate"));
            this.jTextField17.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem18.setText(result2.getString("iName"));
            this.txtQ18.setText(result2.getString("iQtyA"));
            this.jTextField8.setText(result2.getString("iGdate"));
            this.jTextField18.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem19.setText(result2.getString("iName"));
            this.txtQ19.setText(result2.getString("iQtyA"));
            this.jTextField9.setText(result2.getString("iGdate"));
            this.jTextField19.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        }
         
         
          //10 ................................
        
         if(num==10)
        {
        try
        {
        result2.next();
        
            this.txtItem11.setText(result2.getString("iName"));
            this.txtQ11.setText(result2.getString("iQtyA"));
            this.jTextField1.setText(result2.getString("iGdate"));
            this.jTextField11.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem12.setText(result2.getString("iName"));
            this.txtQ12.setText(result2.getString("iQtyA"));
            this.jTextField2.setText(result2.getString("iGdate"));
            this.jTextField12.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem13.setText(result2.getString("iName"));
            this.txtQ13.setText(result2.getString("iQtyA"));
            this.jTextField3.setText(result2.getString("iGdate"));
            this.jTextField13.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem14.setText(result2.getString("iName"));
            this.txtQ14.setText(result2.getString("iQtyA"));
            this.jTextField4.setText(result2.getString("iGdate"));
            this.jTextField14.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem15.setText(result2.getString("iName"));
            this.txtQ15.setText(result2.getString("iQtyA"));
            this.jTextField5.setText(result2.getString("iGdate"));
            this.jTextField15.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem16.setText(result2.getString("iName"));
            this.txtQ16.setText(result2.getString("iQtyA"));
            this.jTextField6.setText(result2.getString("iGdate"));
            this.jTextField16.setText(result2.getString("iSupplier"));
            
             result2.next();
        
            this.txtItem17.setText(result2.getString("iName"));
            this.txtQ17.setText(result2.getString("iQtyA"));
            this.jTextField7.setText(result2.getString("iGdate"));
            this.jTextField17.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem18.setText(result2.getString("iName"));
            this.txtQ18.setText(result2.getString("iQtyA"));
            this.jTextField8.setText(result2.getString("iGdate"));
            this.jTextField18.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem19.setText(result2.getString("iName"));
            this.txtQ19.setText(result2.getString("iQtyA"));
            this.jTextField9.setText(result2.getString("iGdate"));
            this.jTextField19.setText(result2.getString("iSupplier"));
            
            result2.next();
        
            this.txtItem20.setText(result2.getString("iName"));
            this.txtQ20.setText(result2.getString("iQtyA"));
            this.jTextField10.setText(result2.getString("iGdate"));
            this.jTextField20.setText(result2.getString("iSupplier"));
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD!", 1);
        }
        }
        
        
        
        //loading data ends here
        
    }

     public String getDateInString(Date d)
    {
     
        String year = Integer.toString(d.getYear()+1900);
        String month = Integer.toString(d.getMonth()+1);
        String date = Integer.toString(d.getDate());
        
        String temp = year+"/"+month+"/"+date+"/";
        return temp;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtProID1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtItem11 = new javax.swing.JTextField();
        txtItem12 = new javax.swing.JTextField();
        txtItem13 = new javax.swing.JTextField();
        txtItem14 = new javax.swing.JTextField();
        txtItem15 = new javax.swing.JTextField();
        txtItem16 = new javax.swing.JTextField();
        txtItem17 = new javax.swing.JTextField();
        txtItem18 = new javax.swing.JTextField();
        txtItem19 = new javax.swing.JTextField();
        txtItem20 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtQ11 = new javax.swing.JTextField();
        txtQ12 = new javax.swing.JTextField();
        txtQ13 = new javax.swing.JTextField();
        txtQ14 = new javax.swing.JTextField();
        txtQ15 = new javax.swing.JTextField();
        txtQ16 = new javax.swing.JTextField();
        txtQ17 = new javax.swing.JTextField();
        txtQ18 = new javax.swing.JTextField();
        txtQ19 = new javax.swing.JTextField();
        txtQ20 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Serial NO");

        jLabel6.setText("Commissioned date  ");

        jLabel7.setText("Delivered  time ");

        jLabel8.setText("Genset Model");

        jLabel9.setText("Genset S/N");

        jLabel14.setText("Controller Type");

        jLabel15.setText("Environment");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setText("Project No");

        txtProID1.setEditable(false);
        txtProID1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel31.setText("Project Name");

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel41.setText("Item 10");

        jLabel40.setText("Item 9");

        jLabel39.setText("Item 8");

        jLabel38.setText("Item 7");

        jLabel37.setText("Item 6");

        jLabel35.setText("Item 4");

        jLabel36.setText("Item 5");

        jLabel34.setText("Item 3");

        jLabel33.setText("Item 2");

        jLabel32.setText("Item 1");

        jLabel42.setText("Item No");

        jLabel43.setText("Item Name");

        txtItem11.setEditable(false);
        txtItem11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem12.setEditable(false);
        txtItem12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem13.setEditable(false);
        txtItem13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem14.setEditable(false);
        txtItem14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem15.setEditable(false);
        txtItem15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem16.setEditable(false);
        txtItem16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem17.setEditable(false);
        txtItem17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem18.setEditable(false);
        txtItem18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem19.setEditable(false);
        txtItem19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtItem20.setEditable(false);
        txtItem20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel44.setText("Qty");

        txtQ11.setEditable(false);
        txtQ11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ12.setEditable(false);
        txtQ12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ13.setEditable(false);
        txtQ13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ14.setEditable(false);
        txtQ14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ15.setEditable(false);
        txtQ15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ16.setEditable(false);
        txtQ16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ17.setEditable(false);
        txtQ17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ18.setEditable(false);
        txtQ18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtQ19.setEditable(false);
        txtQ19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtQ19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ19ActionPerformed(evt);
            }
        });

        txtQ20.setEditable(false);
        txtQ20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setText("End date");

        jLabel3.setText("Supplier");

        jLabel4.setText("Deadline");

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel30)
                        .addGap(34, 34, 34)
                        .addComponent(txtProID1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel31)
                        .addGap(32, 32, 32)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(160, 160, 160)
                                .addComponent(jLabel43)
                                .addGap(167, 167, 167)
                                .addComponent(jLabel44)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem13, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem14, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem15, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem16, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem17, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem18, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtItem19, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtItem20, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField14)
                                    .addComponent(jTextField15)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField17)
                                    .addComponent(jTextField18)
                                    .addComponent(jTextField19)
                                    .addComponent(jTextField20))))))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32))
                    .addComponent(txtItem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel33))
                    .addComponent(txtItem12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel34))
                    .addComponent(txtItem13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel35))
                    .addComponent(txtItem14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel36))
                    .addComponent(txtItem15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel37))
                    .addComponent(txtItem16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel38))
                    .addComponent(txtItem17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel39))
                    .addComponent(txtItem18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel40))
                    .addComponent(txtItem19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel41))
                    .addComponent(txtItem20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQ20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class animation_Start extends Thread {

        int max_w;
        int max_h;

        public animation_Start(int max_w, int max_h) {
            this.max_h = max_h;
            this.max_w = max_w;
        }
        long sleepb = 1;
        int add = 30;//no pixels add

        public void run() {
            setSize(0, 0);
            int x = 0;
            int y = 0;

            while (y < max_h || x < max_w) {
                if (y > max_h && x < max_w) {
                    x = x + add;
                    setSize(x, max_h);
                } else if (y < max_h && x > max_w) {

                    y = y + add;
                    setSize(max_w, y);
                } else if (y < max_h && x < max_w) {
                    y = y + add;
                    x = x + add;
                    setSize(x, y);
                } else//window has got the wanted size(prefered size)
                {
                    setSize(max_h, max_w);
                    pack();
                }



                try {
                    sleep(sleepb);
                } catch (InterruptedException ex) {
                    
                }

            }
            //  setSize(962, 697);
            pack();
           // System.out.println(getWidth());
            //System.out.println(getHeight());

        }
    }
    //animation for exit of window
    class animation_exit extends Thread {

        long sleepa = 1;
        int min =25;//no pixels reduce

        public void run() {
            int x = getWidth();
            int y = getHeight();

            while (x > 0 || y > 0) {
                x = x - min;
                y = y - min;
                setSize(x, y);
                try {
                    sleep(sleepa);
                } catch (InterruptedException ex) {
                    
                }

            }

        }
    }
    
    
    private void txtQ19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ19ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
         if (Data.Login.getPre_UI_type() == 1 || Data.Login.getPre_UI_type() == 2) {
            animation_exit a = new animation_exit();
            a.start();
            try {
                a.join();
            } catch (InterruptedException ex) {
                
            }
        }
        
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetailedProject().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtItem11;
    private javax.swing.JTextField txtItem12;
    private javax.swing.JTextField txtItem13;
    private javax.swing.JTextField txtItem14;
    private javax.swing.JTextField txtItem15;
    private javax.swing.JTextField txtItem16;
    private javax.swing.JTextField txtItem17;
    private javax.swing.JTextField txtItem18;
    private javax.swing.JTextField txtItem19;
    private javax.swing.JTextField txtItem20;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProID1;
    private javax.swing.JTextField txtQ11;
    private javax.swing.JTextField txtQ12;
    private javax.swing.JTextField txtQ13;
    private javax.swing.JTextField txtQ14;
    private javax.swing.JTextField txtQ15;
    private javax.swing.JTextField txtQ16;
    private javax.swing.JTextField txtQ17;
    private javax.swing.JTextField txtQ18;
    private javax.swing.JTextField txtQ19;
    private javax.swing.JTextField txtQ20;
    // End of variables declaration//GEN-END:variables
}
