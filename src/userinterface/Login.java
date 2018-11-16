package userinterface;

import user.IncorrectUserException;
import user.UserManager;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame
{
    public Login()
    {
        setTitle("Σύνδεση στο σύστημα γυμναστηρίου");
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameField = new javax.swing.JTextField();
        passWordField = new javax.swing.JPasswordField();
        passWordLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        informationText = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));
        getContentPane().add(passWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 170, -1));

        passWordLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        passWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passWordLabel.setText("Κωδικός:");
        getContentPane().add(passWordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, -1));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Όνομα Χρήστη:");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

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
        getContentPane().add(informationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 20));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginBackground.jpg"))); // NOI18N
        backgroundImage.setMaximumSize(new java.awt.Dimension(300, 30));
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    dispose();
}//GEN-LAST:event_exitButtonActionPerformed

private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
    new Register().setVisible(true);
    setVisible(false);
}//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (userNameField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Το όνομα χρήστη δε μπορεί να είναι κενό.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (passWordField.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(null, "Ο κωδικός δε μπορεί να είναι κενός.", "Πρόβλημα κατά την Εγγραφή", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        UserManager um = new UserManager();
        try
        {
            String userName = userNameField.getText();
            um.login(userName, String.valueOf(passWordField.getPassword()));
            new Subscription(userName).setVisible(true);
            setVisible(false);
        }
        catch (IncorrectUserException e)
        {
            informationText.setForeground(Color.red);
            informationText.setText(e.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) 
    {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel informationText;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
