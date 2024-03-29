/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meninblack1;
import java.util.ArrayList;
import meninblack1.Database;
import oru.inf.InfException;

/**
 *
 * @author clara
 */
public class AgentChangeAlienInformation extends javax.swing.JFrame {
    public AgentChangeAlienInformation() {
        initComponents();
        fillCBalien();
        fillCBResAgent();
        fillCBrace();
        fillCBLocation();
    }
    // method fills combobox
private void fillCBLocation() {
        selectLocation.addItem("");
        selectLocation.removeItem("Item 1");
        selectLocation.removeItem("Item 2");
        selectLocation.removeItem("Item 3");
        selectLocation.removeItem("Item 4");
        try {
            // Fetch a list of location names from the database
            ArrayList<String> locations = Database.getDatabase().fetchColumn("select Benamning from plats");
            // Iterate through the fetched location names and add them to a JComboBox (selectLocation)
            for (String oneLocation : locations) {
                selectLocation.addItem(oneLocation);
            }
        } catch (InfException ex) {
            System.out.println(ex);
        }
    }
    private void fillCBrace(){
        selectRace.addItem("");
        selectRace.removeItem("Item 1");
        selectRace.removeItem("Item 2");
        selectRace.removeItem("Item 3");
        selectRace.removeItem("Item 4");
        selectRace.addItem("Boglodite");
        selectRace.addItem("Squid");
        selectRace.addItem("Worm");

    }
    private void fillCBResAgent() {
        changeResponsibleAgent.addItem("");
        changeResponsibleAgent.removeItem("Item 1");
        changeResponsibleAgent.removeItem("Item 2");
        changeResponsibleAgent.removeItem("Item 3");
        changeResponsibleAgent.removeItem("Item 4");

        try {
            ArrayList<String> emails = Database.getDatabase().fetchColumn("Select Epost from agent");
            for (String oneEmail : emails) {
                changeResponsibleAgent.addItem(oneEmail);
            }
        } catch (InfException ex) {
            System.out.println(ex);
        }
    }

