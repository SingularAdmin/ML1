package View;

import Controllers.CSubscription;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import Model.Subscription;
import Model.User;

/**
 * @author Fakou
 */
public class UISubscription extends javax.swing.JFrame
{
    private final List<String> _selectedCells = new ArrayList<String>();
    private boolean _pressingCTRL = false;
    private double _cost = 0;
    private User u;
    
    public UISubscription(User u)
    {
        this.u = u; 
        initComponents();
        initUIandAddListeners(u);
    }
  
    public UISubscription()
    {
       
    }
    
    private void initUIandAddListeners(User u)
    {
        setTitle("Συνδρομή σε προγράμματα");
        welcomeLabel.setText(welcomeLabel.getText().replace("%userName%", u.getUserName()));
        pack(); // To properly apply minimum/preferred size.
        
        // Hide all card's objects.
        hideCardObjects();
        
        // Color the selected cells.
        scheduleTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer()
        {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
            {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setForeground(Color.WHITE);
                
                boolean containedInArray = _selectedCells.contains(row + " " + column);
                if ((isSelected && containedInArray) || (containedInArray && _selectedCells.size() != 1))
                    setForeground(new Color(102, 255, 0));
                
               return component;
            }
        });
        
        // Make the table transparent.
        scheduleTable.setOpaque(false);
        ((DefaultTableCellRenderer) scheduleTable.getDefaultRenderer(Object.class)).setOpaque(false);
        scheduleScrollPane.setOpaque(false);
        scheduleScrollPane.getViewport().setOpaque(false);
        
