package ui.Cliente;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Depositar extends javax.swing.JPanel {
    
    private Banco banco;

    public Depositar(Banco banco) {
        this.banco = banco;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIDDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Depositar");

        jButton1.setText("Enviar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 197, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDDNI)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String idODni = labelIDDNI.getText().trim();

        if (idODni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID o DNI del cliente.");
            return;
        }

        // 1) Buscar cliente
        Cliente clienteEncontrado = null;
        for (Cliente c : banco.getClientes()) {
            if (idODni.equalsIgnoreCase(c.getIdCliente()) ||
                idODni.equalsIgnoreCase(c.getDni())) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        ArrayList<Cuenta> cuentas = clienteEncontrado.getCuentas();

        if (cuentas == null || cuentas.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "El cliente " + clienteEncontrado.getNombre() +
                    " no tiene cuentas registradas.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Cuentas del cliente ").append(clienteEncontrado.getNombre()).append(":\n\n");
        for (Cuenta c : cuentas) {
            sb.append("Nº: ").append(c.getNumero()).append("\n")
              .append("Tipo: ").append(c.getTipo()).append("\n")
              .append("Saldo: S/ ").append(c.getSaldo()).append("\n")
              .append("-----------------------------\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelIDDNI;
    // End of variables declaration//GEN-END:variables
}
