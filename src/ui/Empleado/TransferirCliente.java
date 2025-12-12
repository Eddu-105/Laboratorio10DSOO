package ui.Empleado;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Transferencia;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class TransferirCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public TransferirCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNIEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNCuenta1 = new javax.swing.JTextField();
        labelNCuenta2 = new javax.swing.JTextField();
        labelIDDNICli = new javax.swing.JTextField();
        txtRegistrarE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Nº de Cuenta que Transfiere (10-20 dígitos):");

        jLabel3.setText("Monto a transferir:");

        jLabel4.setText("ID/DNI del empleado:");

        labelNCuenta2.addActionListener(this::labelNCuenta2ActionPerformed);

        txtRegistrarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistrarE.setText("Transferencia");

        jLabel5.setText("ID/DNI del cliente:");

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(this::btnTransferirActionPerformed);

        jLabel1.setText("Nª de Cuenta que Recibe (10-20 dígitos):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNCuenta1)
                            .addComponent(labelNCuenta2)
                            .addComponent(labelMonto)
                            .addComponent(labelIDDNIEmp)
                            .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRegistrarE)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtRegistrarE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnTransferir)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelNCuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNCuenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNCuenta2ActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numCuentaOrigen  = labelNCuenta1.getText().trim();
        String numCuentaDestino = labelNCuenta2.getText().trim();
        String montoStr         = labelMonto.getText().trim();
        String idEmpleado       = labelIDDNIEmp.getText().trim();
        String idCliente        = labelIDDNICli.getText().trim();

        if (numCuentaOrigen.isEmpty() || numCuentaDestino.isEmpty() ||
            montoStr.isEmpty() || idEmpleado.isEmpty() || idCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        if (!numCuentaOrigen.matches("\\d{10,20}") ||
            !numCuentaDestino.matches("\\d{10,20}")) {
            JOptionPane.showMessageDialog(this,
                    "Las cuentas deben tener entre 10 y 20 dígitos.");
            return;
        }

        if (numCuentaOrigen.equals(numCuentaDestino)) {
            JOptionPane.showMessageDialog(this,
                    "La cuenta origen y destino deben ser diferentes.");
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
            if (numCuentaOrigen.equalsIgnoreCase(c.getNumero())) {
                cuentaOrigen = c;
                break;
            }
        }
        if (cuentaOrigen == null) {
            JOptionPane.showMessageDialog(this, "Cuenta origen no encontrada.");
            return;
        }

        Cuenta cuentaDestino = null;
        for (Cuenta c : banco.getCuentas()) {
            if (numCuentaDestino.equalsIgnoreCase(c.getNumero())) {
                cuentaDestino = c;
                break;
            }
        }
        if (cuentaDestino == null) {
            JOptionPane.showMessageDialog(this, "Cuenta destino no encontrada.");
            return;
        }

        if (cuentaOrigen.getSaldo() < monto) {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente en la cuenta origen.");
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

        // Verificar que sea titular de la cuenta origen
        if (!cuentaOrigen.getTitulares().contains(clienteTitular)) {
            JOptionPane.showMessageDialog(this,
                    "El cliente no es titular de la cuenta origen.");
            return;
        }

        Transferencia transferencia = new Transferencia(
                cuentaOrigen,
                cuentaDestino,
                (float) monto,
                clienteTitular,
                empleadoAtendedor
        );
        transferencia.procesar();

        JOptionPane.showMessageDialog(this,
                String.format("Transferencia realizada.\nSaldo origen: S/ %.2f\nSaldo destino: S/ %.2f",
                        cuentaOrigen.getSaldo(), cuentaDestino.getSaldo()));

        labelNCuenta1.setText("");
        labelNCuenta2.setText("");
        labelMonto.setText("");
        labelIDDNIEmp.setText("");
        labelIDDNICli.setText("");
    }//GEN-LAST:event_btnTransferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField labelIDDNICli;
    private javax.swing.JTextField labelIDDNIEmp;
    private javax.swing.JTextField labelMonto;
    private javax.swing.JTextField labelNCuenta1;
    private javax.swing.JTextField labelNCuenta2;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
