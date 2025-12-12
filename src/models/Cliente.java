package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Persona;
import java.util.ArrayList;

public class Cliente extends Persona {

    private String idCliente;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String dni, String nombre, String direccion,
                   String telefono, String email, String idCliente) {
        super(dni, nombre, direccion, telefono, email);
        this.idCliente = idCliente;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public float getSaldoTotal() {
        float total = 0;
        for (Cuenta cuenta : cuentas) 
            total += cuenta.getSaldo();
            return Math.round(total * 100) / 100f;
    }
}
