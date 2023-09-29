package org.iesvdm.tienda;

public class Producto {
    private String id;
    String nombre;
    String empresa;

    public Producto(String id, String nombre, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
