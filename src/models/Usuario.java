package com.mycompany.laboratorio9.models;

import javax.swing.*;

public class Usuario {
    protected String nombreUsuario;
    protected String contraseña;
    protected boolean activo;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.activo = true;
    }
    
    public String getNombreUsuario(){return nombreUsuario;}
    public String getContraseña(){return contraseña;}
    

    public boolean login(String nombreUsuario, String contraseña) {
        return activo && this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null,
        "Usuario: " + nombreUsuario + " (Estado: " + (activo ? "Activo" : "Inactivo") + ")");
    }

    public void mostrarPermisos() {
        JOptionPane.showMessageDialog(null, "Permisos por defecto.");
    }
}
