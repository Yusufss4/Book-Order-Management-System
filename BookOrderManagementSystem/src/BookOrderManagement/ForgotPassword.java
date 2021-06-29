
package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ForgotPassword extends javax.swing.JFrame {

    String JFrameAdi = "Forgot Password";
    public ForgotPassword() {
        initComponents();
        setTitle(JFrameAdi); //Set Frame title
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); //Put frame center of screen
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //�t close just interested frame
        this.setSize(450, 350); //Set frame size
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldKullaniciAdi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelSifre = new javax.swing.JLabel();
        jButtonSifreOgren = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldKullaniciAdi.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Alata", 0, 24)); // NOI18N
        jLabel1.setText("User Name : ");

        jLabelSifre.setFont(new java.awt.Font("Alata", 0, 24)); // NOI18N
        jLabelSifre.setText("Your Password: ");

        jButtonSifreOgren.setBackground(new java.awt.Color(153, 204, 255));
        jButtonSifreOgren.setFont(new java.awt.Font("Alata", 0, 21)); // NOI18N
        jButtonSifreOgren.setText("Learn Your Password");
        jButtonSifreOgren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSifreOgrenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSifre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonSifreOgren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldKullaniciAdi))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSifreOgren, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabelSifre)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSifreOgrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSifreOgrenActionPerformed
        if(jTextFieldKullaniciAdi.getText().length() != 0)
        {
            if(jTextFieldKullaniciAdi.getText().equals("yusufss"))  
            {
                jLabelSifre.setText("Password : 123");
            }
            else
                JOptionPane.showMessageDialog(null, "User cannot found."); //This error will be given if the username is not true
        }
        else
            JOptionPane.showMessageDialog(null, "Please enter username"); //This error will be given if the username is empty
    }//GEN-LAST:event_jButtonSifreOgrenActionPerformed
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
       
    
    
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSifreOgren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSifre;
    private javax.swing.JTextField jTextFieldKullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
