package com.mycompany.laboratorio9.models;

public class Persona {

    protected String dni;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String email;

    public Persona() {}

    public Persona(String dni, String nombre, String direccion, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // --- Métodos Getters ---
    public String getDni()       { return dni; }
    public String getNombre()    { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono()  { return telefono; }
    public String getEmail()     { return email; }

    // --- Métodos Setters ---
    public void setNombre(String nombre)         { this.nombre = nombre; }
    public void setDireccion(String direccion)   { this.direccion = direccion; }
    public void setTelefono(String telefono)     { this.telefono = telefono; }
    public void setEmail(String email)           { this.email = email; }
}
