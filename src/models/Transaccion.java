package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;

public class Transaccion {

    protected String id;
    protected LocalDateTime fechaHora;
    protected float monto;
    protected Empleado empleado;
    protected Cuenta cuenta;    
    protected Cliente cliente;  

    public Transaccion() {
        this.fechaHora = LocalDateTime.now();
    }

    public Transaccion(String id, LocalDateTime fechaHora, float monto,
                       Empleado empleado, Cuenta cuenta, Cliente cliente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.monto = monto;
        this.empleado = empleado;
        this.cuenta = cuenta;
        this.cliente = cliente;
    }

    // --- Métodos Getters ---
    public String getId()                 { return id; }
    public LocalDateTime getFechaHora()   { return fechaHora; }
    public float getMonto()               { return monto; }
    public Empleado getEmpleado()         { return empleado; }
    public Cuenta getCuenta()             { return cuenta; }
    public Cliente getCliente()           { return cliente; }

    @Override
    public String toString() {
        return "ID: " + id +
               "\nFecha: " + fechaHora +
               "\nMonto: S/ " + monto +
               "\nEmpleado: " + (empleado != null ? empleado.getNombre() : "No Aplica") +
               "\nCliente: "   + (cliente != null ? cliente.getNombre() : "No Aplica") +
               "\nCuenta: "    + (cuenta != null ? cuenta.getNumero() : "No Aplica");
    }

    //Polimorfismo
    public void procesar() {
    }
}
