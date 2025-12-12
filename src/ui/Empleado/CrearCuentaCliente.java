package ui.Empleado;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.services.Banco;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CrearCuentaCliente extends javax.swing.JPanel {
    
    private Banco banco;
    
    public CrearCuentaCliente(Banco banco) {
        this.banco = banco;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        labelNCuenta = new javax.swing.JTextField();
        labelIDDNI = new javax.swing.JTextField();
        txtRegistrarE = new javax.swing.JLabel();

        jLabel1.setText("ID/DNI del titular:");

        jLabel2.setText("Nº de Cuenta (10-20 dígitos):");

        jLabel3.setText("Tipo (AHORRO / CTE):");

        jLabel4.setText("Saldo inicial:");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(this::btnCrearActionPerformed);

        txtRegistrarE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegistrarE.setText("Crear Cuenta a cliente");

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
                    .addComponent(labelIDDNI)
                    .addComponent(labelTipo)
                    .addComponent(labelSaldo))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRegistrarE)
                        .addGap(150, 150, 150))))
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
                    .addComponent(labelIDDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (banco == null) {
            JOptionPane.showMessageDialog(this, "Error: Banco no inicializado.");
            return;
        }

        String numeroCuenta = labelNCuenta.getText().trim();
        String idTitular    = labelIDDNI.getText().trim();
        String tipo         = labelTipo.getText().trim().toUpperCase();
        String saldoStr     = labelSaldo.getText().trim();

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
        banco.getCuentas().add(nuevaCuenta);
        titularEncontrado.agregarCuenta(nuevaCuenta);

        JOptionPane.showMessageDialog(this, "Cuenta creada correctamente para el cliente.");

        labelNCuenta.setText("");
        labelIDDNI.setText("");
        labelTipo.setText("");
        labelSaldo.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField labelIDDNI;
    private javax.swing.JTextField labelNCuenta;
    private javax.swing.JTextField labelSaldo;
    private javax.swing.JTextField labelTipo;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
