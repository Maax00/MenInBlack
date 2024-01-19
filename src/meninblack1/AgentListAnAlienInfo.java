/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack1;

import java.util.ArrayList;
import oru.inf.InfException;
import java.util.HashMap;


/**
 *
 * @author maxli
 */
public class AgentListAnAlienInfo extends javax.swing.JFrame {

    /**
     * Creates new form AgentListAnAlienInfo
     */
    public AgentListAnAlienInfo() {
        initComponents();
        fillComboBox();
    }
    private void fillComboBox(){
        try{
            selectCB.addItem("");
            selectCB.removeItem("Item 1");
            selectCB.removeItem("Item 2");
            selectCB.removeItem("Item 3");
            selectCB.removeItem("Item 4");
            String namesQuery = "Select namn from alien order by Namn";
            ArrayList<String> alienNames = Database.getDatabase().fetchColumn(namesQuery);
            for(String item:alienNames){
                selectCB.addItem(item);
            }
            System.out.println(selectCB);
        }catch(InfException ex){
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goBackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        selectCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goBackButton.setText("Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Show alien data");

        jTextArea1.setColumns(40);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        selectCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(selectCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(selectCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// this method is used to go back to prevoius startWindow
    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        AgentStartWindow frame = new AgentStartWindow();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void selectCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCBActionPerformed
        // TODO add your handling code here:
        // Clear the existing text in the jTextArea1 to display new results
        jTextArea1.setText("");
        try{
            // Get the selected alien's name from the combo box as a String
            String chosenAlien = selectCB.getSelectedItem().toString();
            //System.out.println(chosenAlien);
             // Construct an SQL query to retrieve information about the selected alien
            String getQuery = "Select * from alien where Namn = '" + chosenAlien + "'";
            // Fetch a row of data about the selected alien using the constructed query
            HashMap<String, String> rowFetched= Database.getDatabase().fetchRow(getQuery);

            jTextArea1.append("Alien_ID\t\t" + rowFetched.get("Alien_ID") + "\n");
            jTextArea1.append("Name\t\t" + rowFetched.get("Namn") + "\n");
            jTextArea1.append("Phonenumber\t" + rowFetched.get("Telefon") + "\n");
            jTextArea1.append("Register date\t\t" + rowFetched.get("Registreringsdatum") + "\n");
            jTextArea1.append("Responsible Agent\t" + rowFetched.get("Ansvarig_Agent") + "\n");
            jTextArea1.append("Email\t\t" + rowFetched.get("Epost") + "\n");
            jTextArea1.append("Password\t\t" + rowFetched.get("Losenord") + "\n");
            jTextArea1.append("Location\t\t" + rowFetched.get("Plats") + "\n");
        }catch(InfException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_selectCBActionPerformed

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
            java.util.logging.Logger.getLogger(AgentListAnAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentListAnAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentListAnAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentListAnAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentListAnAlienInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> selectCB;
    // End of variables declaration//GEN-END:variables
}