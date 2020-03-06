
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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

        setResizable(false);
        setTitle(" Messenger");
        this.setLocationRelativeTo(null);

        adminUsuarios ap = new adminUsuarios("./Users.txt");
        ap.cargarArchivo();

        for (Usuario p : ap.getPersonitas()) {
            personas.add(p);

        }

        for (int i = 0; i < personas.size(); i++) {
            area2.append("\n" + personas.get(i).getDisplay());
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

        jd_registrarse = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bt_Registrar = new javax.swing.JButton();
        bt_atras = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        tf_contra = new javax.swing.JPasswordField();
        j_calendario = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_fondo2 = new javax.swing.JLabel();
        chat = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        tf_metodos = new javax.swing.JTextField();
        bt_enviarMensaje = new javax.swing.JButton();
        bt_guardarConversacion = new javax.swing.JButton();
        bt_Salir2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        bt_Ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jl_fondo = new javax.swing.JLabel();

        jd_registrarse.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrarse");
        jd_registrarse.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario");
        jd_registrarse.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        jd_registrarse.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de nacimiento");
        jd_registrarse.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        bt_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/forms.png"))); // NOI18N
        bt_Registrar.setContentAreaFilled(false);
        bt_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RegistrarMouseClicked(evt);
            }
        });
        jd_registrarse.getContentPane().add(bt_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, 80));

        bt_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return64.png"))); // NOI18N
        bt_atras.setContentAreaFilled(false);
        bt_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_atrasMouseClicked(evt);
            }
        });
        jd_registrarse.getContentPane().add(bt_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 70, 80));
        jd_registrarse.getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 120, -1));

        tf_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usuarioActionPerformed(evt);
            }
        });
        jd_registrarse.getContentPane().add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 120, -1));
        jd_registrarse.getContentPane().add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, -1));
        jd_registrarse.getContentPane().add(j_calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Atrás");
        jd_registrarse.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jd_registrarse.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lb_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallMessenger.jpg"))); // NOI18N
        jd_registrarse.getContentPane().add(lb_fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        chat.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        chat.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 470));

        area2.setColumns(20);
        area2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        area2.setRows(5);
        area2.setText("CONTACTOS");
        jScrollPane2.setViewportView(area2);

        chat.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 200, 470));
        chat.getContentPane().add(tf_metodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 690, 80));

        bt_enviarMensaje.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt_enviarMensaje.setForeground(new java.awt.Color(255, 255, 255));
        bt_enviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plane.png"))); // NOI18N
        bt_enviarMensaje.setContentAreaFilled(false);
        bt_enviarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarMensajeMouseClicked(evt);
            }
        });
        chat.getContentPane().add(bt_enviarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 80, 80));

        bt_guardarConversacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document.png"))); // NOI18N
        bt_guardarConversacion.setContentAreaFilled(false);
        bt_guardarConversacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardarConversacionMouseClicked(evt);
            }
        });
        chat.getContentPane().add(bt_guardarConversacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 80, 70));

        bt_Salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout (1).png"))); // NOI18N
        bt_Salir2.setContentAreaFilled(false);
        bt_Salir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_Salir2MouseClicked(evt);
            }
        });
        chat.getContentPane().add(bt_Salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 80, 70));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salir del chat");
        chat.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 80, -1));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enviar Mensaje");
        chat.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Guardar Conversación en archivos");
        chat.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, -1));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wlaw.jpg"))); // NOI18N
        chat.getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

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
        bt_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_IngresarMouseClicked(evt);
            }
        });
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

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿No tienes cuenta?  Click here");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallMessenger.jpg"))); // NOI18N
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usuarioActionPerformed

    private void bt_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_atrasMouseClicked
        jd_registrarse.setVisible(false);
    }//GEN-LAST:event_bt_atrasMouseClicked

    private void bt_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RegistrarMouseClicked
        String nombre = tf_nombre.getText();
        String password = tf_contra.getText();
        String display = tf_usuario.getText();
        String calendario = j_calendario.getDate().toString();

        personas.add(new Usuario(nombre, password, display, calendario));
        boolean control = false;
