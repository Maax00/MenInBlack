/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;

/**
 *
 * @author tindr
 */
public class AlienLogin extends javax.swing.JFrame {

    /**
     * Creates new form AlienLogin
     */
    public AlienLogin() {
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

        alienLableEmail = new javax.swing.JLabel();
        alienlablePassword = new javax.swing.JLabel();
        alienEntryEmail = new javax.swing.JTextField();
        alienEntryPassword = new javax.swing.JTextField();
        alienButtonLogin = new javax.swing.JButton();
        alienButtonForgot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alienLableEmail.setText("Email");

        alienlablePassword.setText("Password");

        alienButtonLogin.setText("Login");
        alienButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienButtonLoginActionPerformed(evt);
            }
        });

        alienButtonForgot.setBackground(new java.awt.Color(242, 242, 242));
        alienButtonForgot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alienButtonForgot.setText("Forgot credentials");
        alienButtonForgot.setBorder(null);
        alienButtonForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienButtonForgotActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Alien login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alienButtonLogin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(alienlablePassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alienEntryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(alienLableEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(alienEntryEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alienButtonForgot, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alienLableEmail)
                    .addComponent(alienEntryEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienlablePassword)
                    .addComponent(alienEntryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(alienButtonLogin)
                .addGap(10, 10, 10)
                .addComponent(alienButtonForgot)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // This method is triggered when the login button for an alien user is clicked in a GUI application
    private void alienButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienButtonLoginActionPerformed
        // TODO add your handling code here:
        boolean check = true;
        // Extract the entered email from the corresponding text field
        String email = alienEntryEmail.getText();

        // Check if the entered email is valid using a validation method
        if (!Validering.isValidEmail(email)) {
            // If not valid, set check to false and display an error message
            messageBox.setText("Email Error");
            check = false;
        }
        String password = alienEntryPassword.getText();
        if (!Validering.isValidPassword(password)) {
            messageBox.setText("Password Error");
            check = false;
        }
        // If all validations pass, proceed with the login attempt
        if (check) {
            try {
                System.out.println("email");
                String emailQuery = "SELECT Epost FROM alien";
                String passwordQuery = "SELECT Losenord FROM alien WHERE Epost = '" + email + "'";
                // Fetch all emails from the alien table
                ArrayList<String> emails = Database.getDatabase().fetchColumn(emailQuery);
                Boolean emailCheck = false;
                Boolean passwordCheck = false;

                // Check if the entered email exists in the fetched emails
                for (String oneEmail : emails) {
                    if (oneEmail.equals(email)) {
                        emailCheck = true;
                    }
                }
                if (password.equals(Database.getDatabase().fetchSingle(passwordQuery))) {
                    passwordCheck = true;
                }
                if (emailCheck && passwordCheck) {
                    System.out.println("login");

                    // Set shared data using a singleton class for future reference
                    DataHolder.getInstance().setSharedData(email);

                    // Open the main window for the alien user
                    AlienStartWindow frame = new AlienStartWindow();
                    frame.setVisible(true);
                    dispose();
                }
            } catch (InfException ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_alienButtonLoginActionPerformed
    // This method is triggered when the forgot password button for an alien user is clicked
    private void alienButtonForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienButtonForgotActionPerformed
        // TODO add your handling code here:
        AlienResetCredentials frame = new AlienResetCredentials();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_alienButtonForgotActionPerformed

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
            java.util.logging.Logger.getLogger(AlienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alienButtonForgot;
    private javax.swing.JButton alienButtonLogin;
    private javax.swing.JTextField alienEntryEmail;
    private javax.swing.JTextField alienEntryPassword;
    private javax.swing.JLabel alienLableEmail;
    private javax.swing.JLabel alienlablePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageBox;
    // End of variables declaration//GEN-END:variables
}
