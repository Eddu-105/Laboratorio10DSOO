package com.mycompany.laboratorio9.ui;

import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import javax.swing.JFrame;
import ui.Administrador.Depositar;
import ui.Administrador.Retirar;
import ui.Cliente.VerCuenta;
import ui.Cliente.VerMovimientos;

public class InterfazClientex extends javax.swing.JPanel {
    
    private Banco banco;
    
    public InterfazClientex(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOpcion = new javax.swing.JLabel();
        btnVerC = new javax.swing.JButton();
        btnVerM = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtBienvenidoC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtOpcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtOpcion.setForeground(new java.awt.Color(0, 0, 0));
        txtOpcion.setText("Seleccione una opción");

        btnVerC.setBackground(new java.awt.Color(0, 134, 190));
        btnVerC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVerC.setForeground(new java.awt.Color(255, 255, 255));
        btnVerC.setText("Ver cuenta");
        btnVerC.setBorder(null);
        btnVerC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerCMouseExited(evt);
            }
        });
        btnVerC.addActionListener(this::btnVerCActionPerformed);

        btnVerM.setBackground(new java.awt.Color(0, 134, 190));
        btnVerM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVerM.setForeground(new java.awt.Color(255, 255, 255));
        btnVerM.setText("Ver Movimientos");
        btnVerM.setBorder(null);
        btnVerM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerMMouseExited(evt);
            }
        });
        btnVerM.addActionListener(this::btnVerMActionPerformed);

        btnDepositar.setBackground(new java.awt.Color(0, 134, 190));
        btnDepositar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositar.setText("Depositar");
        btnDepositar.setBorder(null);
        btnDepositar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositarMouseExited(evt);
            }
        });
        btnDepositar.addActionListener(this::btnDepositarActionPerformed);

        btnRetirar.setBackground(new java.awt.Color(0, 134, 190));
        btnRetirar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(null);
        btnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetirarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetirarMouseExited(evt);
            }
        });
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        btnSalir.setBackground(new java.awt.Color(0, 134, 190));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        txtBienvenidoC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtBienvenidoC.setForeground(new java.awt.Color(0, 0, 0));
        txtBienvenidoC.setText("Bienvenido estimado cliente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBienvenidoC)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBienvenidoC)
                        .addGap(18, 18, 18)
                        .addComponent(txtOpcion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(38, 38, 38)
                .addComponent(btnVerC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        Depositar depositoc = new Depositar(banco);
        JFrame s = new JFrame();
        s.add(depositoc);
        s.pack();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCActionPerformed
        VerCuenta vcuenta = new VerCuenta(banco);
        JFrame w = new JFrame();
        w.add(vcuenta);
        w.pack();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
    }//GEN-LAST:event_btnVerCActionPerformed

    private void btnVerMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMActionPerformed
        VerMovimientos vmovimiento = new VerMovimientos(banco);
        JFrame a = new JFrame();
        a.add(vmovimiento);
        a.pack();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_btnVerMActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        Retirar retiroc = new Retirar(banco);
        JFrame z = new JFrame();
        z.add(retiroc);
        z.pack();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnVerCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerCMouseEntered
        btnVerC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVerCMouseEntered

    private void btnVerCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerCMouseExited
        btnVerC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVerCMouseExited

    private void btnVerMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMMouseEntered
        btnVerM.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVerMMouseEntered

    private void btnVerMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMMouseExited
        btnVerM.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVerMMouseExited

    private void btnDepositarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarMouseEntered
        btnDepositar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnDepositarMouseEntered

    private void btnDepositarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarMouseExited
        btnDepositar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnDepositarMouseExited

    private void btnRetirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseEntered
        btnRetirar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRetirarMouseEntered

    private void btnRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseExited
        btnRetirar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRetirarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerC;
    private javax.swing.JButton btnVerM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBienvenidoC;
    private javax.swing.JLabel txtOpcion;
    // End of variables declaration//GEN-END:variables
}
