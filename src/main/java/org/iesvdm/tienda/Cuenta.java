package org.iesvdm.tienda;

import java.time.Instant;
import java.util.Date;

public class Cuenta {

    String id;
    String direccionPago;
    Boolean estaAbierta;
    Date fechaInicio;
    Date fechaFin;

    Cliente clienteCuenta;

    Carrito carritoCuenta;

    public Cuenta(String id, String direccionPago, Boolean estaAbierta, Cliente clienteCuenta, Carrito carritoCuenta) {
        this.id = id;
        this.direccionPago = direccionPago;
        this.estaAbierta = estaAbierta;
        this.fechaInicio = Date.from(Instant.now());
        this.clienteCuenta= clienteCuenta;
        this.carritoCuenta=carritoCuenta;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccionPago() {
        return direccionPago;
    }

    public void setDireccionPago(String direccionPago) {
        this.direccionPago = direccionPago;
    }

    public Boolean getEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(Boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getClienteCuenta() {
        return clienteCuenta;
    }
}
