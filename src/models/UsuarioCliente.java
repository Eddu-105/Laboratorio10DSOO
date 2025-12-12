package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Usuario;
import javax.swing.*;

public class UsuarioCliente extends Usuario {
    public UsuarioCliente(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }
    @Override
    public void mostrarPermisos() {
        JOptionPane.showMessageDialog(null, "Permisos: Depositar, Retirar, Ver movimientos, etc.");
    }
}
