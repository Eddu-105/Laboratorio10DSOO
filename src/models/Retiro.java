package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;
import javax.swing.*;

public class Retiro extends Transaccion {

    public Retiro(Cuenta cuenta, float monto, Cliente cliente, Empleado empleado) {
        super("R-" + System.currentTimeMillis(), // ID único por tiempo
              LocalDateTime.now(),
              monto,
              empleado,
              cuenta,
              cliente);
    }

    @Override
    public void procesar() {
        cuenta.debitar(monto, this);
    }
}
