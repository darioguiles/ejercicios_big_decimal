package org.iesvdm.tienda;

public class Cliente {

    String id;
    String direccion;
    String telefono;
    String email;

    public Cliente(String id, String direccion, String telefono, String email) {
        this.id=id;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
