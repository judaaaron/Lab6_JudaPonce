/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class messenger_main extends javax.swing.JFrame {

    /**
     * Creates new form messenger_main
     */
    public messenger_main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        bt_Ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_salir = new javax.swing.JButton();
        jl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));
        getContentPane().add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 160, 30));
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 170, 30));

        bt_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entry32.png"))); // NOI18N
        bt_Ingresar.setContentAreaFilled(false);
        bt_Ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entry.png"))); // NOI18N
        bt_Ingresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entry.png"))); // NOI18N
        getContentPane().add(bt_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 80, 90));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        bt_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        bt_salir.setContentAreaFilled(false);
        bt_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit (1).png"))); // NOI18N
        bt_salir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit (1).png"))); // NOI18N
        bt_salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        getContentPane().add(bt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 120, 100));

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallMessenger.jpg"))); // NOI18N
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(messenger_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messenger_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messenger_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messenger_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messenger_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Ingresar;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl_fondo;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
