/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import code.produts;
import com.toedter.calendar.JDateChooser;
import db.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rkuha
 */
public class Best_selling_product extends javax.swing.JFrame {

    /**
     * Creates new form Best_selling_product
     */
    public Best_selling_product() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bsp_lb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        best_selling_product_tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        date_fld = new com.toedter.calendar.JDateChooser();
        btn_check = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_back_to_bar = new javax.swing.JButton();
        btn_customer_behaviour_bar = new javax.swing.JButton();
        btn_best_selling_bar = new javax.swing.JButton();
        btn_product_performance_bar = new javax.swing.JButton();
        btn_branch_performance_bar = new javax.swing.JButton();
        btn_sales_bar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_add_bar5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bsp_lb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bsp_lb.setText("Best Selling Product");

        jLabel2.setText("Find the most popular products based on demand");

        best_selling_product_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(best_selling_product_tbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Choose the Start Date");

        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_back_to_bar.setText("Back To Dashboard");
        btn_back_to_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_to_barActionPerformed(evt);
            }
        });

        btn_customer_behaviour_bar.setText("Customer Behaviour");
        btn_customer_behaviour_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customer_behaviour_barActionPerformed(evt);
            }
        });

        btn_best_selling_bar.setText("Best Selling Product");
        btn_best_selling_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_best_selling_barActionPerformed(evt);
            }
        });

        btn_product_performance_bar.setText("Product Performance");
        btn_product_performance_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_performance_barActionPerformed(evt);
            }
        });

        btn_branch_performance_bar.setText("Branch Performance");
        btn_branch_performance_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_branch_performance_barActionPerformed(evt);
            }
        });

        btn_sales_bar.setText("Sales");
        btn_sales_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sales_barActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("Sampath Food City");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_add_bar5.setText("Add Product");
        btn_add_bar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_bar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btn_back_to_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_customer_behaviour_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_branch_performance_bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_best_selling_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sales_bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_product_performance_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add_bar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add_bar5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sales_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_best_selling_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_product_performance_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_customer_behaviour_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_branch_performance_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btn_back_to_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(bsp_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(date_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bsp_lb)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_check)
                        .addComponent(jButton1)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
          // Create an instance of Best_selling_product
        Best_selling_product obj = new Best_selling_product();

        // Call the bestproduct method with the date field and table
        obj.bestproduct(date_fld, best_selling_product_tbl);
        
    }//GEN-LAST:event_btn_checkActionPerformed

    private void btn_product_performance_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_performance_barActionPerformed
        // TODO add your handling code here:
        product_performance pp = new product_performance();
        this.dispose();
        pp.setVisible(true);

    }//GEN-LAST:event_btn_product_performance_barActionPerformed

    private void btn_sales_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sales_barActionPerformed
        // TODO add your handling code here:
        daily_sales ds = new daily_sales();
        this.dispose();
        ds.setVisible(true);
    }//GEN-LAST:event_btn_sales_barActionPerformed

    private void btn_back_to_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_to_barActionPerformed
        // TODO add your handling code here:
        Dashboard Dashb = new Dashboard();
        this.dispose();
        Dashb.setVisible(true);
    }//GEN-LAST:event_btn_back_to_barActionPerformed

    private void btn_add_bar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_bar5ActionPerformed
        // TODO add your handling code here:
        Add_product adp = new Add_product();
        this.dispose();
        adp.setVisible(true);
    }//GEN-LAST:event_btn_add_bar5ActionPerformed

    private void btn_best_selling_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_best_selling_barActionPerformed
        // TODO add your handling code here:
        Best_selling_product bp = new Best_selling_product();
        this.dispose();
        bp.setVisible(true);
    }//GEN-LAST:event_btn_best_selling_barActionPerformed

    private void btn_customer_behaviour_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customer_behaviour_barActionPerformed
        // TODO add your handling code here:
        Customer_behaviour cb = new Customer_behaviour();
        this.dispose();
        cb.setVisible(true);
    }//GEN-LAST:event_btn_customer_behaviour_barActionPerformed

    private void btn_branch_performance_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_branch_performance_barActionPerformed
        // TODO add your handling code here:
        Branch_performance brp = new Branch_performance();
        this.dispose();
        brp.setVisible(true);
    }//GEN-LAST:event_btn_branch_performance_barActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        date_fld.setDate(null);
        DefaultTableModel model = (DefaultTableModel) best_selling_product_tbl.getModel();
        model.setRowCount(0); // Clears all rows in the table
    }//GEN-LAST:event_jButton1ActionPerformed
    public void bestproduct(JDateChooser sdate, JTable btable) {
    try {
        // Ensure sdate is properly defined JDateChooser object
        if (sdate == null) {
            JOptionPane.showMessageDialog(null, "Date picker is not initialized.");      
            return;
        }

        // Convert date from JDateChooser
        java.util.Date selectedDate = sdate.getDate();
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Please select a  date.");
            return;
        }

        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

        // Database query to find the best-selling product for the given date
     String query = "SELECT product_name, SUM(quantity) AS total_quantity "
                + "FROM items WHERE date = ? "
                + "GROUP BY product_name ORDER BY total_quantity DESC LIMIT 1";


        try (Connection con = database.getConnection(); PreparedStatement stmt = con.prepareStatement(query)) {

            // Bind the date parameter to the query
            stmt.setDate(1, sqlDate);

            try (ResultSet rs = stmt.executeQuery()) {
                // Define table model
                DefaultTableModel model = new DefaultTableModel(new String[]{"Product Name", "Quantity Sold"}, 0);
                btable.setModel(model);

                boolean dataFound = false;

                // Process ResultSet and populate the table using encapsulation
                if (rs.next()) {
                    dataFound = true;

                    // Create a new `produts` object and set only relevant fields
                    produts product = new produts();
                    product.setProductname(rs.getString("product_name"));
                    product.setQty(rs.getInt("total_quantity"));

                    // Add data to table model using getters from `produts`
                    model.addRow(new Object[]{
                        product.getProductname(),
                        product.getQty()
                    });
                }

                if (!dataFound) {
                    JOptionPane.showMessageDialog(null, "No data found for the selected date.");
                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Best_selling_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Best_selling_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Best_selling_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Best_selling_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Best_selling_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable best_selling_product_tbl;
    private javax.swing.JLabel bsp_lb;
    private javax.swing.JButton btn_add_bar5;
    private javax.swing.JButton btn_back_to_bar;
    private javax.swing.JButton btn_best_selling_bar;
    private javax.swing.JButton btn_branch_performance_bar;
    private javax.swing.JButton btn_check;
    private javax.swing.JButton btn_customer_behaviour_bar;
    private javax.swing.JButton btn_product_performance_bar;
    private javax.swing.JButton btn_sales_bar;
    private com.toedter.calendar.JDateChooser date_fld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
