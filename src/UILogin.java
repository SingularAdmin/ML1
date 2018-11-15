import java.awt.Color;

public class UILogin extends javax.swing.JFrame
{
    public UILogin()
    {
        setTitle("Σύνδεση στο σύστημα γυμναστηρίου");
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserNameField = new javax.swing.JTextField();
        PasswdField = new javax.swing.JPasswordField();
        passWordLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        informationText = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, -1));

        PasswdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));

        passWordLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        passWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passWordLabel.setText("Κωδικός:");
        getContentPane().add(passWordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, -1));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Όνομα Χρήστη:");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        loginButton.setText("Είσοδος");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 96, 20));

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 96, 20));

        registerButton.setText("Νέος Χρήστης - Εγγραφή");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 188, -1));

        informationText.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        informationText.setForeground(new java.awt.Color(0, 255, 0));
        informationText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        informationText.setText("Εισάγετε τα στοιχεία σας");
        getContentPane().add(informationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 20));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.jpg"))); // NOI18N
        backgroundImage.setMaximumSize(new java.awt.Dimension(300, 30));
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    dispose();
}//GEN-LAST:event_exitButtonActionPerformed

private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
    new UIRegister().setVisible(true);
    setVisible(false);
}//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try 
        {
            cLogin cl = new cLogin();
            cl.createU();
            try
            {
                User u = cl.login(UserNameField.getText(), PasswdField.getPassword());
                informationText.setText(u.getUserName());
            }
            catch (UserNotFoundException ex)
            {
                //Logger.getLogger(UILogin.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
                informationText.setForeground(Color.red);
                informationText.setText(ex.getMessage());
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("null pointer error: ");
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void PasswdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswdFieldActionPerformed

    public static void main(String args[]) 
    {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new UILogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswdField;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel informationText;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
