package org.iesvdm;

import org.iesvdm.InteresCompuesto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.BigDecimalConversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuestoTest {

    @Test
    public void cuandoPrincipal1000Interes5porcientoY10peridos() {

        String principal = "1000";
        int interes = 5;
        int periodos = 10;

        BigDecimal p = new BigDecimal(principal);
        BigDecimal it = new BigDecimal(interes*0.01);

        //TODO
        InteresCompuesto interesCompuesto = new InteresCompuesto(p, it, periodos);
        BigDecimal cantidadFinal = interesCompuesto.calculaMontoFinal().setScale(2, RoundingMode.HALF_UP);

        Assertions.assertEquals(new BigDecimal("1628.89"), cantidadFinal);
    }


}
