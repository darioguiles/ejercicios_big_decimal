package org.iesvdm.tienda;

import java.math.BigDecimal;
import java.util.Date;

public class Pago {
    String id;
    Date fechaPago;
    BigDecimal total;
    String detalles;


    public Pago(String id, Date fechaPago, BigDecimal total) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