//        for (int i = 0; i < personas.size(); i++) {
//            if (personas.get(i).getDisplay().equals(display)) {
//                JOptionPane.showMessageDialog(this, "Lo sentimos este nombre de usuario ya exite");
//                control = true;
//                tf_usuario.setText("");
//                break;
//
//            } else {
//                control = false;
//            }
//
//        }

        adminUsuarios ap = new adminUsuarios("./Users.txt");
        //ap.cargarArchivo();
        Usuario p = new Usuario(nombre, password, display, calendario);
        ap.getPersonitas().add(p);

        try {
            ap.escribirArchivo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        JOptionPane.showMessageDialog(this, " Ha sido registrado exitosamente");

        tf_user.setText("");
        tf_contra.setText("");
        tf_usuario.setText("");


    }//GEN-LAST:event_bt_RegistrarMouseClicked

    private void bt_enviarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarMensajeMouseClicked
        String cadena = tf_metodos.getText();
        MetodosCadena m = new MetodosCadena();
        int pos = cadena.indexOf(':');// uso del index of para saber su posicion y asi poder usar el metodo de substring
        String nueva = cadena.substring(pos + 2, cadena.length());
        neww = cadena.substring(pos + 2, cadena.length() - 1);
        if (nueva.charAt(nueva.length() - 1) == '1') {
            JOptionPane.showMessageDialog(null, "entro a la opcion1");
            nueva2 = m.concatenado(neww);
            area1.append("\n" + "Usuario: " + neww + "\n" + "Maquina: " + nueva2);
            tf_metodos.setText("");

        } else if (nueva.charAt(nueva.length() - 1) == '2') {
            JOptionPane.showMessageDialog(null, "entro a la opcion2");
            nueva2 = m.ReplaceAscii(neww);

            area1.append("\n" + "Usuario: " + neww + "\n" + "Maquina: " + nueva2);
            tf_metodos.setText("");

        } else if (nueva.charAt(nueva.length() - 1) == '3') {
            JOptionPane.showMessageDialog(null, "entro a la opcion 3");
            nueva2 = m.patron3(neww);
            area1.append("\n" + "Usuario: " + neww + "\n" + "Maquina: " + nueva2);
            tf_metodos.setText("");

        } else if (nueva.length() >= 13 && nueva.charAt(nueva.length() - 1) == '4') {
            JOptionPane.showMessageDialog(null, "entro a la opcion 4");
        } else {
            JOptionPane.showMessageDialog(null, "La cadena no posee ningun numero dentro del rango solicitado");
        }
    }//GEN-LAST:event_bt_enviarMensajeMouseClicked

    private void bt_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_IngresarMouseClicked
        String dis = tf_user.getText();
        String pas = tf_password.getText();
        boolean entrar = false;
        tf_metodos.setText(dis + ": ");

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDisplay().equals(dis) && personas.get(i).getPassword().equals(pas)) {

                JOptionPane.showMessageDialog(this, " Bienvenido " + dis);
                chat.pack();
                chat.setModal(true);
                chat.setLocationRelativeTo(this);
                chat.setVisible(true);

                entrar = true;
                // flag = i;
                tf_user.setText("");
                tf_password.setText("");

                break;

            }

        }
        //  System.out.println(entrar);

        if (entrar == false) {
            JOptionPane.showMessageDialog(this, " Usuario y/o contraseña ");
            tf_user.setText("");
            tf_password.setText("");
        }
    }//GEN-LAST:event_bt_IngresarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        jd_registrarse.pack();
        jd_registrarse.setModal(true);
        jd_registrarse.setLocationRelativeTo(this);
        jd_registrarse.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void bt_guardarConversacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardarConversacionMouseClicked
        String archi = JOptionPane.showInputDialog(null, "Escriba el nombre del archivo para guardar el chat");
        ClaseMensajes ch = new ClaseMensajes("./" + archi + ".txt");
        docs = "Usuario: " + neww + "Maquina: " + nueva2;
    }//GEN-LAST:event_bt_guardarConversacionMouseClicked

    private void bt_Salir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_Salir2MouseClicked
        chat.setVisible(false);
    }//GEN-LAST:event_bt_Salir2MouseClicked

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
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JButton bt_Ingresar;
    private javax.swing.JButton bt_Registrar;
    private javax.swing.JButton bt_Salir2;
    private javax.swing.JButton bt_atras;
    private javax.swing.JButton bt_enviarMensaje;
    private javax.swing.JButton bt_guardarConversacion;
    private javax.swing.JButton bt_salir;
    private javax.swing.JDialog chat;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser j_calendario;
    private javax.swing.JDialog jd_registrarse;
    private javax.swing.JLabel jl_fondo;
    private javax.swing.JLabel lb_fondo2;
    private javax.swing.JPasswordField tf_contra;
    private javax.swing.JTextField tf_metodos;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuario> personas = new ArrayList();
    String docs, neww, nueva2;

}
