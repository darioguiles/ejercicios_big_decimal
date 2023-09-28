package org.iesvdm.tienda;

public class LineItem {
    Integer cantidad;
    float precio;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public LineItem(Integer cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
