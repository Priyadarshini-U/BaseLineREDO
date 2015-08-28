package com.tw.purchase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTest {

    @Test
    public void shouldBeTaxable() {
        assertEquals(true, new Type("Electronics").taxable());
    }

    @Test
    public void shouldNotBeTaxableForFoods() {
        assertEquals(false, new Type("Foods").taxable());
    }

    @Test
    public void shouldNotBeTaxableForBooks() {
        assertEquals(false, new Type("Books").taxable());
    }

    @Test
    public void shouldNotBeTaxableForMedicines() {
        assertEquals(false, new Type("Medicines").taxable());
    }

}