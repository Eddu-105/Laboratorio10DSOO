package ui.Cliente;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VerCuenta extends javax.swing.JPanel {
    
    private Banco banco;
    
    public VerCuenta(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelIDDNI = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Consultar cuentas de un cliente");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        jLabel2.setText("ID/DNI del cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(btnEnviar)
                .addContainerGap(27, Short.MAX_VALUE))
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
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelIDDNI;
    // End of variables declaration//GEN-END:variables
}
