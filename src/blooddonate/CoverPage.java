/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonate;

/**
 *
 * @author SR
 */
public class CoverPage extends javax.swing.JFrame {

    /**
     * Creates new form CoverPage
     */
    public CoverPage() {
        initComponents();
        this.setBounds(100,50,900,700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Donation = new javax.swing.JButton();
        needed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        DonnerShort = new javax.swing.JMenuItem();
        SignInShort = new javax.swing.JMenuItem();
        SignUpShort = new javax.swing.JMenuItem();
        NeedBloodShort = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jTextField2.setFont(new java.awt.Font("Adobe Garamond Pro", 2, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 102, 255));
        jTextField2.setText("What Do You Want?");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Adobe Garamond Pro", 2, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 102, 255));
        jTextField1.setText("Welcome To System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setLayout(null);

        Donation.setBackground(new java.awt.Color(51, 51, 255));
        Donation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Donation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/blood-donation.png"))); // NOI18N
        Donation.setText("1. Donete Blood");
        Donation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonationActionPerformed(evt);
            }
        });
        jPanel1.add(Donation);
        Donation.setBounds(300, 230, 230, 41);

        needed.setBackground(new java.awt.Color(51, 51, 255));
        needed.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 24)); // NOI18N
        needed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/blood.png"))); // NOI18N
        needed.setText("2. Needed Blood");
        needed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neededActionPerformed(evt);
            }
        });
        jPanel1.add(needed);
        needed.setBounds(300, 303, 240, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setText("Welcome to System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 30, 522, 53);

        jLabel2.setBackground(new java.awt.Color(0, 63, 176));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("What Do You Want?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 160, 360, 36);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/new.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 700);

        jMenu3.setText("File");

        DonnerShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        DonnerShort.setText("Donner Panel");
        DonnerShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonnerShortActionPerformed(evt);
            }
        });
        jMenu3.add(DonnerShort);

        SignInShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SignInShort.setText("Sign In");
        SignInShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInShortActionPerformed(evt);
            }
        });
        jMenu3.add(SignInShort);

        SignUpShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        SignUpShort.setText("Sign Up");
        SignUpShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpShortActionPerformed(evt);
            }
        });
        jMenu3.add(SignUpShort);

        NeedBloodShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        NeedBloodShort.setText("Need Blood");
        NeedBloodShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeedBloodShortActionPerformed(evt);
            }
        });
        jMenu3.add(NeedBloodShort);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void DonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonationActionPerformed
        // TODO add your handling code here:
        DonnorPanel donnor= new DonnorPanel();
        donnor.setVisible(true);
    }//GEN-LAST:event_DonationActionPerformed

    private void neededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neededActionPerformed
        // TODO add your handling code here:
        BloodDonation donation= new BloodDonation();
        donation.setVisible(true);
    }//GEN-LAST:event_neededActionPerformed

    private void NeedBloodShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeedBloodShortActionPerformed
        // TODO add your handling code here:
        BloodDonation donation= new BloodDonation();
        donation.setVisible(true);
    }//GEN-LAST:event_NeedBloodShortActionPerformed

    private void DonnerShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonnerShortActionPerformed
        // TODO add your handling code here:
        DonnorPanel donnor= new DonnorPanel();
        donnor.setVisible(true);
    }//GEN-LAST:event_DonnerShortActionPerformed

    private void SignInShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInShortActionPerformed
        // TODO add your handling code here:
        SignIn SI=new SignIn();
        SI.setVisible(true);
    }//GEN-LAST:event_SignInShortActionPerformed

    private void SignUpShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpShortActionPerformed
        // TODO add your handling code here:
        SignUp SU=new SignUp();
        SU.setVisible(true);
    }//GEN-LAST:event_SignUpShortActionPerformed

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
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoverPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Donation;
    private javax.swing.JMenuItem DonnerShort;
    private javax.swing.JMenuItem NeedBloodShort;
    private javax.swing.JMenuItem SignInShort;
    private javax.swing.JMenuItem SignUpShort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton needed;
    // End of variables declaration//GEN-END:variables
}