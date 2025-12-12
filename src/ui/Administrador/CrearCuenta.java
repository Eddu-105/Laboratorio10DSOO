package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;

public class CrearCuenta extends javax.swing.JPanel {

    private Banco banco;
    
    public CrearCuenta(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        labelNCuenta = new javax.swing.JTextField();
        labelIDDNI = new javax.swing.JTextField();
        txtRegistrarE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID/DNI del titular:");

        labelTipo.setBackground(new java.awt.Color(255, 255, 255));
        labelTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(0, 0, 0));
        labelTipo.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nº de Cuente (10-20 dígitos):");

        labelSaldo.setBackground(new java.awt.Color(255, 255, 255));
        labelSaldo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 0, 0));
        labelSaldo.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo (AHORRO / CTE):");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Saldo inicial:");

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

        labelNCuenta.setBackground(new java.awt.Color(255, 255, 255));
        labelNCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNCuenta.setForeground(new java.awt.Color(0, 0, 0));
        labelNCuenta.setBorder(null);
        labelNCuenta.addActionListener(this::labelNCuentaActionPerformed);

        labelIDDNI.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNI.setBorder(null);

        txtRegistrarE.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRegistrarE.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistrarE.setText("Crear Cuenta");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Bienvenido Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(labelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                .addComponent(labelIDDNI)
                                .addComponent(jLabel3)
                                .addComponent(labelSaldo)
                                .addComponent(jLabel4)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(txtRegistrarE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtRegistrarE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numeroCuenta = labelNCuenta.getText().trim();
        String idTitular = labelIDDNI.getText().trim();
        String tipo = labelTipo.getText().trim().toUpperCase();
        String saldoStr = labelSaldo.getText().trim();

        if (numeroCuenta.isEmpty() || idTitular.isEmpty() ||
            tipo.isEmpty() || saldoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        if (!numeroCuenta.matches("\\d{10,20}")) {
            JOptionPane.showMessageDialog(this, "El número de cuenta debe tener entre 10 y 20 dígitos.");
            return;
        }

        if (!tipo.equals("AHORRO") && !tipo.equals("CTE")) {
            JOptionPane.showMessageDialog(this, "El tipo de cuenta debe ser AHORRO o CTE.");
            return;
        }

        double saldoInicial;
        try {
            saldoInicial = Double.parseDouble(saldoStr);
            if (saldoInicial < 0) {
                JOptionPane.showMessageDialog(this, "El saldo inicial no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Saldo inicial inválido.");
            return;
        }

        for (Cuenta c : banco.getCuentas()) {
            if (numeroCuenta.equalsIgnoreCase(c.getNumero())) {
                JOptionPane.showMessageDialog(this, "Ya existe una cuenta con ese número.");
                return;
            }
        }

        Cliente titularEncontrado = null;
        for (Cliente cli : banco.getClientes()) {
            if (idTitular.equalsIgnoreCase(cli.getIdCliente()) ||
                idTitular.equalsIgnoreCase(cli.getDni())) {
                titularEncontrado = cli;
                break;
            }
        }

        if (titularEncontrado == null) {
            JOptionPane.showMessageDialog(this, "El cliente no existe. Regístrelo primero.");
            return;
        }

        ArrayList<Cliente> titulares = new ArrayList<>();
        titulares.add(titularEncontrado);

        Cuenta nuevaCuenta = new Cuenta(numeroCuenta, tipo, saldoInicial, titulares);
        banco.agregarCuenta(nuevaCuenta);    
        titularEncontrado.agregarCuenta(nuevaCuenta); 

        JOptionPane.showMessageDialog(this, "Cuenta creada correctamente.");

        labelNCuenta.setText("");
        labelIDDNI.setText("");
        labelTipo.setText("");
        labelSaldo.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void labelNCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNCuentaActionPerformed

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEnviarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField labelIDDNI;
    private javax.swing.JTextField labelIDDNI1;
    private javax.swing.JTextField labelNCuenta;
    private javax.swing.JTextField labelNCuenta1;
    private javax.swing.JTextField labelSaldo;
    private javax.swing.JTextField labelSaldo1;
    private javax.swing.JTextField labelTipo;
    private javax.swing.JTextField labelTipo1;
    private javax.swing.JLabel txtRegistrarE;
    private javax.swing.JLabel txtRegistrarE1;
    // End of variables declaration//GEN-END:variables
}