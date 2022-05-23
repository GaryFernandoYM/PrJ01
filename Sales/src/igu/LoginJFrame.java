
package igu;

import entidades.Persona;
import implementacion.ImplPersona;


public class LoginJFrame extends javax.swing.JFrame {


    public LoginJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxf_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpsf_password = new javax.swing.JPasswordField();
        Jbt_Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 299, 41));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 121, -1, -1));

        jtxf_usuario.setBackground(new java.awt.Color(255, 102, 102));
        jtxf_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxf_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jtxf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 118, 170, 35));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 176, -1, -1));

        jpsf_password.setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().add(jpsf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 173, 170, 34));

        Jbt_Login.setBackground(new java.awt.Color(255, 51, 51));
        Jbt_Login.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Jbt_Login.setText("Login");
        Jbt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validacionLogueo(evt);
            }
        });
        getContentPane().add(Jbt_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 104, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\ggg.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validacionLogueo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validacionLogueo
        
        ImplPersona ip= new ImplPersona();
        Persona p= new Persona();
        
        p=ip.LoginReportePersonaUnico(jtxf_usuario.getText(), jpsf_password.getText());
        
        System.out.println("estoy ´probandoooo: "+p.getUsuario()+"-"+p.getPassword());
 
        if(p.isAcceso()){
            
            System.out.println("ingreso al sistema");            
            
            MenuFrame cmf = new MenuFrame();
            cmf.show();
            
            LoginJFrame lf= new LoginJFrame();
            lf.show(false);
            dispose();
        }
        else{        
          System.out.println("no ingreso al sistema");
        }
    }//GEN-LAST:event_validacionLogueo

    private void jtxf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxf_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbt_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpsf_password;
    private javax.swing.JTextField jtxf_usuario;
    // End of variables declaration//GEN-END:variables
}
