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
public class AdminProfile extends javax.swing.JFrame {

    /**
     * Creates new form AdminProfile
     */
    public AdminProfile() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 36)); // NOI18N
        jLabel4.setText("ADMIN Profile");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(291, 16, 350, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 110);

        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel1.setText("Name: Md. Shaidur Rahman");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(60, 80, 490, 30);

        jLabel2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel2.setText("Phone Number: +880192466221");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 120, 350, 18);

        jLabel3.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel3.setText("Blood Group: AB+");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 150, 380, 30);

        jLabel5.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel5.setText("Age: 21");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 200, 370, 18);

        jLabel6.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabel6.setText("weight : 60kg ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(80, 230, 140, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/new.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-19, -160, 900, 700);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 160, 840, 520);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonate/mr n.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1, 110, 900, 590);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AdminDeshboard AD= new AdminDeshboard();
        AD.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
