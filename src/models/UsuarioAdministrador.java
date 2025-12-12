package com.mycompany.laboratorio9.models;

import com.mycompany.laboratorio9.models.Usuario;
import javax.swing.JOptionPane;

public class UsuarioAdministrador extends Usuario {
    public UsuarioAdministrador(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }
    @Override
    public void mostrarPermisos() {
        JOptionPane.showMessageDialog(null, "Permisos: Acceso total, gestión de usuarios, empleados y clientes.");
    }
}