        // Check if CTRL is pressed or not.
        KeyListener tableKeyListener = new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_CONTROL)
                    _pressingCTRL = true;
            }
            
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_CONTROL)
                    _pressingCTRL = false;
            }
        };
        
        // Listen for the mouse click and manipulate the costResultLabel depending on how many cells are selected.
        MouseListener tableMouseListener = new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int row = scheduleTable.rowAtPoint(e.getPoint());
                int column = scheduleTable.columnAtPoint(e.getPoint());
                String newEntry =  row + " " + column;
                String program = scheduleTable.getModel().getValueAt(row, column).toString();
                scheduleTable.setSelectionForeground(Color.WHITE); // Reset the color of the cells.
                
                if (_pressingCTRL)
                {
                    if (_selectedCells.contains(newEntry))
                    {
                        _selectedCells.remove(newEntry);
                        calculateCost(program, true);
                    }
                    else
                    {
                        _selectedCells.add(newEntry);
                        calculateCost(program, false);
                    }
                }
                else
                {
                    _selectedCells.clear();
                    _cost = 0;
                    _selectedCells.add(newEntry);
                    calculateCost(program, false);
                }
                
                costResultLabel.setText(_cost + "€");
            }
        };
   
        scheduleTable.addKeyListener(tableKeyListener);
        scheduleTable.addMouseListener(tableMouseListener);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        scheduleScrollPane = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        costLabel = new javax.swing.JLabel();
        costResultLabel = new javax.swing.JLabel();
        paymentButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paymentBox = new javax.swing.JComboBox<String>();
        infoLabel = new javax.swing.JLabel();
        cardNumLabel = new javax.swing.JLabel();
        cardExpirationLabel = new javax.swing.JLabel();
        cardCvvLabel = new javax.swing.JLabel();
        cardNameLabel = new javax.swing.JLabel();
        cardNumField = new javax.swing.JTextField();
        cardCvvField = new javax.swing.JTextField();
        cardNameField = new javax.swing.JTextField();
        cardExpMonthBox = new javax.swing.JComboBox();
        cardExpYearBox = new javax.swing.JComboBox();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(525, 300));
        setMinimumSize(new java.awt.Dimension(860, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(860, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Καλώς ήρθατε %userName%. Επιλέξτε προγράμματα που σας ενδιαφέρουν να ακολουθησέτε και μεταβείτε στην πληρωμή.");
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        scheduleTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scheduleTable.setForeground(new java.awt.Color(255, 255, 255));
        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8-10: TRX", "8-10: Γιόγκα", "8-10: Abs-Hips", "8-10: Πιλάτες", "8-10: BodyPump", "8-10: BodyAttack", "8-10: BodyPump"},
                {"10-12: Πιλάτες", "10-12: BodyPump", "10-12: Γιόγκα", "10-12: BodyPump", "10-12: Πιλάτες", "10-12: Γιόγκα", "10-12: Γιόγκα"},
                {"12-14: BodyPump", "12-14: TRX", "12-14: Πιλάτες", "12-14: TRX", "12-14: TRX", "12-14: Abs-Hips", "12-14: BodyCombat"},
                {"14-16: Abs-Hips", "14-16: Πιλάτες", "14-16: BodyAttack", "14-16: BodyAttack", "14-16: Γιόγκα", "14-16: Πιλάτες", "14-16: Hips-Abs"},
                {"16-18: BodyAttack", "16-18: BodyPump", "16-18: BodyPump", "16-18: Γιόγκα", "16-18: BodyAttack", "16-18: BodyPump", "16-18: BodyAttack"},
                {"18-20: BodyCombat", "18-20: Abs-Hips", "18-20: BodyCombat", "18-20: BodyPump", "18-20: Abs-Hips", "18-20: BodyCombat", "18-20: Πιλάτες"}
            },
            new String [] {
                "Δευτέρα", "Τρίτη", "Τετάρτη", "Πέμπτη", "Παρασκευή", "Σάββατο", "Κυριακή"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scheduleTable.setCellSelectionEnabled(true);
        scheduleTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scheduleTable.getTableHeader().setResizingAllowed(false);
        scheduleTable.getTableHeader().setReorderingAllowed(false);
        scheduleScrollPane.setViewportView(scheduleTable);
        if (scheduleTable.getColumnModel().getColumnCount() > 0) {
            scheduleTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleTable.getColumnModel().getColumn(3).setResizable(false);
            scheduleTable.getColumnModel().getColumn(4).setResizable(false);
            scheduleTable.getColumnModel().getColumn(5).setResizable(false);
            scheduleTable.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(scheduleScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 810, 120));

        costLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        costLabel.setForeground(new java.awt.Color(255, 255, 255));
        costLabel.setText("Συνολικό κόστος:");
        getContentPane().add(costLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        costResultLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        costResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        costResultLabel.setText("0€");
        getContentPane().add(costResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        paymentButton.setText("Πληρωμή");
        paymentButton.setMaximumSize(new java.awt.Dimension(69, 23));
        paymentButton.setMinimumSize(new java.awt.Dimension(69, 23));
        paymentButton.setPreferredSize(new java.awt.Dimension(69, 23));
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 390, 100, -1));

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Πληρωμή με:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        paymentBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Μετρητά", "Κάρτα" }));
        paymentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBoxActionPerformed(evt);
            }
        });
        getContentPane().add(paymentBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 255, 0));
        infoLabel.setText("Επιλέξτε πρόγραμμα πατώντας αριστερό κλικ. Για να επιλέξετε πάνω από ένα, κρατήστε το πλήκτρο CTRL ενώ διαλέγετε.");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 680, 20));

        cardNumLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardNumLabel.setText("Αριθμός Κάρτας:");
        getContentPane().add(cardNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        cardExpirationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardExpirationLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardExpirationLabel.setText("Ημερομηνία Λήξης:");
        getContentPane().add(cardExpirationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        cardCvvLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardCvvLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardCvvLabel.setText("CVV:");
        getContentPane().add(cardCvvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        cardNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardNameLabel.setText("Όνομα στην Κάρτα:");
        getContentPane().add(cardNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));
        getContentPane().add(cardNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 170, -1));
        getContentPane().add(cardCvvField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 40, -1));
        getContentPane().add(cardNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 170, -1));

        cardExpMonthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(cardExpMonthBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 40, -1));

        cardExpYearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        getContentPane().add(cardExpYearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 60, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterBackground.jpg"))); // NOI18N
        backgroundImage.setText("jLabel2");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        if (_selectedCells.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε ένα απ'τα διαθέσιμα προγράμματα για να ολοκληρώσετε τη συνδρομή σας.", "Πρόβλημα κατά τη δήλωση προγραμμάτων.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!paymentBox.getSelectedItem().equals("Μετρητά") && (cardNameField.getText().isEmpty() || cardNumField.getText().length() < 8 || cardCvvField.getText().length() < 3))
        {
            JOptionPane.showMessageDialog(null, "Παρακαλώ εισάγετε ορθά στοιχειά της κάρτας σας.", "Πρόβλημα κατά την πληρωμή.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        CSubscription c = new CSubscription();
        c.newSubscription(u,_cost);
        
        
        
        
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void paymentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBoxActionPerformed
        if (!paymentBox.getSelectedItem().equals("Μετρητά"))
        {
            cardNameLabel.setVisible(true);
            cardNumLabel.setVisible(true);
            cardExpirationLabel.setVisible(true);
            cardCvvLabel.setVisible(true);
            cardNameField.setVisible(true);
            cardNumField.setVisible(true);
            cardExpMonthBox.setVisible(true);
            cardExpYearBox.setVisible(true);
            cardCvvField.setVisible(true);
        }
        else
            hideCardObjects();
    }//GEN-LAST:event_paymentBoxActionPerformed
    
    private void hideCardObjects()
    {
        cardNameLabel.setVisible(false);
        cardNumLabel.setVisible(false);
        cardExpirationLabel.setVisible(false);
        cardCvvLabel.setVisible(false);
        cardNameField.setVisible(false);
        cardNumField.setVisible(false);
        cardExpMonthBox.setVisible(false);
        cardExpYearBox.setVisible(false);
        cardCvvField.setVisible(false);
    }
    
    private void calculateCost(String program, boolean reduce)
    {
        int tempCost = 0;
        if (program.contains("TRX") || program.contains("Πιλάτες"))
            tempCost += 25;
        else if (program.contains("Γιόγκα") || program.contains("Abs-Hips"))
            tempCost += 20;
        else
            tempCost += 15;
        
        if (!reduce)
            _cost += tempCost;
        else
            _cost -= tempCost;
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField cardCvvField;
    private javax.swing.JLabel cardCvvLabel;
    private javax.swing.JComboBox cardExpMonthBox;
    private javax.swing.JComboBox cardExpYearBox;
    private javax.swing.JLabel cardExpirationLabel;
    private javax.swing.JTextField cardNameField;
    private javax.swing.JLabel cardNameLabel;
    private javax.swing.JTextField cardNumField;
    private javax.swing.JLabel cardNumLabel;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel costResultLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> paymentBox;
    private javax.swing.JButton paymentButton;
    private javax.swing.JScrollPane scheduleScrollPane;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}