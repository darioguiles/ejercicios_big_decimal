package org.iesvdm.haversine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class haversineTest {

        @Test
        public void cuandoDist664()

        {

                Posicion Igualada = new Posicion(BigDecimal.valueOf(41.57879F), BigDecimal.valueOf(1.617221F));
                Posicion Granada = new Posicion(BigDecimal.valueOf(37.176487F), BigDecimal.valueOf(-3.597929F));

                Extensiones a = new Extensiones();

                BigDecimal distancia = a.DistanciaKm(Igualada, Granada);
                BigDecimal distAprox = distancia.setScale(2, RoundingMode.HALF_UP);

                Assertions.assertEquals(new BigDecimal("664.0"), distAprox);
        }
}
