package ui.Administrador;

import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Transferencia;
import com.mycompany.laboratorio9.services.Banco;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Transferir extends javax.swing.JPanel {
    
    private Banco banco;
    
    public Transferir(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labelIDDNICli = new javax.swing.JTextField();
        labelNCuenta2 = new javax.swing.JTextField();
        labelNCuenta1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelIDDNIEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        txtRegistrarE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID/DNI del cliente:");

        labelIDDNICli.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNICli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNICli.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNICli.setBorder(null);

        labelNCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        labelNCuenta2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNCuenta2.setForeground(new java.awt.Color(0, 0, 0));
        labelNCuenta2.setBorder(null);

        labelNCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        labelNCuenta1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelNCuenta1.setForeground(new java.awt.Color(0, 0, 0));
        labelNCuenta1.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID/DNI del empleado:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Monto a transferir:");

        labelIDDNIEmp.setBackground(new java.awt.Color(255, 255, 255));
        labelIDDNIEmp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelIDDNIEmp.setForeground(new java.awt.Color(0, 0, 0));
        labelIDDNIEmp.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nº de Cuenta que Transfiere (10-20 dígitos):");

        labelMonto.setBackground(new java.awt.Color(255, 255, 255));
        labelMonto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelMonto.setForeground(new java.awt.Color(0, 0, 0));
        labelMonto.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("N° de Cuenta que Recibe (10-20 dígitos):");

        btnEnviar.setBackground(new java.awt.Color(0, 134, 190));
        btnEnviar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(this::btnEnviarActionPerformed);

        txtRegistrarE.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRegistrarE.setForeground(new java.awt.Color(0, 0, 0));
        txtRegistrarE.setText("Transferencia");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/city.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Bienvenido Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtRegistrarE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNCuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel1)
                                .addComponent(labelNCuenta2)
                                .addComponent(jSeparator2)
                                .addComponent(jLabel3)
                                .addComponent(labelMonto)
                                .addComponent(jSeparator3)
                                .addComponent(jLabel4)
                                .addComponent(labelIDDNIEmp)
                                .addComponent(jSeparator4)
                                .addComponent(jLabel5)
                                .addComponent(labelIDDNICli)
                                .addComponent(jSeparator5))
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRegistrarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(12, 12, 12)
                .addComponent(labelNCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIDDNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIDDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
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
        JOptionPane.showMessageDialog(this, "Las cuentas deben tener entre 10 y 20 dígitos.");
        return;
    }

    if (numCuentaOrigen.equals(numCuentaDestino)) {
        JOptionPane.showMessageDialog(this, "La cuenta origen y destino deben ser diferentes.");
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

    if (!cuentaOrigen.getTitulares().contains(clienteTitular)) {
        JOptionPane.showMessageDialog(this, "El cliente no es titular de la cuenta origen.");
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
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEnviarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField labelIDDNICli;
    private javax.swing.JTextField labelIDDNIEmp;
    private javax.swing.JTextField labelMonto;
    private javax.swing.JTextField labelNCuenta1;
    private javax.swing.JTextField labelNCuenta2;
    private javax.swing.JLabel txtRegistrarE;
    // End of variables declaration//GEN-END:variables
}
