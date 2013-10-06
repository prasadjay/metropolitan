/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_project;

import Global_Sources.Dbconnect;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRASAD
 */
public class statViewProjects extends javax.swing.JFrame {
    
     Dbconnect db1 = new Dbconnect();
    Connection con1 = db1.connect();
    
    String selectedItem = "";
    String passedVal = staticData.getTempProjectData();

    /**
     * Creates new form Sub_Interface
     */
    public statViewProjects() {
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
        
        passedVal = staticData.getTempProjectData();
        loadOnStart();

        
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePending = new javax.swing.JTable();
        btnMore2 = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));

        tablePending.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablePending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePendingMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePending);

        btnMore2.setText("Get More Info");
        btnMore2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMore2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMore2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnMore2)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Project Detail View", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Project Details");

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
    
    
    private void btnMore2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMore2ActionPerformed
        // TODO add your handling code here:

        staticData.setTempProjectData(this.selectedItem);
        ViewDetailedProject i = new ViewDetailedProject();
        i.setVisible(true);
    }//GEN-LAST:event_btnMore2ActionPerformed

    public void loadOnStart()
    {
        
        String query = passedVal;
            
        ResultSet result= db1.executeSQLQuery(query);

        try {

            int columCount = 0;
            ResultSetMetaData rsmd = result.getMetaData();
            Vector myVector = new Vector();
            columCount = rsmd.getColumnCount();
            for (int i = 1; i <= columCount; i++) {
                myVector.add(rsmd.getColumnLabel(i));
            }
            DefaultTableModel amodel = new DefaultTableModel(myVector, 0)/*0=row count*/ {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };

            while (result.next()) {
                String[] rowData = new String[columCount];
                for (int i = 1; i <= columCount; i++) {
                    if (i == 1) {
                        String id = result.getString(i);
                        rowData[i - 1] = id.toUpperCase();
                    } else {
                        rowData[i - 1] = result.getString(i);
                    }
                }
                amodel.addRow(rowData);
            }

            tablePending.setModel(amodel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error in Showing Data", "METROPOLITAN ENGINEERING (PVT) LTD", 1);
        }
    }
    
    private void tablePendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePendingMouseClicked
        // TODO add your handling code here:
        
        //this.btnMore2.enable(Boolean.TRUE);
        
        int a=this.tablePending.getSelectedRow();
        String c=tablePending.getValueAt(a, 0).toString();
        this.selectedItem = c;
    }//GEN-LAST:event_tablePendingMouseClicked

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
            java.util.logging.Logger.getLogger(statViewProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statViewProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statViewProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statViewProjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statViewProjects().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMore2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablePending;
    // End of variables declaration//GEN-END:variables
}