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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rkuha
 */
public class daily_sales extends javax.swing.JFrame {

    /**
     * Creates new form product_performance
     */
    public daily_sales() {
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
        jPanel27 = new javax.swing.JPanel();
        btn_back_to_bar12 = new javax.swing.JButton();
        btn_customer_behaviour_bar12 = new javax.swing.JButton();
        btn_best_selling_bar12 = new javax.swing.JButton();
        btn_product_performance_bar12 = new javax.swing.JButton();
        btn_branch_performance_bar12 = new javax.swing.JButton();
        btn_sales_bar12 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btn_add_bar5 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_check = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        daily_sales_txtfld = new javax.swing.JTextField();
        btn_daily = new javax.swing.JButton();
        btn_monthly = new javax.swing.JButton();
        btn_annual = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_back_to_bar12.setText("Back To Dashboard");

        btn_customer_behaviour_bar12.setText("Customer Behaviour");
        btn_customer_behaviour_bar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customer_behaviour_bar12ActionPerformed(evt);
            }
        });

        btn_best_selling_bar12.setText("Best Selling Product");
        btn_best_selling_bar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_best_selling_bar12ActionPerformed(evt);
            }
        });

        btn_product_performance_bar12.setText("Product Performance");
        btn_product_performance_bar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_performance_bar12ActionPerformed(evt);
            }
        });

        btn_branch_performance_bar12.setText("Branch Performance");
        btn_branch_performance_bar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_branch_performance_bar12ActionPerformed(evt);
            }
        });

        btn_sales_bar12.setText("Sales");
        btn_sales_bar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sales_bar12ActionPerformed(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 204, 51));
        jLabel23.setText("Sampath Food City");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        btn_add_bar5.setText("Add Product");
        btn_add_bar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_bar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btn_back_to_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_customer_behaviour_bar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_branch_performance_bar12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_best_selling_bar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sales_bar12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_product_performance_bar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add_bar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btn_add_bar5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sales_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_best_selling_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_product_performance_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_customer_behaviour_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_branch_performance_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btn_back_to_bar12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 80, -1));

        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });
        jPanel1.add(btn_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Unit price", "Total sold"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 760, 450));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Daily sales Amount");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 20));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 180, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Sales");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Choose Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));
        jPanel1.add(daily_sales_txtfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 180, -1));

        btn_daily.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_daily.setText("Daily Sales");
        btn_daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dailyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        btn_monthly.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_monthly.setText("Monthly Sales");
        btn_monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monthlyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_monthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        btn_annual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_annual.setText("Annual Sales");
        btn_annual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annualActionPerformed(evt);
            }
        });
        jPanel1.add(btn_annual, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("You are in Daily Sales Report");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_annualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annualActionPerformed
        // TODO add your handling code here:
        Annual_sales an = new Annual_sales();
        this.dispose();
        an.setVisible(true);
    }//GEN-LAST:event_btn_annualActionPerformed

    private void btn_monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monthlyActionPerformed
        // TODO add your handling code here:
        monthly_sales ms = new monthly_sales();
        this.dispose();
        ms.setVisible(true);
    }//GEN-LAST:event_btn_monthlyActionPerformed

    private void btn_dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dailyActionPerformed
        // TODO add your handling code here:
        daily_sales ds = new daily_sales();
        this.dispose();
        ds.setVisible(true);
    }//GEN-LAST:event_btn_dailyActionPerformed

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        daily(date, jTable1, daily_sales_txtfld);
        
    }//GEN-LAST:event_btn_checkActionPerformed

    private void btn_sales_bar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sales_bar12ActionPerformed
        // TODO add your handling code here:
        daily_sales ds = new daily_sales();
        this.dispose();
        ds.setVisible(true);
    }//GEN-LAST:event_btn_sales_bar12ActionPerformed

    private void btn_product_performance_bar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_performance_bar12ActionPerformed
        // TODO add your handling code here:
        product_performance pp = new product_performance();
        this.dispose();
        pp.setVisible(true);
    }//GEN-LAST:event_btn_product_performance_bar12ActionPerformed

    private void btn_add_bar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_bar5ActionPerformed
        // TODO add your handling code here:
        Add_product adp = new Add_product();
        this.dispose();
        adp.setVisible(true);
    }//GEN-LAST:event_btn_add_bar5ActionPerformed

    private void btn_best_selling_bar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_best_selling_bar12ActionPerformed
        // TODO add your handling code here:
        Best_selling_product bp = new Best_selling_product();
        this.dispose();
        bp.setVisible(true);
    }//GEN-LAST:event_btn_best_selling_bar12ActionPerformed

    private void btn_customer_behaviour_bar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customer_behaviour_bar12ActionPerformed
        // TODO add your handling code here:
        Customer_behaviour cb = new Customer_behaviour();
        this.dispose();
        cb.setVisible(true);
    }//GEN-LAST:event_btn_customer_behaviour_bar12ActionPerformed

    private void btn_branch_performance_bar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_branch_performance_bar12ActionPerformed
        // TODO add your handling code here:
        Branch_performance brp = new Branch_performance();
        this.dispose();
        brp.setVisible(true);
    }//GEN-LAST:event_btn_branch_performance_bar12ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        date.setDate(null);       // Clear the date field
        daily_sales_txtfld.setText("");   // Clear the daily sales text field
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clears all rows in the table
    }//GEN-LAST:event_btn_clearActionPerformed

  public void daily(JDateChooser date, JTable jTable1, JTextField daily_sales_txtfld) {
    try {
        // Ensure date is properly defined JDateChooser object
        if (date == null) {
            JOptionPane.showMessageDialog(null, "Date picker is not initialized.");
            return;
        }

        // Convert date from JDateChooser
        java.util.Date selectedDate = date.getDate();  // Corrected to 'date.getDate()'
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }

        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

        // Database query to fetch daily sales data
        String query = "SELECT product_name, quantity, price_per_unit, (quantity * price_per_unit) AS total_sold "
                + "FROM items WHERE date = ?";

        try (Connection con = database.getConnection(); PreparedStatement stmt = con.prepareStatement(query)) {

            // Bind the date parameter to the query
            stmt.setDate(1, sqlDate);

            try (ResultSet rs = stmt.executeQuery()) {
                // Define table model with the correct column names
                DefaultTableModel model = new DefaultTableModel(new String[]{"Product Name", "Quantity", "Unit Price", "Total Sold"}, 0);
                jTable1.setModel(model);

                double overallTotal = 0;
                boolean dataFound = false;  // Flag to check if there is any data for the selected date

                // Process ResultSet and populate the table using encapsulation
                while (rs.next()) {
                    String productName = rs.getString("product_name");
                    int quantity = rs.getInt("quantity");
                    double pricePerUnit = rs.getDouble("price_per_unit");
                    double totalSold = rs.getDouble("total_sold");

                    // Add data to table model
                    model.addRow(new Object[]{productName, quantity, pricePerUnit, totalSold});

                    // Update the overall total
                    overallTotal += totalSold;

                    dataFound = true;  // Data found for the selected date
                }

                // If no data found for the selected date, show a message and clear the text field
                if (!dataFound) {
                    JOptionPane.showMessageDialog(null, "No products found for the selected date.");
                    daily_sales_txtfld.setText("");  // Clear the text field if no data is found
                } else {
                    // Set the overall total in the daily sales text field
                    daily_sales_txtfld.setText(String.format("%.2f", overallTotal));  // Corrected line
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
            java.util.logging.Logger.getLogger(daily_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daily_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daily_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daily_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daily_sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_bar5;
    private javax.swing.JButton btn_annual;
    private javax.swing.JButton btn_back_to_bar12;
    private javax.swing.JButton btn_best_selling_bar12;
    private javax.swing.JButton btn_branch_performance_bar12;
    private javax.swing.JButton btn_check;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_customer_behaviour_bar12;
    private javax.swing.JButton btn_daily;
    private javax.swing.JButton btn_monthly;
    private javax.swing.JButton btn_product_performance_bar12;
    private javax.swing.JButton btn_sales_bar12;
    private javax.swing.JTextField daily_sales_txtfld;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
