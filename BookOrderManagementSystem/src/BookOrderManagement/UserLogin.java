package BookOrderManagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class UserLogin extends javax.swing.JFrame {

    String JFrameAdi = "User Entry";
    public static String UserName; //It is a variable which is shown on voucher

    public UserLogin() {
        initComponents();
        setTitle(JFrameAdi); //Set Frame title
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Put frame center of screen
        this.setSize(600, 500); //Set frame size
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUserName = new javax.swing.JTextField();
        jLabel1Username = new javax.swing.JLabel();
        jLabel2Password = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonEnter = new javax.swing.JButton();
        jForgotMyPasswordButton = new javax.swing.JButton();
        jRememberMyPasswordRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldUserName.setFont(new java.awt.Font("Alata", 0, 22)); // NOI18N

        jLabel1Username.setFont(new java.awt.Font("Alata", 0, 24)); // NOI18N
        jLabel1Username.setText("User Name: ");

        jLabel2Password.setFont(new java.awt.Font("Alata", 0, 24)); // NOI18N
        jLabel2Password.setText("Password: ");

        jPasswordField.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N

        jButtonEnter.setBackground(new java.awt.Color(153, 255, 153));
        jButtonEnter.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jButtonEnter.setText("Enter");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        jForgotMyPasswordButton.setBackground(new java.awt.Color(153, 204, 255));
        jForgotMyPasswordButton.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jForgotMyPasswordButton.setText("Forgot my password");
        jForgotMyPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jForgotMyPasswordButtonActionPerformed(evt);
            }
        });

        jRememberMyPasswordRadioButton.setFont(new java.awt.Font("Alata", 0, 11)); // NOI18N
        jRememberMyPasswordRadioButton.setText("Remember my password");
        jRememberMyPasswordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRememberMyPasswordRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2Password)
                            .addComponent(jLabel1Username))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRememberMyPasswordRadioButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUserName)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jForgotMyPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Username))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2Password))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRememberMyPasswordRadioButton)
                .addGap(35, 35, 35)
                .addComponent(jButtonEnter)
                .addGap(32, 32, 32)
                .addComponent(jForgotMyPasswordButton)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jForgotMyPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jForgotMyPasswordButtonActionPerformed
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.setVisible(true);
    }//GEN-LAST:event_jForgotMyPasswordButtonActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        RegisterUser registerUser = new RegisterUser();
        Category category = new Category();
        if (jTextFieldUserName.getText().length() != 0 || jPasswordField.getPassword().length != 0) //Check textfield of username and password areas.
        {
            if (jTextFieldUserName.getText().equals("yusufs") && Arrays.equals(jPasswordField.getPassword(), new char[]{'1', '1', '1'})) //If login is made as user name: administrator, password: 123, login will be successful.
            {
                UserName = jTextFieldUserName.getText();
                category.setVisible(true);
                this.dispose();
            } else if (jTextFieldUserName.getText().equals(registerUser.user_name) && jPasswordField.getText().equals(registerUser.password)) {
                UserName = jTextFieldUserName.getText();
                category.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username or password is incorrect."); //A message for incorrect username or password
            }
        } else
            JOptionPane.showMessageDialog(null, "Please fill all."); //A message for blank areas.
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jRememberMyPasswordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRememberMyPasswordRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRememberMyPasswordRadioButtonActionPerformed
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
                //Form used for Userinterface
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jForgotMyPasswordButton;
    private javax.swing.JLabel jLabel1Username;
    private javax.swing.JLabel jLabel2Password;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JRadioButton jRememberMyPasswordRadioButton;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
