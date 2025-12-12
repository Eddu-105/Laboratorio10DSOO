package com.mycompany.laboratorio9.models;


import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Persona;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;

    public Empleado() {}

    public Empleado(String dni, String nombre, String direccion,
                    String telefono, String email, String idEmpleado, String cargo) {
        super(dni, nombre, direccion, telefono, email);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    // --- Getters y Setters específicos de Empleado ---
    public String getIdEmpleado() { return idEmpleado; }
    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    public Deposito registrarDeposito(Cuenta cuenta, float monto, Cliente cliente) {
        return new Deposito(cuenta, monto, cliente, this);
    }

    public Retiro registrarRetiro(Cuenta cuenta, float monto, Cliente cliente) {
        return new Retiro(cuenta, monto, cliente, this);
    }
}
