package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Recipe extends javax.swing.JFrame {

    String JFrameName = "Voucher";
    private String pattern = "dd-MM-yyyy";

    public Recipe() throws IOException {
        initComponents();
        setTitle(JFrameName);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setSize(700, 500);

        String newDate = new SimpleDateFormat(pattern).format(new Date());

        Date date = new Date();
        DateFormat format = new SimpleDateFormat("HH:mm");

        UserLogin userLogin = new UserLogin();
        ListOfBook bookList = new ListOfBook();

        jLabelOrderUserName.setText("Ordered By : " + userLogin.UserName);
        jLabelOrderDate.setText("Order Date : " + newDate);
        jLabelOrderTime.setText("Order Time: " + format.format(date));
        jLabelOrderCost.setText("Amount : " + bookList.TotalOrderCost + " tl");
        jLabelOrderDetails.setText("Order : " + bookList.OrderList);

        FileWriter recipientWriter = new FileWriter("recipient.txt");
        recipientWriter.write("Ordered By : " + userLogin.UserName);
        recipientWriter.write("\n");
        recipientWriter.write("Order Date : " + newDate);
        recipientWriter.write("\n");
        recipientWriter.write("Order Time : " + format.format(date));
        recipientWriter.write("\n");
        recipientWriter.write("Amount : " + bookList.TotalOrderCost + " tl");
        recipientWriter.write("\n");
        recipientWriter.write("Order : " + bookList.OrderList);
        recipientWriter.write("\n");
        recipientWriter.write("\n");
        recipientWriter.write("Good Day!");
        recipientWriter.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelOrderUserName = new javax.swing.JLabel();
        jLabelOrderTime = new javax.swing.JLabel();
        jLabelOrderDetails = new javax.swing.JLabel();
        jLabelOrderCost = new javax.swing.JLabel();
        jLabelOrderDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Alata", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receipt of Order");

        jLabelOrderUserName.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelOrderUserName.setText("Name of Person : ");

        jLabelOrderTime.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelOrderTime.setText("Order Time: ");

        jLabelOrderDetails.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelOrderDetails.setText("Order Details: ");

        jLabelOrderCost.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelOrderCost.setText("Total Cost:");

        jLabelOrderDate.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelOrderDate.setText("Order Date : ");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelOrderUserName)
                                .addComponent(jLabelOrderCost))
                            .addGap(192, 192, 192)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelOrderDate)
                                .addComponent(jLabelOrderTime)))))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrderUserName)
                    .addComponent(jLabelOrderDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrderTime)
                    .addComponent(jLabelOrderCost))
                .addGap(18, 18, 18)
                .addComponent(jLabelOrderDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    //////////////////////////////////////////////////////////////////////////////////////////////

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Recipe().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelOrderCost;
    private javax.swing.JLabel jLabelOrderDate;
    private javax.swing.JLabel jLabelOrderDetails;
    private javax.swing.JLabel jLabelOrderTime;
    private javax.swing.JLabel jLabelOrderUserName;
    // End of variables declaration//GEN-END:variables
}
