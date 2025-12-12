package com.mycompany.laboratorio9.ui;

import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import javax.swing.JFrame;
import ui.Administrador.ConsultarMovimientos;
import ui.Empleado.ConsultarCliente;
import ui.Empleado.DepositarCliente;
import ui.Empleado.CrearCuentaCliente;
import ui.Empleado.RetirarCliente;
import ui.Empleado.TransferirCliente;

public class InterfazEmpleadox extends javax.swing.JPanel {
    
    private Banco banco;
    
    public InterfazEmpleadox(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnConsultarC = new javax.swing.JButton();
        btnConsultarM = new javax.swing.JButton();
        btnTransferirC = new javax.swing.JButton();
        btnRetirarC = new javax.swing.JButton();
        btnDepositarC = new javax.swing.JButton();
        btnCrearCuC = new javax.swing.JButton();
        txtOpcionE = new javax.swing.JLabel();
        txtBienvenidoE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setBackground(new java.awt.Color(0, 134, 190));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
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

        btnConsultarC.setBackground(new java.awt.Color(0, 134, 190));
        btnConsultarC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnConsultarC.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarC.setText("Consultar Clientes");
        btnConsultarC.setBorder(null);
        btnConsultarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarCMouseExited(evt);
            }
        });
        btnConsultarC.addActionListener(this::btnConsultarCActionPerformed);

        btnConsultarM.setBackground(new java.awt.Color(0, 134, 190));
        btnConsultarM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnConsultarM.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarM.setText("Consultar movimientos");
        btnConsultarM.setBorder(null);
        btnConsultarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMMouseExited(evt);
            }
        });
        btnConsultarM.addActionListener(this::btnConsultarMActionPerformed);

        btnTransferirC.setBackground(new java.awt.Color(0, 134, 190));
        btnTransferirC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTransferirC.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferirC.setText("Transferir para cliente");
        btnTransferirC.setBorder(null);
        btnTransferirC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferirC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferirCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferirCMouseExited(evt);
            }
        });
        btnTransferirC.addActionListener(this::btnTransferirCActionPerformed);

        btnRetirarC.setBackground(new java.awt.Color(0, 134, 190));
        btnRetirarC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRetirarC.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarC.setText("Retirar para cliente");
        btnRetirarC.setBorder(null);
        btnRetirarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetirarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetirarCMouseExited(evt);
            }
        });
        btnRetirarC.addActionListener(this::btnRetirarCActionPerformed);

        btnDepositarC.setBackground(new java.awt.Color(0, 134, 190));
        btnDepositarC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnDepositarC.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositarC.setText("Depositar para cliente");
        btnDepositarC.setBorder(null);
        btnDepositarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepositarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositarCMouseExited(evt);
            }
        });
        btnDepositarC.addActionListener(this::btnDepositarCActionPerformed);

        btnCrearCuC.setBackground(new java.awt.Color(0, 134, 190));
        btnCrearCuC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCrearCuC.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuC.setText("Crear cuenta a cliente");
        btnCrearCuC.setBorder(null);
        btnCrearCuC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuC.addActionListener(this::btnCrearCuCActionPerformed);

        txtOpcionE.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtOpcionE.setForeground(new java.awt.Color(0, 0, 0));
        txtOpcionE.setText("Seleccione una opción");

        txtBienvenidoE.setBackground(new java.awt.Color(0, 0, 0));
        txtBienvenidoE.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtBienvenidoE.setForeground(new java.awt.Color(0, 0, 0));
        txtBienvenidoE.setText("Bienvenido Empleado");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtBienvenidoE)
                                    .addComponent(txtOpcionE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDepositarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTransferirC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRetirarC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearCuC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnConsultarM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultarC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBienvenidoE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOpcionE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepositarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetirarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultarC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTransferirC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearCuC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearCuCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuCActionPerformed
        CrearCuentaCliente crearccli = new CrearCuentaCliente(banco);
        JFrame c = new JFrame();
        c.add(crearccli);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_btnCrearCuCActionPerformed

    private void btnDepositarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarCActionPerformed
        DepositarCliente depositarc = new DepositarCliente(banco);
        JFrame m = new JFrame();
        m.add(depositarc);
        m.pack();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_btnDepositarCActionPerformed

    private void btnRetirarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarCActionPerformed
        RetirarCliente retirarc = new RetirarCliente(banco);
        JFrame x = new JFrame();
        x.add(retirarc);
        x.pack();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_btnRetirarCActionPerformed

    private void btnTransferirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirCActionPerformed
        TransferirCliente transferirc = new TransferirCliente(banco);
        JFrame v = new JFrame();
        v.add(transferirc);
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_btnTransferirCActionPerformed

    private void btnConsultarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMActionPerformed
        ConsultarMovimientos consultarm = new ConsultarMovimientos(banco);
        JFrame f = new JFrame();
        f.add(consultarm);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_btnConsultarMActionPerformed

    private void btnConsultarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCActionPerformed
        ConsultarCliente consultarc = new ConsultarCliente(banco);
        JFrame g = new JFrame();
        g.add(consultarc);
        g.pack();
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }//GEN-LAST:event_btnConsultarCActionPerformed

    private void btnDepositarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarCMouseEntered
        btnDepositarC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnDepositarCMouseEntered

    private void btnDepositarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositarCMouseExited
        btnDepositarC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnDepositarCMouseExited

    private void btnRetirarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarCMouseEntered
        btnRetirarC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRetirarCMouseEntered

    private void btnRetirarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarCMouseExited
        btnRetirarC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRetirarCMouseExited

    private void btnTransferirCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirCMouseEntered
        btnTransferirC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnTransferirCMouseEntered

    private void btnTransferirCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirCMouseExited
        btnTransferirC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnTransferirCMouseExited

    private void btnConsultarMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMMouseEntered
        btnConsultarM.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarMMouseEntered

    private void btnConsultarMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMMouseExited
        btnConsultarM.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarMMouseExited

    private void btnConsultarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseEntered
        btnConsultarC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarCMouseEntered

    private void btnConsultarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseExited
        btnConsultarC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarCMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarC;
    private javax.swing.JButton btnConsultarM;
    private javax.swing.JButton btnCrearCuC;
    private javax.swing.JButton btnDepositarC;
    private javax.swing.JButton btnRetirarC;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransferirC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBienvenidoE;
    private javax.swing.JLabel txtOpcionE;
    // End of variables declaration//GEN-END:variables
}
