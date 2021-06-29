package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Category extends javax.swing.JFrame {

    String JFrameAdi = "Category";
    ImageIcon imageDefault = new ImageIcon("BookManagementLogo.png");
    ImageIcon imageActionBook = new ImageIcon("LifeOfPi.png");
    ImageIcon imageClassicsBook = new ImageIcon("MockingBird.png");
    ImageIcon imageGraphicNovelBook = new ImageIcon("WalkingDead.png");
    ImageIcon imageHorrorBook = new ImageIcon("Carrie.png");
    ImageIcon imageMysteryBook = new ImageIcon("NightFire.png");
    ImageIcon imageRomanceBook = new ImageIcon("OneLastStop.png");

    public static String SelectedCategory; //In the other form, we created a public static String variable to list food according to the category selected.

    public Category() {
        initComponents();
        setTitle(JFrameAdi); //Set Frame title
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Put frame center of screen
        this.setSize(700, 500); //Set frame size
        jLabelBookImage.setIcon(imageDefault);
        jLabelBookImage.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAction = new javax.swing.JButton();
        jButtonGraphicNovel = new javax.swing.JButton();
        jButtonMystery = new javax.swing.JButton();
        jButtonClassics = new javax.swing.JButton();
        jButtonHorror = new javax.swing.JButton();
        jButtonRomance = new javax.swing.JButton();
        jButtonShoppingCart = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelBookImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Alata", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to the Book Shop!");

        jButtonAction.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAction.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonAction.setText("Action Books");
        jButtonAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActionMouseEntered(evt);
            }
        });
        jButtonAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionActionPerformed(evt);
            }
        });

        jButtonGraphicNovel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGraphicNovel.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonGraphicNovel.setText("Graphic Novels");
        jButtonGraphicNovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGraphicNovelMouseEntered(evt);
            }
        });
        jButtonGraphicNovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraphicNovelActionPerformed(evt);
            }
        });

        jButtonMystery.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMystery.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonMystery.setText("Mystery Books");
        jButtonMystery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMysteryMouseEntered(evt);
            }
        });
        jButtonMystery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMysteryActionPerformed(evt);
            }
        });

        jButtonClassics.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClassics.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonClassics.setText("Classics");
        jButtonClassics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonClassicsMouseEntered(evt);
            }
        });
        jButtonClassics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClassicsActionPerformed(evt);
            }
        });

        jButtonHorror.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHorror.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonHorror.setText("Horror Books");
        jButtonHorror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHorrorMouseEntered(evt);
            }
        });
        jButtonHorror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHorrorActionPerformed(evt);
            }
        });

        jButtonRomance.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRomance.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonRomance.setText("Romance Books");
        jButtonRomance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRomanceMouseEntered(evt);
            }
        });
        jButtonRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRomanceActionPerformed(evt);
            }
        });

        jButtonShoppingCart.setBackground(new java.awt.Color(102, 255, 102));
        jButtonShoppingCart.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N
        jButtonShoppingCart.setText("Check Shopping Cart");
        jButtonShoppingCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShoppingCartActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(255, 102, 102));
        jButtonExit.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelBookImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBookImage.setText("jLabelBookImage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelBookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonShoppingCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonGraphicNovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonHorror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonMystery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRomance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClassics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGraphicNovel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMystery, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHorror, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRomance, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAction, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClassics, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonShoppingCart, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelBookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionActionPerformed
        SelectedCategory = "Action"; //Assignment to the public static String variable we define according to the category of the button clicked
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true); //The menu is opened before the current frame is closed.
    }//GEN-LAST:event_jButtonActionActionPerformed

    private void jButtonGraphicNovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraphicNovelActionPerformed
        SelectedCategory = "Graphic Novel";
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true);
    }//GEN-LAST:event_jButtonGraphicNovelActionPerformed

    private void jButtonMysteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMysteryActionPerformed
        SelectedCategory = "Mystery";
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true);
    }//GEN-LAST:event_jButtonMysteryActionPerformed

    private void jButtonClassicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClassicsActionPerformed
        SelectedCategory = "Classics";
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true);
    }//GEN-LAST:event_jButtonClassicsActionPerformed

    private void jButtonHorrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHorrorActionPerformed
        SelectedCategory = "Horror";
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true);
    }//GEN-LAST:event_jButtonHorrorActionPerformed

    private void jButtonRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRomanceActionPerformed
        SelectedCategory = "Romance";
        ListOfBook yemekListesi = new ListOfBook();
        yemekListesi.setVisible(true);
    }//GEN-LAST:event_jButtonRomanceActionPerformed

    private void jButtonShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShoppingCartActionPerformed
        ShoppingCart sepet = new ShoppingCart();
        sepet.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonShoppingCartActionPerformed

    private void jButtonGraphicNovelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGraphicNovelMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageGraphicNovelBook);
    }//GEN-LAST:event_jButtonGraphicNovelMouseEntered

    private void jButtonMysteryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMysteryMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageMysteryBook);
    }//GEN-LAST:event_jButtonMysteryMouseEntered

    private void jButtonHorrorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHorrorMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageHorrorBook);
    }//GEN-LAST:event_jButtonHorrorMouseEntered

    private void jButtonRomanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRomanceMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageRomanceBook);
    }//GEN-LAST:event_jButtonRomanceMouseEntered

    private void jButtonActionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActionMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageActionBook);
    }//GEN-LAST:event_jButtonActionMouseEntered

    private void jButtonClassicsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClassicsMouseEntered
        // TODO add your handling code here:
        jLabelBookImage.setIcon(imageClassicsBook);
    }//GEN-LAST:event_jButtonClassicsMouseEntered
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAction;
    private javax.swing.JButton jButtonClassics;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonGraphicNovel;
    private javax.swing.JButton jButtonHorror;
    private javax.swing.JButton jButtonMystery;
    private javax.swing.JButton jButtonRomance;
    private javax.swing.JButton jButtonShoppingCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBookImage;
    // End of variables declaration//GEN-END:variables
}
