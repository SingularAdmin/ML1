package userinterface;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author Fakou
 */
public class Subscription extends javax.swing.JFrame 
{
    private final List<String> _selectedCells = new ArrayList<String>();
    private boolean _pressingCTRL = false;
    
    public Subscription(String loggedInUsername)
    {
        initComponents();
        initUIandAddListeners(loggedInUsername);
    }
    
    private void initUIandAddListeners(String loggedInUsername)
    {
        setTitle("Συνδρομή σε προγράμματα");
        welcomeLabel.setText(welcomeLabel.getText().replace("%userName%", loggedInUsername));
        pack(); // To properly apply minimum/preferred size.
        
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
        
        MouseListener tableMouseListener = new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int row = scheduleTable.rowAtPoint(e.getPoint());
                int col = scheduleTable.columnAtPoint(e.getPoint());
                String newEntry =  row + " " + col;
                
                if (_pressingCTRL)
                {
                    if (_selectedCells.contains(newEntry))
                        _selectedCells.remove(newEntry);
                    else
                        _selectedCells.add(newEntry);
                }
                else
                {
                    _selectedCells.clear();
                    _selectedCells.add(newEntry);
                }
                
                // TODO: price calculation depending on selections. (atm it's static 5e for each program)
                costResultLabel.setText(_selectedCells.size() * 5 + "€");
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
        scheduleTable.setSelectionForeground(new java.awt.Color(102, 255, 0));
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
        getContentPane().add(costLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        costResultLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        costResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        costResultLabel.setText("0€");
        getContentPane().add(costResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        paymentButton.setText("Πληρωμή");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Πληρωμή με:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        paymentBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Μετρητά", "Πιστωτική Κάρτα" }));
        getContentPane().add(paymentBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 255, 0));
        infoLabel.setText("Επιλέξτε πρόγραμμα πατώντας αριστερό κλικ. Για να επιλέξετε πάνω από ένα, κρατήστε το πλήκτρο CTRL ενώ διαλέγετε.");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 680, 20));

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
        
        JOptionPane.showMessageDialog(null, "not done yet", "unfinished", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_paymentButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
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
