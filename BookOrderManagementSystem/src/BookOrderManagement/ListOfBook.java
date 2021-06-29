package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ListOfBook extends javax.swing.JFrame {

    String JFrameAdi = "Dish Selection";
    Category category = new Category();

    public ListOfBook() {
        initComponents();
        setTitle(JFrameAdi); //Set Frame title
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Put frame center of screen
        this.setSize(700, 500); //Set frame size
        if (category.SelectedCategory == "Action") //Added a special meal to the ListModel by checking the selected category.
        {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("action.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Action");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (category.SelectedCategory == "Classics") {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("classics.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Classics");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (category.SelectedCategory == "Graphic Novel") {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("graphicnovel.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Graphic Novel");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (category.SelectedCategory == "Horror") {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("horror.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Horror");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else if (category.SelectedCategory == "Mystery") {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("mystery.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Mystery");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (category.SelectedCategory == "Romance") {
            try {
                DefaultListModel listModel = new DefaultListModel();;
                FileInputStream fstream = new FileInputStream("romance.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;

                while ((strLine = br.readLine()) != null) {
                    listModel.addElement(strLine);
                }
                jListBook.setModel(listModel);
                jLabelCategoryOfBooks.setText("Category : Romance");
                fstream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<String> SelectedBook = new ArrayList<String>(); //Created an arrayList to keep the selected food in memory
    public static ArrayList<String> SelectedBookPrice = new ArrayList<String>(); //Created an arrayList to keep the selected food's price in memory
    public static int TotalOrderCost; //Created this to show on the receipt and we will calculate it
    public static String OrderList; //Created this to show on the receipt and we will include those added to the basket in this String

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListBook = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jAcceptBook = new javax.swing.JButton();
        jButtonReturnBack = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelCategoryOfBooks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListBook.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N
        jListBook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListBook);

        jLabel1.setFont(new java.awt.Font("Alata", 1, 24)); // NOI18N
        jLabel1.setText("Book List");

        jAcceptBook.setBackground(new java.awt.Color(0, 204, 102));
        jAcceptBook.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N
        jAcceptBook.setText("Accept Book");
        jAcceptBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcceptBookActionPerformed(evt);
            }
        });

        jButtonReturnBack.setBackground(new java.awt.Color(255, 204, 204));
        jButtonReturnBack.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N
        jButtonReturnBack.setText("Return Back");
        jButtonReturnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnBackActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(255, 0, 102));
        jButtonExit.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButtonExit.setText("Exit from Program");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelCategoryOfBooks.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jLabelCategoryOfBooks.setText("Category of Books : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReturnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jAcceptBook)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabelCategoryOfBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(jLabel1)))
                        .addGap(0, 224, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabelCategoryOfBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAcceptBook, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonReturnBack)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonReturnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonReturnBackActionPerformed

    private void jAcceptBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcceptBookActionPerformed

        SelectedBook.add(jListBook.getSelectedValue());
        if (jListBook.getSelectedValue() != null) {
            if (jLabelCategoryOfBooks.getText() == "Category : Action") {
                SelectedBookPrice.add("18 tl");
                TotalOrderCost = TotalOrderCost + 18;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            } else if (jLabelCategoryOfBooks.getText() == "Category : Classics") {
                SelectedBookPrice.add("17 tl");
                TotalOrderCost = TotalOrderCost + 17;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            } else if (jLabelCategoryOfBooks.getText() == "Category : Graphic Novel") {
                SelectedBookPrice.add("16 tl");
                TotalOrderCost = TotalOrderCost + 16;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            } else if (jLabelCategoryOfBooks.getText() == "Category : Horror") {
                SelectedBookPrice.add("19 tl");
                TotalOrderCost = TotalOrderCost + 19;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            } else if (jLabelCategoryOfBooks.getText() == "Category : Mystery") {
                SelectedBookPrice.add("20 tl");
                TotalOrderCost = TotalOrderCost + 21;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            } else if (jLabelCategoryOfBooks.getText() == "Category : Romance") {
                SelectedBookPrice.add("22 tl");
                TotalOrderCost = TotalOrderCost + 22;
                if (OrderList == null) {
                    OrderList = jListBook.getSelectedValue();
                } else {
                    OrderList = OrderList + ", " + jListBook.getSelectedValue();
                }
            }
            this.dispose();
        } else
            JOptionPane.showMessageDialog(null, "You have to choose one of the book categories");
    }//GEN-LAST:event_jAcceptBookActionPerformed
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            java.util.logging.Logger.getLogger(ListOfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAcceptBook;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReturnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategoryOfBooks;
    private javax.swing.JList<String> jListBook;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
