package com.tw.purchase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldReturnFalseIfNotImported() {
        assertEquals(false, new Good("chocolates", 12.0, new Type("food")).imported());
    }

    @Test
    public void shouldReturnTrueIfImported() {
        assertEquals(true, new Good("imported box of chocolates", 12.0, new Type("food")).imported());
    }

    @Test
    public void shouldReturnTotalTaxForImportedNotSalesTaxExemptedGood() {
        assertEquals(15, new Good("imported perfume", 12.0, new Type("accesories")).totalTaxPercentage());
    }

    @Test
    public void shouldReturnTotalTaxForNotImportedSalesTaxExemptedGood() {
        assertEquals(10, new Good("perfume", 12.0, new Type("accesories")).totalTaxPercentage());
    }
}