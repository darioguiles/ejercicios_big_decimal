package org.iesvdm.haversine;

public class Posicion {

    private float Latitud;
    private float Longitud;
    public Posicion(float latitud, float longitud)
    {
        Latitud = latitud;
        Longitud = longitud;
    }

    public float getLatitud() {
        return Latitud;
    }

    public void setLatitud(float latitud) {
        Latitud = latitud;
    }

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float longitud) {
        Longitud = longitud;
    }
}
