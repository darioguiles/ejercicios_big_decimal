package org.iesvdm.tienda;

import java.time.Instant;
import java.util.Date;

public class Carrito {

   private Date creacion;

    public Carrito() {
        this.creacion = Date.from(Instant.now());;
    }

    public Date getCreacion() {
        return creacion;
    }

}
