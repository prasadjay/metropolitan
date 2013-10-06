/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Product;

import GUI_project.*;
import Global_Sources.Dbconnect;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author PRASAD
 */
public class ViewDetailedProduct extends javax.swing.JFrame {
 Dbconnect db1 = new Dbconnect();
    Connection con1 = db1.connect();
    /**
     * Creates new form Sub_Interface
     */
    public ViewDetailedProduct() {
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
        // loading stff
        
        String selection = storeDetails.getDetailedProduct();
        System.out.println(selection);
        
        
        // loading in to text boxess
        
         // for first item
        
        
        String gen = "select * from generator where gID = '"+selection+"'";
        String eng = "select * from engineGen where geneID = '"+selection+"'";
        String dimen = "select * from dimension where genID = '"+selection+"'";
        String alter = "select * from alternator where genID = '"+selection+"'";
        
        ResultSet result1= db1.executeSQLQuery(gen);
        ResultSet result2= db1.executeSQLQuery(eng);
        ResultSet result3= db1.executeSQLQuery(dimen);
        ResultSet result4= db1.executeSQLQuery(alter);
        
        try
        {
        while(result1.next())
        {
            this.jTextField1.setText(result1.getString("gID"));
            this.jTextField2.setText(result1.getString("gName"));
            this.jTextField3.setText(result1.getString("frequency"));
            this.jTextField5.setText(result1.getString("voltage"));
            this.jTextField7.setText(result1.getString("phaseCurrent"));
            this.jTextField4.setText(result1.getString("sPower"));
            this.jTextField6.setText(result1.getString("pPower"));
            this.jTextField8.setText(result1.getString("maxCurrent"));
        }
        while(result2.next())
        {
            this.jTextField9.setText(result2.getString("eID"));
            this.jTextField11.setText(result2.getString("brand"));
            this.jTextField13.setText(result2.getString("model"));
            this.jTextField10.setText(result2.getString("version"));
            this.jTextField27.setText(result2.getString("fuel"));
            this.jTextField15.setText(result2.getString("tankSize"));
            this.jTextField16.setText(result2.getString("Consumption"));
            this.jTextField12.setText(result2.getString("displacement"));
            this.jTextField14.setText(result2.getString("aspiration"));
            
        }
        while(result3.next())
        {
            this.jTextField17.setText(result3.getString("length"));
            this.jTextField18.setText(result3.getString("width"));
            this.jTextField19.setText(result3.getString("height"));
            this.jTextField20.setText(result3.getString("dryWeight"));
           
        }
        while(result4.next())
        {
            this.jTextField21.setText(result4.getString("brand"));
            this.jTextField23.setText(result4.getString("model"));
            this.jTextField25.setText(result4.getString("class"));
            this.jTextField22.setText(result4.getString("ipProtection"));
            this.jTextField24.setText(result4.getString("poles"));
            this.jTextField26.setText(result4.getString("voltageTolarence"));
           
            
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
        
        
        
        
        // loading finishes here
        
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Serial NO");

        jLabel6.setText("Commissioned date  ");

        jLabel7.setText("Delivered  time ");

        jLabel8.setText("Genset Model");

        jLabel9.setText("Genset S/N");

        jLabel14.setText("Controller Type");

        jLabel15.setText("Environment");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Detailed Product");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detailed Product View"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Product ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 55, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 52, 144, -1));

        jLabel3.setText("Product Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 55, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 52, 362, -1));

        jLabel4.setText("Frequency");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 103, -1, -1));

        jLabel5.setText("Stand-by Power");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 148, -1, -1));

        jLabel10.setText("Voltage");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 103, -1, -1));

        jLabel11.setText("Prime Power");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 148, -1, -1));

        jLabel12.setText("Phase");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 103, -1, -1));

        jLabel13.setText("Max Current");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 148, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 100, 144, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 145, 144, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 100, 153, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 145, 153, -1));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 145, -1));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 145, 145, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 187, 950, -1));

        jLabel16.setText("Engine ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 230, -1, -1));

        jLabel17.setText("Version");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 282, -1, -1));

        jLabel19.setText("Brand");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel20.setText("Displacement");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel21.setText("Model");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jLabel22.setText("Aspiration");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 325, 950, -1));

        jLabel18.setText("Fuel Type");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 373, -1, -1));

        jLabel23.setText("Tank Size");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        jLabel24.setText("Consumption");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 147, -1));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 147, -1));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 220, 150, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 280, 130, -1));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 144, -1));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 144, -1));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 370, 140, -1));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 138, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 408, 950, -1));

        jLabel25.setText("Length");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 439, -1, -1));

        jLabel26.setText("Width");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jLabel27.setText("Height");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        jLabel28.setText("Dry Weight");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 477, -1, -1));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 436, 144, -1));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 440, 140, -1));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 90, -1));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 474, 144, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Main Details");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 20, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Engine Details");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 195, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Fuel Details");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 333, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Dimentions");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 416, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 512, 950, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Alternator Details");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 525, -1, -1));

        jLabel34.setText("Brand");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 560, -1, -1));

        jLabel35.setText("Model");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

        jLabel36.setText("Class");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        jLabel37.setText("IP protection");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 611, -1, -1));

        jLabel38.setText("Poles");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, -1));

        jLabel39.setText("Voltage Tolerence");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, -1, -1));

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 140, -1));

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 140, -1));

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 153, -1));

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 153, -1));

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 159, -1));

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 158, -1));

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 136, -1));

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("Hz");
        jPanel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 102, 38, -1));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel116.setText("kVA");
        jPanel1.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 147, 38, -1));

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel117.setText("kVA");
        jPanel1.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 147, 38, -1));

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel118.setText("A");
        jPanel1.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 147, 38, -1));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel119.setText("V");
        jPanel1.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 102, 38, -1));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel120.setText("CC");
        jPanel1.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 38, -1));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel121.setText("L");
        jPanel1.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 25, -1));

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel122.setText("mm");
        jPanel1.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 25, -1));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel123.setText("mm");
        jPanel1.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 476, 25, -1));

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel124.setText("mm");
        jPanel1.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 25, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(ViewDetailedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetailedProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetailedProduct().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
