
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CHay
 */
public class bootLogo extends javax.swing.JFrame {

    /**
     * Creates new form bootLogo
     */
    public bootLogo() {
        initComponents();
        setLocationRelativeTo(null);
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
        boton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        celular = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        boton.setText("Login");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celular:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        celular.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                celularKeyPressed(evt);
            }
        });
        jPanel1.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 160, -1));

        nombre.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boot.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 636));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
        try {
            if (nombre.getText().length() != 0 && nombre.getText().length() < 31 && celular.getText().length() == 10 || nombre.getText().length() != 0 && nombre.getText().length() < 31 && celular.getText().length() == 8) {
                try {
                    variables.nombre = nombre.getText();
                    variables.contacto = celular.getText();
                    JOptionPane.showMessageDialog(null, "Bienvenido: " + variables.nombre);
                    PantallaCelular fm = new PantallaCelular();
                    fm.show();
                    this.hide();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error de Usuario o Numero Incorrecto\nRecuerde que debe colocar un nombre valido y numero de 10 u 8 caracteres");
                    celular.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de Usuario o Numero Incorrecto\nRecuerde que debe colocar un nombre valido y numero de 10 u 8 caracteres");
                nombre.setText("");
                celular.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                celular.requestFocus();
            } catch (HeadlessException e) {
            }
        }
    }//GEN-LAST:event_nombreKeyPressed

    private void celularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                boton.requestFocus();
            } catch (HeadlessException e) {
            }
        }
    }//GEN-LAST:event_celularKeyPressed

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
            java.util.logging.Logger.getLogger(bootLogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bootLogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bootLogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bootLogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bootLogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField celular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
