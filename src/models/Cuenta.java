package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Transaccion;
import com.mycompany.laboratorio9.models.Cliente;
import java.util.ArrayList;

public class Cuenta {

    private String numero;
    private String tipo;
    private double saldo;
    private ArrayList<Transaccion> movimientos;
    private ArrayList<Cliente> titulares;

    public Cuenta(String numero, String tipo, double saldoInicial, ArrayList<Cliente> titulares) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = redondear(saldoInicial);
        this.titulares = (titulares != null) ? titulares : new ArrayList<>();
        this.movimientos = new ArrayList<>();
    }

    private double redondear(double monto) {
        return Math.round(monto * 100) / 100.0;
    }

    // ====== GETTERS ======
    public String getNumero()         { return numero; }
    public String getTipo()           { return tipo; }
    public double getSaldo()          { return saldo; }
    public ArrayList<Cliente> getTitulares()    { return titulares; }
    public ArrayList<Transaccion> getMovimientos() { return movimientos; }

    // ====== SETTERS ======
    public void setNumero(String numero)              { this.numero = numero; }
    public void setTipo(String tipo)                  { this.tipo = tipo; }
    public void setSaldo(double saldo)                { this.saldo = redondear(saldo); }
    public void setTitulares(ArrayList<Cliente> titulares) { this.titulares = titulares; }

    // ====== MÉTODOS DE NEGOCIO ======
    public void acreditar(double monto, Transaccion transaccion) {
        saldo = redondear(saldo + monto);
        movimientos.add(transaccion);
    }

    public boolean debitar(double monto, Transaccion transaccion) {
        if (saldo >= monto) {
            saldo = redondear(saldo - monto);
            movimientos.add(transaccion);
            return true;
        }
        return false;
    }

    public ArrayList<Transaccion> listarMovimientos() {
        return new ArrayList<>(movimientos);
    }

    public void agregarTitular(Cliente cliente) {
        titulares.add(cliente);
    }
}