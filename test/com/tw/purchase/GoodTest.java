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

    @Test
    public void shouldReturnTotalTaxForImportedSalesTaxExemptedGood() {
        assertEquals(10, new Good("perfume", 12.0, new Type("accesories")).totalTaxPercentage());
    }

    @Test
    public void shouldBeEqualWithItself() {
        Good good1 = new Good("perfume", 12.0, new Type("accesories"));

        assertEquals(good1, good1);
    }

    @Test
    public void shouldBeEqualWithGoodWithSameName() {
        Good good1 = new Good("perfume", 12.0, new Type("accesories"));
        Good good2 = new Good("perfume", 12.0, new Type("accesories"));

        assertEquals(good1, good2);
    }

    @Test
    public void shouldBeEqualWithGoodWithSameNameAndSamePrice() {
        Good good1 = new Good("perfume", 12.0, new Type("accesories"));
        Good good2 = new Good("perfume", 12.0, new Type("accesories"));

        assertEquals(good1, good2);
    }

    @Test
    public void shouldHaveEqualHashCodeForEqualGoods() {
        Good good1 = new Good("perfume", 12.0, new Type("accesories"));
        Good good2 = new Good("perfume", 12.0, new Type("accesories"));

        assertEquals(good1.hashCode(), good2.hashCode());
    }

    @Test
    public void shouldReturnTaxPercentage() {
        Good good1 = new Good("perfume", 12.0, new Type("accesories"));

        assertEquals(1.2, good1.calculateTax(10), 0.0);

    }
}