package ui.Administrador;

import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Transaccion;
import javax.swing.*;
import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import java.util.List;



public class ConsultarMovimientos extends javax.swing.JPanel {
    
    private Banco banco;
    
    public ConsultarMovimientos(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtConsultarM = new javax.swing.JLabel();
        txtNCuenta = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtNumeroCuenta.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNumeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCuenta.setBorder(null);
        txtNumeroCuenta.setName(""); // NOI18N
        txtNumeroCuenta.addActionListener(this::txtNumeroCuentaActionPerformed);

        txtConsultarM.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtConsultarM.setForeground(new java.awt.Color(0, 0, 0));
        txtConsultarM.setText("Consultar Movimientos");

        txtNCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNCuenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNCuenta.setText("Nº de cuenta:");

        btnEnviar.setBackground(new java.awt.Color(0, 134, 190));
        btnEnviar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bienvenido Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsultarM)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtNCuenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(txtConsultarM)
                        .addGap(31, 31, 31)
                        .addComponent(txtNCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
    String numeroCuenta = txtNumeroCuenta.getText().trim();

        if (numeroCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de cuenta.");
            return;
        }

        Cuenta cuenta = banco.buscarCuenta(numeroCuenta);

        if (cuenta == null) {
            JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
            return;
        }

        List<Transaccion> movs = banco.obtenerMovimientosDeCuenta(numeroCuenta);

        if (movs == null || movs.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cuenta no tiene movimientos.");
            return;
        }

        StringBuilder sb = new StringBuilder("Movimientos de la cuenta " 
                                             + cuenta.getNumero() + ":\n\n");

        for (Transaccion t : movs) {
            sb.append(t.toString())
              .append("\n--------------------------\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtNumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaActionPerformed

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEnviarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtConsultarM;
    private javax.swing.JLabel txtNCuenta;
    private javax.swing.JTextField txtNumeroCuenta;
    // End of variables declaration//GEN-END:variables
}
