package org.iesvdm.tienda;

import java.util.ArrayList;
import java.util.List;

public class LineItem {
    List<Producto> listaProd;
     Integer cantidad;
     Float precio;

    public LineItem(Producto p, Integer cantidad, Float precio) {
        List<Producto> listaProd = new ArrayList<>();
        listaProd.add(p);
        this.listaProd = listaProd;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public List<Producto> getListaProd() {
        return listaProd;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer c)
    {
        this.cantidad=c;
    }

    public Float getPrecio() {
        return precio;
    }
}
