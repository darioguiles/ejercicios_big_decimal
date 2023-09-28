package org.iesvdm.haversine;

import java.math.BigDecimal;

public class Posicion  {

    private BigDecimal Latitud;
    private BigDecimal Longitud;
    public Posicion(BigDecimal latitud, BigDecimal longitud)
    {
        Latitud = latitud;
        Longitud = longitud;
    }

    public BigDecimal getLongitud() {
        return Longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        Longitud = longitud;
    }

    public BigDecimal getLatitud() {
        return Latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        Latitud = latitud;
    }


}
