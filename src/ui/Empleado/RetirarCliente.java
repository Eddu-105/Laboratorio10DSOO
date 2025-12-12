package ui.Empleado;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class RetirarCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public RetirarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        labelNCuenta = new javax.swing.JTextField();
        labelMonto = new javax.swing.JTextField();
        txtRegistrarE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelIDDNIEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNICli = new javax.swing.JTextField();

        jLabel3.setText("ID/DNI del empleado:");

        jLabel4.setText("ID/DNI del titular:");

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        txtRegistrarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistrarE.setText("Retiro para Cliente");

        jLabel1.setText("Monto a retirar:");

        jLabel2.setText("Nº de Cuenta (10-20 dígitos):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(labelMonto)
                    .addComponent(labelIDDNIEmp)
                    .addComponent(labelIDDNICli))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRegistrarE)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtRegistrarE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnRetirar)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numCuenta  = labelNCuenta.getText().trim();
        String montoStr   = labelMonto.getText().trim();
        String idEmpleado = labelIDDNIEmp.getText().trim();
        String idTitular  = labelIDDNICli.getText().trim();

        if (numCuenta.isEmpty() || montoStr.isEmpty() ||
            idEmpleado.isEmpty() || idTitular.isEmpty()) {
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
            JOptionPane.showMessageDialog(this, "Saldo insuficiente en la cuenta.");
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
            if (idTitular.equalsIgnoreCase(cli.getIdCliente()) ||
                idTitular.equalsIgnoreCase(cli.getDni())) {
                clienteTitular = cli;
                break;
            }
        }

        if (clienteTitular == null) {
            JOptionPane.showMessageDialog(this, "Titular no encontrado.");
            return;
        }

        if (!cuentaOrigen.getTitulares().contains(clienteTitular)) {
            JOptionPane.showMessageDialog(this, "El cliente indicado no es titular de esta cuenta.");
            return;
        }

        Retiro retiro = empleadoAtendedor.registrarRetiro(
                cuentaOrigen,
                (float) monto,
                clienteTitular
        );
        retiro.procesar();

        JOptionPane.showMessageDialog(this,
                String.format("Retiro realizado.\nSaldo actual: S/ %.2f",
                        cuentaOrigen.getSaldo()));

        labelNCuenta.setText("");
        labelMonto.setText("");
        labelIDDNIEmp.setText("");
        labelIDDNICli.setText("");
    }//GEN-LAST:event_btnRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField labelIDDNICli;
    private javax.swing.JTextField labelIDDNIEmp;
    private javax.swing.JTextField labelMonto;
    private javax.swing.JTextField labelNCuenta;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
