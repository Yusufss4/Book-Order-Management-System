package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShoppingCart extends javax.swing.JFrame {

    String JFrameName = "Cart";

    public ShoppingCart() {
        initComponents();
        setTitle(JFrameName); //Set Frame title
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Put frame center of screen
        this.setSize(620, 500); //Set frame size
        jTableShoppingCart.setRowHeight(30);
        ListAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShoppingCart = new javax.swing.JTable();
        jButtonCancelOrder = new javax.swing.JButton();
        jButtonAcceptOrder = new javax.swing.JButton();
        jButtonReturnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableShoppingCart.setFont(new java.awt.Font("Alata", 0, 20)); // NOI18N
        jTableShoppingCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selected Book Name", "Price"
            }
        ));
        jTableShoppingCart.setEnabled(false);
        jScrollPane1.setViewportView(jTableShoppingCart);

        jButtonCancelOrder.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelOrder.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButtonCancelOrder.setText("Cancel Order");
        jButtonCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelOrderActionPerformed(evt);
            }
        });

        jButtonAcceptOrder.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAcceptOrder.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButtonAcceptOrder.setText("Accept Order");
        jButtonAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcceptOrderActionPerformed(evt);
            }
        });

        jButtonReturnBack.setBackground(new java.awt.Color(204, 204, 0));
        jButtonReturnBack.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButtonReturnBack.setText("Return Back");
        jButtonReturnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReturnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAcceptOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelOrder)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAcceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButtonReturnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ListAllItems() {
        ListOfBook bookList = new ListOfBook();

        int bookListSize = bookList.SelectedBook.size(); //created a variable that holds the number of selected dishes.

        DefaultTableModel model = new DefaultTableModel(); //Define to add variable to table
        model.addColumn("Selected Book"); //Add a dish column on table
        model.addColumn("Price"); //Add a price column on table
        jTableShoppingCart.setModel(model); //Implement data variable to table
        for (int i = 0; i < bookListSize; i++) {
            model.addRow(new Object[]{bookList.SelectedBook.get(i), bookList.SelectedBookPrice.get(i)}); //A loop processed as many as the number of items added to the cart. The products are added to the table.
        }
    }
    private void jButtonCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelOrderActionPerformed
        JOptionPane.showMessageDialog(null, "All books are deleted from the shopping cart");
        ListOfBook bookList = new ListOfBook();
        bookList.SelectedBook.clear();    //Delete all foods which is added to cart
        bookList.SelectedBookPrice.clear();
        bookList.TotalOrderCost = 0;
        bookList.OrderList = "";
        Category category = new Category();
        category.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelOrderActionPerformed

    private void jButtonReturnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnBackActionPerformed
        Category category = new Category();
        category.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnBackActionPerformed

    private void jButtonAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptOrderActionPerformed
        if (jTableShoppingCart.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No book is added to cart");
        } else {
            JOptionPane.showMessageDialog(null, "Order is created, Have a good read!.");
            Recipe recipient = null;
            try {
                recipient = new Recipe();
            } catch (IOException ex) {
                Logger.getLogger(ShoppingCart.class.getName()).log(Level.SEVERE, null, ex);
            }
            recipient.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAcceptOrderActionPerformed
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcceptOrder;
    private javax.swing.JButton jButtonCancelOrder;
    private javax.swing.JButton jButtonReturnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShoppingCart;
    // End of variables declaration//GEN-END:variables
}
