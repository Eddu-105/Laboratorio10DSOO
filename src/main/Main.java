package com.mycompany.laboratorio9;

import com.mycompany.laboratorio9.services.Banco;
import com.mycompany.laboratorio9.ui.VentanaLogin;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        java.awt.EventQueue.invokeLater(() -> {
            VentanaLogin ventana = new VentanaLogin(banco);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        });
    }
}