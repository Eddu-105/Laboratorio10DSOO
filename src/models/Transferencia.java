package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto, Cliente cliente, Empleado empleado) {
        super("T-" + System.currentTimeMillis(), LocalDateTime.now(), monto, empleado, cuentaOrigen, cliente);
        this.cuentaDestino = cuentaDestino;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesar() {
        if (cuenta.debitar(monto, this)) {
            cuentaDestino.acreditar(monto, this);
        } else {
            System.out.println("Error: Saldo insuficiente para la transferencia.");
        }
    }
}