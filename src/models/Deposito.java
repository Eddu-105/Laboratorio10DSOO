package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Empleado;
import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.models.Cliente;
import java.time.LocalDateTime;
import javax.swing.*;

public class Deposito extends Transaccion {

    public Deposito(Cuenta cuenta, float monto, Cliente cliente, Empleado empleado) {
        super("D-" + System.currentTimeMillis(), // ID único por tiempo
              LocalDateTime.now(), 
              monto, 
              empleado, 
              cuenta, 
              cliente);
    }

    @Override
    public void procesar() {
        cuenta.acreditar(monto, this);
    }
}
