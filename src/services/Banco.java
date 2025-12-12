package com.mycompany.laboratorio9.services;

import com.mycompany.laboratorio9.models.Cuenta;
import com.mycompany.laboratorio9.models.Deposito;
import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.models.Transferencia;
import com.mycompany.laboratorio9.models.Usuario;
import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.UsuarioEmpleado;
import com.mycompany.laboratorio9.models.UsuarioCliente;
import com.mycompany.laboratorio9.models.UsuarioAdministrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private final ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private final ArrayList<Cuenta> listaCuentas = new ArrayList<>();
    private final ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Banco() {
        cargarDatosDesdeBD();
        cargarClientesDesdeBD();
        cargarCuentasDesdeBD();
    }

    // ================= USUARIOS =================

    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre_usuario, contrasena, rol, activo) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());

            String rolDetectado = "CLIENTE";
            if (usuario instanceof com.mycompany.laboratorio9.models.UsuarioAdministrador) {
                rolDetectado = "ADMIN";
            } else if (usuario instanceof com.mycompany.laboratorio9.models.UsuarioEmpleado) {
                rolDetectado = "EMPLEADO";
            }

            ps.setString(3, rolDetectado);
            ps.setBoolean(4, true);

            ps.executeUpdate();
            System.out.println("Usuario guardado: " + usuario.getNombreUsuario());
            listaUsuarios.add(usuario);

        } catch (SQLException e) {
            System.out.println("Error Usuario: " + e.getMessage());
        }
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    // ================= CLIENTES =================

    public ArrayList<Cliente> getClientes() {
        return listaClientes;
    }

    public Cliente buscarClientePorIdODni(String idODni) {
        for (Cliente cliente : listaClientes) {
            if (equalsIgnoreCaseSafe(idODni, cliente.getIdCliente()) ||
                equalsIgnoreCaseSafe(idODni, cliente.getDni())) {
                return cliente;
            }
        }
        return null;
    }

    public boolean eliminarCliente(String idODni) {
        String sql = "DELETE FROM clientes WHERE id_cliente = ? OR dni = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, idODni);
            ps.setString(2, idODni);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado de la BD.");

                listaClientes.removeIf(c -> c.getIdCliente().equalsIgnoreCase(idODni) || 
                                            c.getDni().equalsIgnoreCase(idODni));
                return true;
            } else {
                return false; 
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());

            if (e.getErrorCode() == 1451) {
                System.out.println("CAUSA: El cliente tiene cuentas activas.");
            }
            return false;
        }
    }

    // ================= EMPLEADOS =================

    public ArrayList<Empleado> getEmpleados() {
        return listaEmpleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        String sql = "INSERT INTO empleados (id_empleado, dni, nombre, direccion, telefono, email, cargo) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, empleado.getIdEmpleado());
            ps.setString(2, empleado.getDni());
            ps.setString(3, empleado.getNombre());
            ps.setString(4, empleado.getDireccion());
            ps.setString(5, empleado.getTelefono());
            ps.setString(6, empleado.getEmail());
            ps.setString(7, empleado.getCargo());
    
            ps.executeUpdate();
            System.out.println("Empleado guardado correctamente (Sin usuario vinculado).");
            listaEmpleados.add(empleado);

        } catch (SQLException e) {
            System.out.println("Error al guardar Empleado: " + e.getMessage());
        }
    }

    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (id_cliente, dni, nombre, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getDni());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getEmail());

            ps.executeUpdate();
            
            System.out.println("Cliente guardado correctamente (Sin usuario vinculado).");
            listaClientes.add(cliente);

        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        }
    }

    public Empleado buscarEmpleadoPorIdODni(String idODni) {
        for (Empleado empleado : listaEmpleados) {
            if (equalsIgnoreCaseSafe(idODni, empleado.getIdEmpleado()) ||
                equalsIgnoreCaseSafe(idODni, empleado.getDni())) {
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String idODni) {
        String sql = "DELETE FROM empleados WHERE id_empleado = ? OR dni = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, idODni);
            ps.setString(2, idODni);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("¡Éxito! Empleado eliminado de la Base de Datos.");

                listaEmpleados.removeIf(e -> e.getIdEmpleado().equalsIgnoreCase(idODni) || 
                                             e.getDni().equalsIgnoreCase(idODni));

                return true;
            } else {
                System.out.println("No se encontró ningún empleado con ese ID/DNI en la Base de Datos.");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error crítico al eliminar: " + e.getMessage());
            return false;
        }
    }

    // ================= CUENTAS =================

    public ArrayList<Cuenta> getCuentas() {
        return listaCuentas;
    }

    public boolean agregarCuenta(Cuenta cuenta) {
        String sqlCuenta = "INSERT INTO cuentas (numero, tipo, saldo) VALUES (?, ?, ?)";
        String sqlRelacion = "INSERT INTO cliente_cuenta (id_cliente, numero_cuenta) VALUES (?, ?)";

        try (Connection conn = Conexion.getConexion()) {
            conn.setAutoCommit(false); 

            try (PreparedStatement ps = conn.prepareStatement(sqlCuenta)) {
                ps.setString(1, cuenta.getNumero());
                ps.setString(2, cuenta.getTipo());
                ps.setDouble(3, cuenta.getSaldo());
                ps.executeUpdate();
            }

            try (PreparedStatement psRel = conn.prepareStatement(sqlRelacion)) {
                for (Cliente titular : cuenta.getTitulares()) {
                    psRel.setString(1, titular.getIdCliente());
                    psRel.setString(2, cuenta.getNumero());
                    psRel.executeUpdate();
                }
            }

            conn.commit();
            System.out.println("Cuenta guardada en BD.");
            listaCuentas.add(cuenta); 
            return true; // <--- DEVOLVEMOS TRUE (Éxito)

        } catch (SQLException e) {
            System.out.println("Error grave en BD: " + e.getMessage());
            return false; // <--- DEVOLVEMOS FALSE (Falló)
        }
    }

    public Cuenta buscarCuentaPorNumero(String numeroCuenta) {
        for (Cuenta cuenta : listaCuentas) {
            if (equalsIgnoreCaseSafe(numeroCuenta, cuenta.getNumero())) {
                return cuenta;
            }
        }
        return null;
    }

    public Cuenta buscarCuenta(String numeroCuenta) {
            return buscarCuentaPorNumero(numeroCuenta);
        }

        public String eliminarCuenta(String numeroCuenta) {
        Cuenta c = buscarCuentaPorNumero(numeroCuenta);
        if (c == null) {
            return "La cuenta no existe.";
        }
        if (c.getSaldo() > 0) {
            return "Error: La cuenta tiene dinero ($" + c.getSaldo() + "). Debe retirarlo antes de eliminar.";
        }

        Connection conn = null;
        try {
            conn = Conexion.getConexion();
            conn.setAutoCommit(false); 

            String sqlRel = "DELETE FROM cliente_cuenta WHERE numero_cuenta = ?";
            try (PreparedStatement ps = conn.prepareStatement(sqlRel)) {
                ps.setString(1, numeroCuenta);
                ps.executeUpdate();
            }

            String sqlTrans = "DELETE FROM transacciones WHERE cuenta_origen = ? OR cuenta_destino = ?";
            try (PreparedStatement ps = conn.prepareStatement(sqlTrans)) {
                ps.setString(1, numeroCuenta);
                ps.setString(2, numeroCuenta);
                ps.executeUpdate();
            }

            String sqlCta = "DELETE FROM cuentas WHERE numero = ?";
            try (PreparedStatement ps = conn.prepareStatement(sqlCta)) {
                ps.setString(1, numeroCuenta);
                int filas = ps.executeUpdate();

                if (filas == 0) {
                    conn.rollback();
                    return "Error extraño: No se encontró la cuenta en el paso final.";
                }
            }

            conn.commit();

            for (Cliente titular : c.getTitulares()) {
                titular.getCuentas().remove(c);
            }

            listaCuentas.remove(c);

            return "OK"; 

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar cuenta: " + e.getMessage());
            if (conn != null) {
                try { conn.rollback(); } catch (SQLException ex) {}
            }
            return "Error de Base de Datos: " + e.getMessage();
        } finally {
            if (conn != null) {
                try { conn.setAutoCommit(true); conn.close(); } catch (SQLException ex) {}
            }
        }
    }

    // ================= MOVIMIENTOS Y BASE DE DATOS =================

    public List<Transaccion> obtenerMovimientosDeCuenta(String numeroCuenta) {
        Cuenta cuenta = buscarCuentaPorNumero(numeroCuenta);
        if (cuenta == null) return null;
        return cuenta.getMovimientos();
    }

    private void actualizarSaldoBD(Cuenta cuenta) {
        String sql = "UPDATE cuentas SET saldo = ? WHERE numero = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, cuenta.getSaldo());
            ps.setString(2, cuenta.getNumero());
            ps.executeUpdate();
            System.out.println("Saldo actualizado en BD para cuenta: " + cuenta.getNumero());

        } catch (SQLException e) {
            System.out.println("Error al actualizar saldo: " + e.getMessage());
        }
    }

    private void guardarTransaccionBD(Transaccion transaccion, String tipo) {
        String sql = "INSERT INTO transacciones (id, tipo, fecha, monto, cuenta_origen, cuenta_destino, id_empleado, id_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, transaccion.getId());
            ps.setString(2, tipo);
            ps.setTimestamp(3, java.sql.Timestamp.valueOf(transaccion.getFechaHora()));
            ps.setDouble(4, transaccion.getMonto());
            ps.setString(5, transaccion.getCuenta().getNumero());

            if (transaccion instanceof Transferencia) {
                ps.setString(6, ((Transferencia) transaccion).getCuentaDestino().getNumero());
            } else {
                ps.setString(6, null);
            }

            ps.setString(7, (transaccion.getEmpleado() != null) ? transaccion.getEmpleado().getIdEmpleado() : null);
            ps.setString(8, (transaccion.getCliente() != null) ? transaccion.getCliente().getIdCliente() : null);

            ps.executeUpdate();
            System.out.println("Transacción guardada en historial.");

        } catch (SQLException e) {
            System.out.println("Error al guardar transacción: " + e.getMessage());
        }
    }    

    public Deposito registrarDeposito(Cuenta cuentaDestino, float monto, Cliente clienteDepositante, Empleado empleadoAtendedor) {
        Deposito deposito = empleadoAtendedor.registrarDeposito(cuentaDestino, monto, clienteDepositante);
        deposito.procesar(); 

        actualizarSaldoBD(cuentaDestino);          
        guardarTransaccionBD(deposito, "DEPOSITO");     
        return deposito;
    }

    public Retiro registrarRetiro(Cuenta cuentaOrigen, float monto, Cliente clienteTitular, Empleado empleadoAtendedor) {

        Retiro retiro = empleadoAtendedor.registrarRetiro(cuentaOrigen, monto, clienteTitular);
        retiro.procesar();

        actualizarSaldoBD(cuentaOrigen);          
        guardarTransaccionBD(retiro, "RETIRO");  
        return retiro;
    }

    public Transferencia registrarTransferencia(Cuenta origen, Cuenta destino, float monto, Cliente clienteTitular, Empleado empleadoAtendedor) {

        Transferencia transferencia = new Transferencia(origen, destino, monto, clienteTitular, empleadoAtendedor);
        transferencia.procesar(); 

        actualizarSaldoBD(origen);                
        actualizarSaldoBD(destino);             
        guardarTransaccionBD(transferencia, "TRANSFERENCIA"); 
        return transferencia;
    }

    public static boolean equalsIgnoreCaseSafe(String a, String b) {
        return a != null && b != null && a.equalsIgnoreCase(b);
    }
    
    public void cargarDatosDesdeBD() {

        String sql = "SELECT * FROM usuarios";

        try (Connection conn = Conexion.getConexion();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String usuario = rs.getString("nombre_usuario");
                String pass = rs.getString("contrasena");
                String rol = rs.getString("rol");
                boolean activo = rs.getBoolean("activo"); 

                Usuario u = null;

                if ("ADMIN".equalsIgnoreCase(rol)) {
                    u = new UsuarioAdministrador(usuario, pass);
                } else if ("EMPLEADO".equalsIgnoreCase(rol)) {
                    u = new UsuarioEmpleado(usuario, pass);
                } else if ("CLIENTE".equalsIgnoreCase(rol)) {
                    u = new UsuarioCliente(usuario, pass);
                } else {
                    u = new Usuario(usuario, pass);
                }
                this.listaUsuarios.add(u);
            }

            System.out.println("Datos cargados desde BD. Total usuarios: " + listaUsuarios.size());

        } catch (SQLException e) {
            System.out.println("Error cargando usuarios de la BD: " + e.getMessage());
        }
    }
    
    public void cargarClientesDesdeBD() {
        String sql = "SELECT * FROM clientes";

        try (Connection conn = Conexion.getConexion();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String id = rs.getString("id_cliente");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                Cliente c = new Cliente(dni, nombre, direccion, telefono, email, id);

                this.listaClientes.add(c);
            }
            System.out.println("Clientes cargados desde BD: " + listaClientes.size());

        } catch (SQLException e) {
            System.out.println("Error cargando clientes: " + e.getMessage());
        }
    }
    
    public void cargarCuentasDesdeBD() {
        String sqlCuentas = "SELECT * FROM cuentas";

        try (Connection conn = Conexion.getConexion();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(sqlCuentas)) {

            while (rs.next()) {
                String numero = rs.getString("numero");
                String tipo = rs.getString("tipo");
                double saldo = rs.getDouble("saldo");

                Cuenta c = new Cuenta(numero, tipo, saldo, null);

                this.listaCuentas.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error cargando cuentas base: " + e.getMessage());
        }

        String sqlRelacion = "SELECT * FROM cliente_cuenta";

        try (Connection conn = Conexion.getConexion();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(sqlRelacion)) {

            while (rs.next()) {
                String idCliente = rs.getString("id_cliente");
                String numeroCuenta = rs.getString("numero_cuenta");

                Cliente cliente = buscarClientePorIdODni(idCliente);
                Cuenta cuenta = buscarCuentaPorNumero(numeroCuenta);

                if (cliente != null && cuenta != null) {
                    cuenta.agregarTitular(cliente);
                }
            }
            System.out.println("Cuentas cargadas y vinculadas: " + listaCuentas.size());

        } catch (SQLException e) {
            System.out.println("Error vinculando titulares: " + e.getMessage());
        }
    }
    
    public boolean crearCuentaParaCliente(
                                    String idCuenta,
                                    String tipo,
                                    double saldoInicial,
                                    String idCliente) {

        String sqlCuenta =
            "INSERT INTO cuentas (id_cuenta, tipo, saldo) VALUES (?, ?, ?)";
        String sqlRelacion =
            "INSERT INTO cliente_cuenta (id_cliente, id_cuenta) VALUES (?, ?)";

        try (Connection cn = Conexion.getConexion()) {
            cn.setAutoCommit(false);

            try (PreparedStatement ps1 = cn.prepareStatement(sqlCuenta);
                 PreparedStatement ps2 = cn.prepareStatement(sqlRelacion)) {

                ps1.setString(1, idCuenta);
                ps1.setString(2, tipo);
                ps1.setDouble(3, saldoInicial);
                ps1.executeUpdate();

                ps2.setString(1, idCliente);
                ps2.setString(2, idCuenta);
                ps2.executeUpdate();

                cn.commit();
                return true;

            } catch (SQLException e) {
                cn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean depositar(
        String idCuenta,
        double monto,
        String idEmpleado,
        String idCliente) {

        String sqlUpdate =
            "UPDATE cuentas SET saldo = saldo + ? WHERE id_cuenta = ?";
        String sqlTx =
            "INSERT INTO transacciones " +
            "(tipo, fecha_hora, monto, cuenta_destino, id_empleado, id_cliente) " +
            "VALUES (?, NOW(), ?, ?, ?, ?)";

        try (Connection cn = Conexion.getConexion()) {
            cn.setAutoCommit(false);

            try (PreparedStatement ps1 = cn.prepareStatement(sqlUpdate);
                 PreparedStatement ps2 = cn.prepareStatement(sqlTx)) {

                ps1.setDouble(1, monto);
                ps1.setString(2, idCuenta);
                ps1.executeUpdate();

                ps2.setString(1, "DEPOSITO");
                ps2.setDouble(2, monto);
                ps2.setString(3, idCuenta);
                ps2.setString(4, idEmpleado);
                ps2.setString(5, idCliente);
                ps2.executeUpdate();

                cn.commit();
                return true;

            } catch (SQLException e) {
                cn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean retirar(
            String idCuenta,
            double monto,
            String idEmpleado,
            String idCliente) {

        String sqlUpdate =
            "UPDATE cuentas SET saldo = saldo - ? " +
            "WHERE id_cuenta = ? AND saldo >= ?";
        String sqlTx =
            "INSERT INTO transacciones " +
            "(tipo, fecha_hora, monto, cuenta_origen, id_empleado, id_cliente) " +
            "VALUES (?, NOW(), ?, ?, ?, ?)";

        try (Connection cn = Conexion.getConexion()) {
            cn.setAutoCommit(false);

            try (PreparedStatement ps1 = cn.prepareStatement(sqlUpdate);
                 PreparedStatement ps2 = cn.prepareStatement(sqlTx)) {

                ps1.setDouble(1, monto);
                ps1.setString(2, idCuenta);
                ps1.setDouble(3, monto);

                int filas = ps1.executeUpdate();
                if (filas == 0) {
                    cn.rollback(); // saldo insuficiente
                    return false;
                }

                ps2.setString(1, "RETIRO");
                ps2.setDouble(2, monto);
                ps2.setString(3, idCuenta);
                ps2.setString(4, idEmpleado);
                ps2.setString(5, idCliente);
                ps2.executeUpdate();

                cn.commit();
                return true;

            } catch (SQLException e) {
                cn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean transferir(
            String cuentaOrigen,
            String cuentaDestino,
            double monto,
            String idEmpleado,
            String idCliente) {

        String sqlDebito =
            "UPDATE cuentas SET saldo = saldo - ? " +
            "WHERE id_cuenta = ? AND saldo >= ?";
        String sqlCredito =
            "UPDATE cuentas SET saldo = saldo + ? WHERE id_cuenta = ?";
        String sqlTx =
            "INSERT INTO transacciones " +
            "(tipo, fecha_hora, monto, cuenta_origen, cuenta_destino, id_empleado, id_cliente) " +
            "VALUES (?, NOW(), ?, ?, ?, ?, ?)";

        try (Connection cn = Conexion.getConexion()) {
            cn.setAutoCommit(false);

            try (PreparedStatement psDeb = cn.prepareStatement(sqlDebito);
                 PreparedStatement psCre = cn.prepareStatement(sqlCredito);
                 PreparedStatement psTx  = cn.prepareStatement(sqlTx)) {

                psDeb.setDouble(1, monto);
                psDeb.setString(2, cuentaOrigen);
                psDeb.setDouble(3, monto);

                if (psDeb.executeUpdate() == 0) {
                    cn.rollback(); // saldo insuficiente
                    return false;
                }

                psCre.setDouble(1, monto);
                psCre.setString(2, cuentaDestino);
                psCre.executeUpdate();

                psTx.setString(1, "TRANSFERENCIA");
                psTx.setDouble(2, monto);
                psTx.setString(3, cuentaOrigen);
                psTx.setString(4, cuentaDestino);
                psTx.setString(5, idEmpleado);
                psTx.setString(6, idCliente);
                psTx.executeUpdate();

                cn.commit();
                return true;

            } catch (SQLException e) {
                cn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
