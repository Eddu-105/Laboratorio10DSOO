package ui.Empleado;

import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.services.Banco;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultarMovimientos extends javax.swing.JPanel {

    private Banco banco;
    
    public ConsultarMovimientos(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviar = new javax.swing.JButton();
        txtEliminar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNCuenta = new javax.swing.JTextField();

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEliminar.setText("Consultar Movimientos de clientes");

        jLabel2.setText("Nº de cuenta:");

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
                        .addComponent(labelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtEliminar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        String numeroCuenta = labelNCuenta.getText().trim();

        if (numeroCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de cuenta.");
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

        List<Transaccion> movs = cuenta.getMovimientos();

        if (movs == null || movs.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cuenta no tiene movimientos.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Movimientos de la cuenta ")
          .append(cuenta.getNumero())
          .append(":\n\n");

        for (Transaccion t : movs) {
            sb.append(t.toString())
              .append("\n--------------------------\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField labelNCuenta;
    private javax.swing.JLabel txtEliminar;
    // End of variables declaration//GEN-END:variables
}
