package org.iesvdm.tienda;

import java.util.Date;

public class Pedido {
    String numero;
    Date fechaOrden;
    Date fechaEnvio;
    String direccionEnvio;
    EstadoPedido estadoPedido;

    public Pedido(String numero, Date fechaOrden, String direccionEnvio, EstadoPedido estadoPedido) {
        this.numero = numero;
        this.fechaOrden = fechaOrden;
        this.direccionEnvio = direccionEnvio;
        this.estadoPedido = estadoPedido;
    }

    public String getNumero() {
        return numero;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

}
