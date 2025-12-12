package com.mycompany.laboratorio9.ui;

import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import ui.Administrador.RegistrarEmpleado;
import javax.swing.JFrame;
import ui.Administrador.ConsultarMovimientos;
import ui.Administrador.CrearCuenta;
import ui.Administrador.Depositar;
import ui.Administrador.EliminarCliente;
import ui.Administrador.EliminarCuenta;
import ui.Administrador.EliminarEmpleado;
import ui.Administrador.RegistrarCliente;
import ui.Administrador.Retirar;
import ui.Administrador.Transferir;

public class InterfazAdminx extends javax.swing.JPanel {
    
    private Banco banco;
    
    public InterfazAdminx(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarCu = new javax.swing.JButton();
        btnVerU = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        txtBienvenido = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        btnRegistrarE = new javax.swing.JButton();
        btnConsultarC = new javax.swing.JButton();
        txtOpcion = new javax.swing.JLabel();
        btnConsultarM = new javax.swing.JButton();
        btnRegistrarC = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCrearC = new javax.swing.JButton();
        btnEliminarE = new javax.swing.JButton();
        btnEliminarCl = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnEliminarCu.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarCu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarCu.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCu.setText("Eliminar Cuenta");
        btnEliminarCu.setBorder(null);
        btnEliminarCu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarCuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarCuMouseExited(evt);
            }
        });
        btnEliminarCu.addActionListener(this::btnEliminarCuActionPerformed);

        btnVerU.setBackground(new java.awt.Color(0, 134, 190));
        btnVerU.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVerU.setForeground(new java.awt.Color(255, 255, 255));
        btnVerU.setText("Ver usuario");
        btnVerU.setBorder(null);
        btnVerU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerUMouseExited(evt);
            }
        });

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

        txtBienvenido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        txtBienvenido.setText("Bienvenido Administrador");

        btnTransferir.setBackground(new java.awt.Color(0, 134, 190));
        btnTransferir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferir.setText("Transferir");
        btnTransferir.setBorder(null);
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferirMouseExited(evt);
            }
        });
        btnTransferir.addActionListener(this::btnTransferirActionPerformed);

        btnRegistrarE.setBackground(new java.awt.Color(0, 134, 190));
        btnRegistrarE.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegistrarE.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarE.setText("Registrar empleado");
        btnRegistrarE.setBorder(null);
        btnRegistrarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarEMouseExited(evt);
            }
        });
        btnRegistrarE.addActionListener(this::btnRegistrarEActionPerformed);

        btnConsultarC.setBackground(new java.awt.Color(0, 134, 190));
        btnConsultarC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnConsultarC.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarC.setText("Consultar cuentas");
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

        txtOpcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtOpcion.setForeground(new java.awt.Color(0, 0, 0));
        txtOpcion.setText("Seleccione una opción");

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

        btnRegistrarC.setBackground(new java.awt.Color(0, 134, 190));
        btnRegistrarC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegistrarC.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarC.setText("Registrar Cliente");
        btnRegistrarC.setBorder(null);
        btnRegistrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarCMouseExited(evt);
            }
        });
        btnRegistrarC.addActionListener(this::btnRegistrarCActionPerformed);

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

        btnCrearC.setBackground(new java.awt.Color(0, 134, 190));
        btnCrearC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCrearC.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearC.setText("Crear cuenta");
        btnCrearC.setBorder(null);
        btnCrearC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCMouseExited(evt);
            }
        });
        btnCrearC.addActionListener(this::btnCrearCActionPerformed);

        btnEliminarE.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarE.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarE.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarE.setText("Eliminar empleado");
        btnEliminarE.setBorder(null);
        btnEliminarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarEMouseExited(evt);
            }
        });
        btnEliminarE.addActionListener(this::btnEliminarEActionPerformed);

        btnEliminarCl.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarCl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminarCl.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCl.setText("Eliminar Cliente");
        btnEliminarCl.setBorder(null);
        btnEliminarCl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarClMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarClMouseExited(evt);
            }
        });
        btnEliminarCl.addActionListener(this::btnEliminarClActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBienvenido)
                                    .addComponent(jLabel1)
                                    .addComponent(txtOpcion))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnRegistrarC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnRegistrarE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnCrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarCl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarCu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVerU, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtOpcion))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCActionPerformed
        RegistrarCliente registroc = new RegistrarCliente(banco);
        JFrame r = new JFrame();
        r.add(registroc);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }//GEN-LAST:event_btnRegistrarCActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        RegistrarEmpleado registro = new RegistrarEmpleado(this.banco);
        JFrame j = new JFrame();
        j.add(registro);
        j.pack();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEActionPerformed

    private void btnCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCActionPerformed
        CrearCuenta cuenta = new CrearCuenta(banco);
        JFrame i = new JFrame();
        i.add(cuenta);
        i.pack();
        i.setLocationRelativeTo(null);
        i.setVisible(true);
    }//GEN-LAST:event_btnCrearCActionPerformed

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed
        EliminarEmpleado eliminare = new EliminarEmpleado(banco);
        JFrame o = new JFrame();
        o.add(eliminare);
        o.pack();
        o.setLocationRelativeTo(null);
        o.setVisible(true);
    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void btnEliminarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClActionPerformed
        EliminarCliente eliminarc = new EliminarCliente(banco);
        JFrame p = new JFrame();
        p.add(eliminarc);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnEliminarClActionPerformed

    private void btnEliminarCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuActionPerformed
        EliminarCuenta eliminarcu = new EliminarCuenta(banco);
        JFrame u = new JFrame();
        u.add(eliminarcu);
        u.pack();
        u.setLocationRelativeTo(null);
        u.setVisible(true);
    }//GEN-LAST:event_btnEliminarCuActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        Depositar deposito = new Depositar(banco);
        JFrame e = new JFrame();
        e.add(deposito);
        e.pack();
        e.setLocationRelativeTo(null);
        e.setVisible(true);
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        Retirar retiro = new Retirar(banco);
        JFrame q = new JFrame();
        q.add(retiro);
        q.pack();
        q.setLocationRelativeTo(null);
        q.setVisible(true);
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        Transferir transferencia = new Transferir(banco);
        JFrame y = new JFrame();
        y.add(transferencia);
        y.pack();
        y.setLocationRelativeTo(null);
        y.setVisible(true);
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void btnConsultarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCActionPerformed
        
    }//GEN-LAST:event_btnConsultarCActionPerformed

    private void btnConsultarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMActionPerformed
        ConsultarMovimientos movimiento = new ConsultarMovimientos(banco);
        JFrame t = new JFrame();
        t.add(movimiento);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }//GEN-LAST:event_btnConsultarMActionPerformed

    private void btnRegistrarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEMouseEntered
        btnRegistrarE.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRegistrarEMouseEntered

    private void btnRegistrarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEMouseExited
        btnRegistrarE.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRegistrarEMouseExited

    private void btnRegistrarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCMouseEntered
        btnRegistrarC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRegistrarCMouseEntered

    private void btnRegistrarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCMouseExited
        btnRegistrarC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRegistrarCMouseExited

    private void btnCrearCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCMouseEntered
        btnCrearC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnCrearCMouseEntered

    private void btnCrearCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCMouseExited
        btnCrearC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnCrearCMouseExited

    private void btnEliminarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEMouseEntered
        btnEliminarE.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEliminarEMouseEntered

    private void btnEliminarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEMouseExited
        btnEliminarE.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEliminarEMouseExited

    private void btnEliminarClMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClMouseEntered
        btnEliminarCl.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEliminarClMouseEntered

    private void btnEliminarClMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClMouseExited
        btnEliminarCl.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEliminarClMouseExited

    private void btnEliminarCuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuMouseEntered
        btnEliminarCu.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEliminarCuMouseEntered

    private void btnEliminarCuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCuMouseExited
        btnEliminarCu.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEliminarCuMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnSalirMouseExited

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

    private void btnTransferirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseEntered
        btnTransferir.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnTransferirMouseEntered

    private void btnTransferirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseExited
        btnTransferir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnTransferirMouseExited

    private void btnConsultarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseEntered
        btnConsultarC.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarCMouseEntered

    private void btnConsultarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarCMouseExited
        btnConsultarC.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarCMouseExited

    private void btnConsultarMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMMouseEntered
        btnConsultarM.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnConsultarMMouseEntered

    private void btnConsultarMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMMouseExited
        btnConsultarM.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnConsultarMMouseExited

    private void btnVerUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerUMouseEntered
        btnVerU.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVerUMouseEntered

    private void btnVerUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerUMouseExited
        btnVerU.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVerUMouseExited
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarC;
    private javax.swing.JButton btnConsultarM;
    private javax.swing.JButton btnCrearC;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnEliminarCl;
    private javax.swing.JButton btnEliminarCu;
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JButton btnRegistrarC;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVerU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBienvenido;
    private javax.swing.JLabel txtOpcion;
    // End of variables declaration//GEN-END:variables

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
