package org.iesvdm.haversine;

import java.math.BigDecimal;

public class Extensiones {
    public static final BigDecimal RadioTierraKm = new BigDecimal("6378.0");

    public BigDecimal DistanciaKm(Posicion posOrigen, Posicion posDestino) {
        //TODO

        BigDecimal difLatitud = EnRadianes((posDestino.getLatitud().subtract(posOrigen.getLatitud())));
        BigDecimal difLongitud = EnRadianes((posDestino.getLongitud().subtract(posOrigen.getLongitud())));

        BigDecimal x = new BigDecimal(Math.sin((difLatitud.divide(BigDecimal.valueOf(2)).doubleValue())));
        /*BigDecimal y
                BigDecimal z
                BigDecimal e
         BigDecimal a = x.pow(2).add()
          Math.Cos(posOrigen.Latitud.EnRadianes())*
          Math.Cos(posDestino.Latitud.EnRadianes())*
          Math.Sin(difLongitud/2).AlCuadrado();*/
        /*   var c = 2 * Math.Atan2(Math.Sqrt(a), Math.Sqrt(1 – a));

         */
            return new BigDecimal(0);
        }
        public BigDecimal EnRadianes(BigDecimal valor)
    {
        BigDecimal resultado = (BigDecimal.valueOf(Math.PI).divide(BigDecimal.valueOf(180))).multiply(valor);
        return resultado;
    }

}
