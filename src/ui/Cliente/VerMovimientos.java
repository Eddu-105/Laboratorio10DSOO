package ui.Cliente;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.services.Banco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VerMovimientos extends javax.swing.JPanel {
    
    private Banco banco;
    
    public VerMovimientos(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIDDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        labelIDDNI.addActionListener(this::labelIDDNIActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Consultar movimientos de un cliente");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        jLabel2.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(203, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(btnEnviar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelIDDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelIDDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelIDDNIActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String idODni = labelIDDNI.getText().trim();

        if (idODni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID o DNI del cliente.");
            return;
        }

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
                    " no tiene cuentas registradas, por lo tanto no hay movimientos.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Movimientos del cliente ").append(clienteEncontrado.getNombre()).append(":\n\n");

        boolean hayMovimientos = false;

        for (Cuenta cuenta : cuentas) {
            List<Transaccion> movs = cuenta.getMovimientos();

            sb.append("=== Cuenta ").append(cuenta.getNumero())
              .append(" (").append(cuenta.getTipo()).append(") ===\n");

            if (movs == null || movs.isEmpty()) {
                sb.append("Sin movimientos.\n\n");
            } else {
                hayMovimientos = true;
                for (Transaccion t : movs) {
                    sb.append(t.toString())
                      .append("\n--------------------------\n");
                }
                sb.append("\n");
            }
        }

        if (!hayMovimientos) {
            JOptionPane.showMessageDialog(this,
                    "El cliente no tiene movimientos registrados en ninguna de sus cuentas.");
        } else {
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelIDDNI;
    // End of variables declaration//GEN-END:variables
}
