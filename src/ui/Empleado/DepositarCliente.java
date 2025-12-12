package ui.Empleado;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DepositarCliente extends javax.swing.JPanel {

    private Banco banco;
    
    public DepositarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNCuenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnDepositar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Depositar para un cliente");

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(this::btnDepositarActionPerformed);

        jLabel2.setText("Nº de cuenta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnDepositar)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numeroCuenta = labelNCuenta.getText().trim();

        if (numeroCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de cuenta.");
            return;
        }

        if (!numeroCuenta.matches("\\d{10,20}")) {
            JOptionPane.showMessageDialog(this, "El número de cuenta debe tener entre 10 y 20 dígitos.");
            return;
        }

        Cuenta cuenta = null;
        for (Cuenta c : banco.getCuentas()) {
            if (numeroCuenta.equalsIgnoreCase(c.getNumero())) {
                cuenta = c;
                break;
            }
        }

        if (cuenta == null) {
            JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Datos de la cuenta:\n\n")
          .append("Nº de cuenta: ").append(cuenta.getNumero()).append("\n")
          .append("Tipo: ").append(cuenta.getTipo()).append("\n")
          .append("Saldo actual: S/ ").append(cuenta.getSaldo()).append("\n\n")
          .append("Titulares:\n");

        ArrayList<Cliente> titulares = cuenta.getTitulares();
        if (titulares == null || titulares.isEmpty()) {
            sb.append("Sin titulares registrados.\n");
        } else {
            for (Cliente cli : titulares) {
                sb.append("- ").append(cli.getNombre())
                  .append(" (DNI: ").append(cli.getDni()).append(")\n");
            }
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_btnDepositarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelNCuenta;
    // End of variables declaration//GEN-END:variables
}
