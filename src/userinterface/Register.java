package userinterface;

import javax.swing.JOptionPane;
import user.UserManager;

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
        jLabel3 = new javax.swing.JLabel();
        idNumField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dobDay = new javax.swing.JComboBox();
        dobMonth = new javax.swing.JComboBox();
        dobYear = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Αριθμός Ταυτότητας:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel1.add(idNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ημ/νία Γέννησης:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        dobDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dobDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 50, -1));

        dobMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(dobMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, -1));

        dobYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jPanel1.add(dobYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Φύλο:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        buttonGroup1.add(maleButton);
        maleButton.setText("Άνδρας");
        jPanel1.add(maleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        buttonGroup1.add(femaleButton);
        femaleButton.setText("Γυναίκα");
        jPanel1.add(femaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Τηλέφωνο:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        jPanel1.add(phoneNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Όνομα Χρήστη:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Κωδικός:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
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
    
    UserManager.getInstance().register(userName, String.valueOf(passWord));
    new Subscription(userName).setVisible(true);
    setVisible(false);
}//GEN-LAST:event_registerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox dobDay;
    private javax.swing.JComboBox dobMonth;
    private javax.swing.JComboBox dobYear;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField idNumField;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField surNameField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
