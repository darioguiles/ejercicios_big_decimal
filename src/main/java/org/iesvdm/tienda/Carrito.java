package org.iesvdm.tienda;

import java.time.Instant;
import java.util.Date;

public class Carrito {

   private Date creacion;
   private Usuario usuarioCarrito;

    public Carrito(Usuario usuarioCarrito) {
        this.creacion = Date.from(Instant.now());
        this.usuarioCarrito=usuarioCarrito;
    }

    public Date getCreacion() {
        return creacion;
    }

}
