package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Usuario;
import javax.swing.*;

public class UsuarioEmpleado extends Usuario {
    public UsuarioEmpleado(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }
    @Override
    public void mostrarPermisos() {
        JOptionPane.showMessageDialog(null, "Permisos: Crear cuentas, Depositar/Retirar para clientes, Ver clientes.");
    }
}
