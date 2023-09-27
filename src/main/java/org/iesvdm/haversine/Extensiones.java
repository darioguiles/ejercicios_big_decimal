package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.MathContext;

public class Extensiones {
    public static final BigDecimal radioTierraKm = new BigDecimal("6378.0");

    public BigDecimal distanciaKm(Posicion posOrigen, Posicion posDestino) {
        //TODO

        BigDecimal difLatitud = EnRadianes((posDestino.getLatitud().subtract(posOrigen.getLatitud())));
        BigDecimal difLongitud = EnRadianes((posDestino.getLongitud().subtract(posOrigen.getLongitud())));

                BigDecimal x = new BigDecimal(Math.sin((difLatitud.divide(BigDecimal.valueOf(2)).doubleValue())));
                BigDecimal y = new BigDecimal(Math.cos((EnRadianes(posOrigen.getLatitud())).doubleValue()));
                BigDecimal z  = new BigDecimal(Math.cos((EnRadianes(posDestino.getLatitud())).doubleValue()));
                BigDecimal e  = new BigDecimal(Math.sin((difLongitud.divide(BigDecimal.TWO)).pow(2).doubleValue()));
/*  Math.Cos(posOrigen.Latitud.EnRadianes())*
          Math.Cos(posDestino.Latitud.EnRadianes())*
          Math.Sin(difLongitud/2).AlCuadrado();*/

        BigDecimal a = x.pow(2).add(y.multiply(z.multiply(e)));
        BigDecimal c = BigDecimal.TWO.multiply((BigDecimal.valueOf(Math.atan2(Math.sqrt(a.doubleValue()),Math.sqrt((BigDecimal.ONE.subtract(a)).doubleValue())))));
        /*   var c = 2 * Math.Atan2(Math.Sqrt(a), Math.Sqrt(1 – a));
         */

        /*
        Finalmente, la distancia en Km será dada por el valor obtenido en “c”
        y multiplicado por el radio de la tierra, con lo que el método DistanciaKm quedará así:
         */
           BigDecimal d= c.multiply(radioTierraKm);
            return d;
        }
        public BigDecimal EnRadianes(BigDecimal valor)
    {
        BigDecimal resultado = (BigDecimal.valueOf(Math.PI).divide(BigDecimal.valueOf(180), MathContext.DECIMAL128)).multiply(valor);
        return resultado;
    }

}
