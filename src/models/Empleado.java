package com.mycompany.laboratorio9.models;


import com.mycompany.laboratorio9.models.Retiro;
import com.mycompany.laboratorio9.models.Cliente;
import com.mycompany.laboratorio9.models.Persona;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;
    private String usuarioAsociado;

    public Empleado() {}

    public Empleado(String dni, String nombre, String direccion,
                    String telefono, String email, String idEmpleado, String cargo, String usuarioAs) {
        super(dni, nombre, direccion, telefono, email);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public String getIdEmpleado() { return idEmpleado; }
    public String getCargo() { return cargo; }
    public void setIdEmpleado(String idEmpleado) {
    this.idEmpleado = idEmpleado;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setUsuarioAsociado(String usuarioAs) {
        this.usuarioAsociado = usuarioAs;
    }

    public void setCargo(String cargo) { this.cargo = cargo; }
    public Deposito registrarDeposito(Cuenta cuenta, float monto, Cliente cliente) {
        return new Deposito(cuenta, monto, cliente, this);
    }
    public Retiro registrarRetiro(Cuenta cuenta, float monto, Cliente cliente) {
        return new Retiro(cuenta, monto, cliente, this);
    }


}
