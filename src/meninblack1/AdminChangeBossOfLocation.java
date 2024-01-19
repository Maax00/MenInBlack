/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack1;
import java.util.ArrayList;
import oru.inf.InfException;

/**
 *
 * @author maxli
 */
public class AdminChangeBossOfLocation extends javax.swing.JFrame {

    /**
     * Creates new form AdminChangeBossOfLocation
     */
    public AdminChangeBossOfLocation() {
        initComponents();
        fillCB();
        fillCB2();
    }
    // This method is responsible for populating a JComboBox (selectLocationCB) with area names
    private void fillCB(){
        String fillQuery = "select Benamning from omrade";
        selectLocationCB.addItem("");
        selectLocationCB.removeItem("Item 1");
        selectLocationCB.removeItem("Item 2");
        selectLocationCB.removeItem("Item 3");
        selectLocationCB.removeItem("Item 4");
        try{
            // Fetch the list of area names from the database
            ArrayList<String> names = Database.getDatabase().fetchColumn(fillQuery);
             // Iterate through the list of area names and add each name to the JComboBox (selectLocationCB)
            for(String oneName:names){
                selectLocationCB.addItem(oneName);
            }
        }catch(InfException ex){
            System.out.println(ex);
        }
    }
    
    private void fillCB2(){
        String fillQuery = "select Namn from agent where Agent_ID not in (select Agent_ID from omradeschef)";
        selectBossCB.addItem("");
        selectBossCB.removeItem("Item 1");
        selectBossCB.removeItem("Item 2");
        selectBossCB.removeItem("Item 3");
        selectBossCB.removeItem("Item 4");
        try{
            ArrayList<String> names = Database.getDatabase().fetchColumn(fillQuery);
            for(String oneName:names){
                selectBossCB.addItem(oneName);
            }
        }catch(InfException ex){
            System.out.println(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectLocationCB = new javax.swing.JComboBox<>();
        currentBossOfArea = new javax.swing.JTextField();
        goBack = new javax.swing.JButton();
        selectBossCB = new javax.swing.JComboBox<>();
        newBossEntry = new javax.swing.JTextField();
        completeMessage = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectLocationCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectLocationCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectLocationCBActionPerformed(evt);
            }
        });

        goBack.setText("Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        selectBossCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectBossCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBossCBActionPerformed(evt);
            }
        });

        completeMessage.setBackground(new java.awt.Color(242, 242, 242));
        completeMessage.setBorder(null);

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select location");

        jLabel2.setText("Current boss of location");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Change boss of location");

        jLabel4.setText("Select agent");

        jLabel6.setText("New boss of location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(selectLocationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectBossCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmButton)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newBossEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentBossOfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(completeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectLocationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentBossOfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectBossCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBossEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(goBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        AdminStartWindow frame = new AdminStartWindow();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void selectLocationCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectLocationCBActionPerformed
        // TODO add your handling code here:
        currentBossOfArea.setText("");
        String area = selectLocationCB.getSelectedItem().toString();
    String setNewBossQuery = "select Namn from agent where Agent_ID in (select Agent_ID from omradeschef where Omrade in (select Omrades_ID from omrade where Benamning = '" + area+ "'))";
        try{
            
            currentBossOfArea.setText(Database.getDatabase().fetchSingle(setNewBossQuery));

        }catch(InfException ex){
            System.out.print(ex);
        }
    }//GEN-LAST:event_selectLocationCBActionPerformed

    private void selectBossCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBossCBActionPerformed
        // TODO add your handling code here:
        String newBoss = selectBossCB.getSelectedItem().toString();
        newBossEntry.setText(newBoss);
        
    }//GEN-LAST:event_selectBossCBActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        try {

            String updateQuery = "update omradeschef set Agent_ID = (select Agent_ID from agent where Namn = '" + newBossEntry.getText() + "') where Omrade = (select Omrades_ID from omrade where Benamning = '" + selectLocationCB.getSelectedItem().toString() + "')";
            //update omradeschef set Agent_ID = (select Agent_ID from agent where Namn = 'Agent Z') where Omrade = (select omrades_ID from Omrade where Benamning = 'Norrland');
            completeMessage.setText("Complete");
            Database.getDatabase().update(updateQuery);
            //
            boolean newEntryCheck = true;
            String newLocationName = selectLocationCB.getSelectedItem().toString();
            System.out.println(newLocationName);
            String getNewLocation = "select Omrades_ID from omrade where Benamning = '"+newLocationName+"'";
            System.out.println(getNewLocation);
            String result = Database.getDatabase().fetchSingle(getNewLocation);
            System.out.println("new result " + result);
            ArrayList<String> locationIDs = Database.getDatabase().fetchColumn("select Omrade from omradeschef");
            for(String oneLocationID : locationIDs){
                if(oneLocationID.equals(result)){
                    newEntryCheck = false;
                }
            }
            if(newEntryCheck){
                String agentIDstringQuery = "select Agent_ID from agent where Namn = '"+selectBossCB.getSelectedItem().toString()+"'";
                String agentIDstring = Database.getDatabase().fetchSingle(agentIDstringQuery);
                int agent_ID = Integer.parseInt(agentIDstring);
                System.out.println(agent_ID);
                int location_ID = Integer.parseInt(result);
                String insertQuery = "insert into omradeschef values ("+agent_ID+", "+location_ID+")";
                System.out.println(insertQuery);
                Database.getDatabase().insert(insertQuery);
            }
            //
        } catch (InfException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminChangeBossOfLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminChangeBossOfLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminChangeBossOfLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminChangeBossOfLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminChangeBossOfLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField completeMessage;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField currentBossOfArea;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField newBossEntry;
    private javax.swing.JComboBox<String> selectBossCB;
    private javax.swing.JComboBox<String> selectLocationCB;
    // End of variables declaration//GEN-END:variables
}
