
package ui.Empleado;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.services.Banco;
import javax.swing.JOptionPane;

public class ConsultarCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public ConsultarCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviar = new javax.swing.JButton();
        txtEliminar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNI = new javax.swing.JTextField();

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEliminar.setText("Consultar clientes");

        jLabel2.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelIDDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtEliminar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(btnEnviar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

        StringBuilder sb = new StringBuilder();
        sb.append("Datos del cliente:\n\n")
          .append("Nombre: ").append(clienteEncontrado.getNombre()).append("\n")
          .append("DNI: ").append(clienteEncontrado.getDni()).append("\n")
          .append("Teléfono: ").append(clienteEncontrado.getTelefono()).append("\n")
          .append("Correo: ").append(clienteEncontrado.getEmail()).append("\n")
          .append("ID cliente: ").append(clienteEncontrado.getIdCliente()).append("\n");

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelIDDNI;
    private javax.swing.JLabel txtEliminar;
    // End of variables declaration//GEN-END:variables
}
