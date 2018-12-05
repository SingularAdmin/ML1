package View;

import javax.swing.JOptionPane;
import Controllers.UserManager;
import Model.User;

/**
 * @author Fakou
 */
public class Register extends javax.swing.JFrame 
{
    public Register()
    {
        setTitle("Δημιουργία Νέου Λογαριασμού");
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        surNameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surNameField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        idNumLabel = new javax.swing.JLabel();
        idNumField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobDay = new javax.swing.JComboBox();
        dobMonth = new javax.swing.JComboBox();
        dobYear = new javax.swing.JComboBox();
        sexLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        phoneNumLabel = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passWordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passWordField = new javax.swing.JPasswordField();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(575, 300));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Όνομα: ");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        surNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        surNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        surNameLabel.setText("Επίθετο: ");
        jPanel1.add(surNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, -1));
        jPanel1.add(surNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, -1));

        registerButton.setText("Εγγραφή");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 110, -1));

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 96, -1));

        idNumLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        idNumLabel.setText("Αριθμός Ταυτότητας:");
        jPanel1.add(idNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(idNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        dobLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Ημ/νία Γέννησης:");
        jPanel1.add(dobLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        dobDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dobDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 50, -1));

        dobMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(dobMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, -1));

        dobYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jPanel1.add(dobYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        sexLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexLabel.setText("Φύλο:");
        jPanel1.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        buttonGroup1.add(maleButton);
        maleButton.setText("Άνδρας");
        jPanel1.add(maleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        buttonGroup1.add(femaleButton);
        femaleButton.setText("Γυναίκα");
        jPanel1.add(femaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        phoneNumLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phoneNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumLabel.setText("Τηλέφωνο:");
        jPanel1.add(phoneNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(phoneNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("E-mail:");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, -1));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Όνομα Χρήστη:");
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        passWordLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passWordLabel.setText("Κωδικός:");
        jPanel1.add(passWordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel1.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, -1));
        jPanel1.add(passWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterBackground.jpg"))); // NOI18N
        backgroundImage.setText("jLabel1");
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 550, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    System.exit(0);
}//GEN-LAST:event_exitButtonActionPerformed

private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
    // Check if user inputted the required information.
    String userName = userNameField.getText();
    if (userNameField.getText().isEmpty() || nameField.getText().isEmpty() || surNameField.getText().isEmpty() || idNumField.getText().isEmpty() || emailField.getText().isEmpty() || phoneNumField.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα πεδία πρωτού πατήσετε το κουμπί Εγγραφή.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    if (!maleButton.isSelected() && !femaleButton.isSelected())
    {
        JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε το φύλο σας πρωτού πατήσετε το κουμπί Εγγραφή.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    char[] passWord = passWordField.getPassword();
    if (passWord.length < 5)
    {
        JOptionPane.showMessageDialog(null, "Ο κωδικός δε μπορεί να είναι κάτω από 5 ψηφία.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    // Check if username is already used.
    if (UserManager.getInstance().getUser(userName) != null)
    {
        JOptionPane.showMessageDialog(null, "Το όνομα χρήστη που εισάγατε υπάρχει ήδη.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    // Register the user in the database and show the subscription UI.
    UserManager.getInstance().register(userName, String.valueOf(passWord), nameField.getText(), surNameField.getText(), idNumField.getText(), String.valueOf(dobDay.getSelectedItem()) + "/" + String.valueOf(dobMonth.getSelectedItem()) + "/" + String.valueOf(dobYear.getSelectedItem()), maleButton.isSelected() ? "male" : "female", Long.parseLong(phoneNumField.getText()), emailField.getText());
    User u = UserManager.getInstance().getUser(userName);
    new UISubscription(u).setVisible(true);
    setVisible(false);
}//GEN-LAST:event_registerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox dobDay;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JComboBox dobMonth;
    private javax.swing.JComboBox dobYear;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField idNumField;
    private javax.swing.JLabel idNumLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField surNameField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