    private void fillCBalien() {
        selectAlienIDcb.addItem("");
        selectAlienIDcb.removeItem("Item 1");
        selectAlienIDcb.removeItem("Item 2");
        selectAlienIDcb.removeItem("Item 3");
        selectAlienIDcb.removeItem("Item 4");
        try {
            ArrayList<String> emails = Database.getDatabase().fetchColumn("Select Epost from alien");
            for (String oneEmail : emails) {
                selectAlienIDcb.addItem(oneEmail);
            }
        } catch (InfException ex) {
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

        jLabel1 = new javax.swing.JLabel();
        numberUpdateEntry = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateInfoButton = new javax.swing.JButton();
        findAgentButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passwordUpdateEntry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        alienIdentifierEntry = new javax.swing.JTextField();
        currentNumberOut = new javax.swing.JTextField();
        currentLocationOut = new javax.swing.JTextField();
        currentPasswordOut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nameUpdateEntry = new javax.swing.JTextField();
        currentNameOut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        currentResponsibleOut = new javax.swing.JTextField();
        currentRace = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        changeResponsibleAgent = new javax.swing.JComboBox<>();
        selectAlienIDcb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        selectRace = new javax.swing.JComboBox<>();
        selectLocation = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        messageBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Enter information to update");

        jLabel2.setText("Phonenumber");

        updateInfoButton.setText("Update");
        updateInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoButtonActionPerformed(evt);
            }
        });

        findAgentButton.setText("Find alien");
        findAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAgentButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Location");

        goBackButton.setText("Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        jLabel5.setText("Alien to change");

        jLabel7.setText("Name");

        jLabel8.setText("Contact agent");

        currentResponsibleOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentResponsibleOutActionPerformed(evt);
            }
        });

        jLabel3.setText("Race");

        changeResponsibleAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectAlienIDcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Alien ID");

        selectRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("New Name");

        jLabel11.setText("New Number");

        jLabel12.setText("New Password");

        jLabel13.setText("New Location");

        jLabel14.setText("New Contact agent");

        jLabel15.setText("New Race");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(goBackButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentNameOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentNumberOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentPasswordOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentLocationOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentResponsibleOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentRace, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeResponsibleAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectRace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordUpdateEntry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberUpdateEntry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameUpdateEntry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateInfoButton)
                                .addGap(18, 18, 18)
                                .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(findAgentButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(selectAlienIDcb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alienIdentifierEntry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                        .addGap(0, 237, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAlienIDcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addComponent(findAgentButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienIdentifierEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentNameOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(nameUpdateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentNumberOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(numberUpdateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPasswordOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(passwordUpdateEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentLocationOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(selectLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentResponsibleOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(changeResponsibleAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(selectRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInfoButton)
                    .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoButtonActionPerformed
        // TODO add your handling code here:
        // Check if an alien ID is selected in the selectAlienIDcb JComboBox
        if (!selectAlienIDcb.getSelectedItem().toString().equals("")) {
            boolean check = true;
            try {
                String alienEmail = selectAlienIDcb.getSelectedItem().toString();
                int alienID = Integer.parseInt(Database.getDatabase().fetchSingle("select Alien_ID from alien where Epost ='" + alienEmail + "'"));
                 // Check if the passwordUpdateEntry field is not empty
                if (!passwordUpdateEntry.getText().isEmpty()) {
                    String password = passwordUpdateEntry.getText();
                    // Validate the password using a utility method (Validering.isValidPassword)
                    if (!Validering.isValidPassword(password)) {
                        check = false;
                        messageBox.setText("Password Error");
                    }
                    if (check) {
                        String updateQuery = "update alien set Losenord = '" + password + "' where Alien_ID =" + alienID;
                        Database.getDatabase().update(updateQuery);
                    }
                     // Clear and update the current password display
                    currentPasswordOut.setText("");
                    currentPasswordOut.setText(Database.getDatabase().fetchSingle("Select Losenord from alien where Alien_ID = " + alienID));
                    // Clear the passwordUpdateEntry field
                    passwordUpdateEntry.setText("");

                }  // Check if the numberUpdateEntry field is not empty
                if (!numberUpdateEntry.getText().isEmpty()) {
                    String number = numberUpdateEntry.getText();
                   // Validate the phone number using a utility method (Validering.isValidPhone)
                    if (!Validering.isValidPhone(number)) {
                        check = false;
                        messageBox.setText("Phonenumber Error");
                    }
                    if (check) {
                        String updateQuery = "update alien set Telefon = '" + number + "' where Alien_ID =" + alienID;
                        Database.getDatabase().update(updateQuery);
                    }
                    // Clear and update the current phone number display
                    currentNumberOut.setText("");
                    currentNumberOut.setText(Database.getDatabase().fetchSingle("Select Telefon from alien where Alien_ID = " + alienID));
                    numberUpdateEntry.setText("");
                }
                // Check if a location is selected in the selectLocation JComboBox
                if (!selectLocation.getSelectedItem().toString().equals("")) {
                    String locationName = selectLocation.getSelectedItem().toString();
                    // Fetch the location ID corresponding to the selected name from the database
                    String enQuery = "SELECT Plats_ID FROM plats WHERE Benamning = '" + locationName + "'";
                    int locationID = Integer.parseInt(Database.getDatabase().fetchSingle(enQuery));
                    String updateQuery = "update alien set Plats = " + locationID + " where Alien_ID =" + alienID;
                    Database.getDatabase().update(updateQuery);
                     // Clear and update the current location display
                    currentLocationOut.removeAll();
                    currentLocationOut.setText(Database.getDatabase().fetchSingle("Select Plats from alien where Alien_ID = " + alienID));
                } // Check if the nameUpdateEntry field is not empty
                if (!nameUpdateEntry.getText().isEmpty()) {
                    String name = nameUpdateEntry.getText();
                    // Validate the name using a utility method (Validering.isNameLetters)
                    if (!Validering.isNameLetters(name)) {
                        check = false;
                        messageBox.setText("Name Error");
                    }
                    if (check) {
                        String updateQuery = "update alien set Namn = '" + name + "' where Alien_ID =" + alienID;
                        Database.getDatabase().update(updateQuery);
                    }
                    currentNameOut.setText("");
                    currentNameOut.setText(Database.getDatabase().fetchSingle("Select Namn from alien where Alien_ID = " + alienID));
                    nameUpdateEntry.setText("");
                }
                if (!changeResponsibleAgent.getSelectedItem().toString().equals("")) {
                    String agentEmail = changeResponsibleAgent.getSelectedItem().toString();
                    int agentID = Integer.parseInt(Database.getDatabase().fetchSingle("select Agent_ID from agent where Epost ='" + agentEmail + "'"));
                    String updateQuery = "update alien set Ansvarig_Agent = " + agentID + " where Alien_ID =" + alienID;
                    Database.getDatabase().update(updateQuery);
                    currentResponsibleOut.setText(Database.getDatabase().fetchSingle("Select Ansvarig_Agent from alien where Alien_ID = " + alienID));
                }
                if (!selectRace.getSelectedItem().toString().equals("")) {
                    ArrayList<String> squids = Database.getDatabase().fetchColumn("select Alien_ID from squid");
                    ArrayList<String> bogs = Database.getDatabase().fetchColumn("select Alien_ID from boglodite");
                    ArrayList<String> worms = Database.getDatabase().fetchColumn("select Alien_ID from worm");

                    for (String oneSquidID : squids) {
                        if (oneSquidID.equals(Database.getDatabase().fetchSingle("select Alien_ID from alien where Epost ='" + alienEmail + "'"))) {
                            Database.getDatabase().delete("delete from squid where Alien_ID = (select Alien_ID from alien where Epost = '" + alienEmail + "')");
                        }
                    }
                    for (String oneBogID : bogs) {
                        if (oneBogID.equals(Database.getDatabase().fetchSingle("select Alien_ID from alien where Epost ='" + alienEmail + "'"))) {
                            Database.getDatabase().delete("delete from boglodite where Alien_ID = (select Alien_ID from alien where Epost = '" + alienEmail + "')");
                        }
                    }
                    for (String oneWormID : worms) {
                        if (oneWormID.equals(Database.getDatabase().fetchSingle("select Alien_ID from alien where Epost ='" + alienEmail + "'"))) {
                            Database.getDatabase().delete("delete from worm where Alien_ID = (select Alien_ID from alien where Epost = '" + alienEmail + "')");
                        }
                    }
                    String race = selectRace.getSelectedItem().toString().toLowerCase();
                    switch (race) {
                        case "squid":
                            currentRace.setText("Squid");
                            RegisterNewRaceSquid framesquid = new RegisterNewRaceSquid(alienID);
                            framesquid.setVisible(true);
                            break;
                        case "worm":
                            currentRace.setText("Worm");
                            RegisterNewRaceWorm frameworm = new RegisterNewRaceWorm(alienID);
                            frameworm.setVisible(true);
                            break;
                        case "boglodite":
                            currentRace.setText("Boglodite");
                            RegisterNewRaceBoglodite framebog = new RegisterNewRaceBoglodite(alienID);
                            framebog.setVisible(true);
                            break;
                    }

                }
            } catch (InfException ex) {
                System.out.println(ex);
            }
        } else {
            messageBox.setText("Enter agent");
        }


    }//GEN-LAST:event_updateInfoButtonActionPerformed

    private void findAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findAgentButtonActionPerformed
        // TODO add your handling code here:
        currentRace.setText("");
        String alienEmail = selectAlienIDcb.getSelectedItem().toString();

        try{
            String fetchID = "SELECT Alien_ID FROM alien WHERE Epost = '"+alienEmail+"'";
            String alienID = Database.getDatabase().fetchSingle(fetchID);
            ArrayList<String> worms = Database.getDatabase().fetchColumn("select Alien_ID from worm");
            ArrayList<String> squids = Database.getDatabase().fetchColumn("select Alien_ID from squid");
            ArrayList<String> bogs = Database.getDatabase().fetchColumn("select Alien_ID from boglodite");
            currentNumberOut.setText(Database.getDatabase().fetchSingle("Select Telefon from alien where Alien_ID = "+ alienID));
            currentPasswordOut.setText(Database.getDatabase().fetchSingle("Select Losenord from alien where Alien_ID = "+ alienID));
            currentLocationOut.setText(Database.getDatabase().fetchSingle("Select Plats from alien where Alien_ID = "+ alienID));
            currentNameOut.setText(Database.getDatabase().fetchSingle("Select Namn from alien where Alien_ID = "+ alienID));
            currentResponsibleOut.setText(Database.getDatabase().fetchSingle("Select Ansvarig_Agent from alien where Alien_ID = "+ alienID));
            for(String oneWorm:worms){
                if(oneWorm.equals(alienID)){
                currentRace.setText("Worm");
                }
            }
            for(String oneSquid:squids){
                if(oneSquid.equals(alienID)){
                currentRace.setText("Squid");
                }
            }

            for(String oneBog:bogs){
                if(oneBog.equals(alienID)){
                currentRace.setText("Boglodite");
                }
            }
            alienIdentifierEntry.setText(alienID);
        } catch (InfException ex) {
            System.out.println(ex);
        }



    }//GEN-LAST:event_findAgentButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        AgentStartWindow frame = new AgentStartWindow();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void currentResponsibleOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentResponsibleOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentResponsibleOutActionPerformed

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
            java.util.logging.Logger.getLogger(AgentChangeAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentChangeAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentChangeAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentChangeAlienInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AgentChangeAlienInformation().setVisible(true);
            }
        });
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alienIdentifierEntry;
    private javax.swing.JComboBox<String> changeResponsibleAgent;
    private javax.swing.JTextField currentLocationOut;
    private javax.swing.JTextField currentNameOut;
    private javax.swing.JTextField currentNumberOut;
    private javax.swing.JTextField currentPasswordOut;
    private javax.swing.JTextField currentRace;
    private javax.swing.JTextField currentResponsibleOut;
    private javax.swing.JButton findAgentButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageBox;
    private javax.swing.JTextField nameUpdateEntry;
    private javax.swing.JTextField numberUpdateEntry;
    private javax.swing.JTextField passwordUpdateEntry;
    private javax.swing.JComboBox<String> selectAlienIDcb;
    private javax.swing.JComboBox<String> selectLocation;
    private javax.swing.JComboBox<String> selectRace;
    private javax.swing.JButton updateInfoButton;
    // End of variables declaration//GEN-END:variables


}
