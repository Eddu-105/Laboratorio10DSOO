package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Retirar extends javax.swing.JPanel {

    private Banco banco;
    
    public Retirar(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRegistrarE = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelMonto = new javax.swing.JTextField();
        labelNCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelIDDNICli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNIEm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtRegistrarE.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRegistrarE.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistrarE.setText("Retirar");

        btnRetirar.setBackground(new java.awt.Color(0, 134, 190));
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.setBorder(null);
        btnRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetirarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetirarMouseExited(evt);
            }
        });
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Monto a retirar:");

        labelMonto.setBackground(new java.awt.Color(255, 255, 255));
        labelMonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelMonto.setForeground(new java.awt.Color(0, 0, 0));
        labelMonto.setBorder(null);
        labelMonto.addActionListener(this::labelMontoActionPerformed);

        labelNCuenta.setBackground(new java.awt.Color(255, 255, 255));
        labelNCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNCuenta.setForeground(new java.awt.Color(0, 0, 0));
        labelNCuenta.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID/DNI del cliente:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID/DNI del empleado:");

        labelIDDNICli.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNICli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNICli.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNICli.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nº de Cuenta (10-20 dígitos):");

        labelIDDNIEm.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNIEm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNIEm.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNIEm.setBorder(null);

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
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(txtRegistrarE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel3)
                            .addComponent(labelIDDNIEm)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel4)
                            .addComponent(labelIDDNICli)
                            .addComponent(jSeparator3)
                            .addComponent(jLabel1)
                            .addComponent(labelMonto)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistrarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIDDNIEm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelMontoActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        if (banco == null) {
        JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
        return;
    }

    String numCuenta  = labelNCuenta.getText().trim();
    String montoStr   = labelMonto.getText().trim();
    String idEmpleado = labelIDDNIEm.getText().trim();
    String idCliente  = labelIDDNICli.getText().trim();

    if (numCuenta.isEmpty() || montoStr.isEmpty() ||
        idEmpleado.isEmpty() || idCliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        return;
    }

    if (!numCuenta.matches("\\d{10,20}")) {
        JOptionPane.showMessageDialog(this, "El número de cuenta debe tener entre 10 y 20 dígitos.");
        return;
    }

    double monto;
    try {
        monto = Double.parseDouble(montoStr);
        if (monto <= 0) {
            JOptionPane.showMessageDialog(this, "El monto debe ser mayor que cero.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Monto inválido.");
        return;
    }

    Cuenta cuentaOrigen = null;
    for (Cuenta c : banco.getCuentas()) {
        if (numCuenta.equalsIgnoreCase(c.getNumero())) {
            cuentaOrigen = c;
            break;
        }
    }

    if (cuentaOrigen == null) {
        JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
        return;
    }

    if (cuentaOrigen.getSaldo() < monto) {
        JOptionPane.showMessageDialog(this, "Saldo insuficiente para realizar el retiro.");
        return;
    }

    Empleado empleadoAtendedor = null;
    for (Empleado e : banco.getEmpleados()) {
        if (idEmpleado.equalsIgnoreCase(e.getIdEmpleado()) ||
            idEmpleado.equalsIgnoreCase(e.getDni())) {
            empleadoAtendedor = e;
            break;
        }
    }

    if (empleadoAtendedor == null) {
        JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        return;
    }

    Cliente clienteTitular = null;
    for (Cliente cli : banco.getClientes()) {
        if (idCliente.equalsIgnoreCase(cli.getIdCliente()) ||
            idCliente.equalsIgnoreCase(cli.getDni())) {
            clienteTitular = cli;
            break;
        }
    }

    if (clienteTitular == null) {
        JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        return;
    }

    if (!cuentaOrigen.getTitulares().contains(clienteTitular)) {
        JOptionPane.showMessageDialog(this, "El cliente no es titular de esta cuenta.");
        return;
    }

    Retiro retiro = empleadoAtendedor.registrarRetiro(
            cuentaOrigen,
            (float) monto,
            clienteTitular
    );
    retiro.procesar();
    
    System.out.println("→ LLEGÓ A LA CONFIRMACIÓN");
    JOptionPane.showMessageDialog(this,
            String.format("Retiro realizado.\nSaldo actual: S/ %.2f",
                    cuentaOrigen.getSaldo()));

    labelNCuenta.setText("");
    labelMonto.setText("");
    labelIDDNIEm.setText("");
    labelIDDNICli.setText("");
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnRetirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseEntered
        btnRetirar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRetirarMouseEntered

    private void btnRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarMouseExited
        btnRetirar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRetirarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField labelIDDNICli;
    private javax.swing.JTextField labelIDDNIEm;
    private javax.swing.JTextField labelMonto;
    private javax.swing.JTextField labelNCuenta;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
