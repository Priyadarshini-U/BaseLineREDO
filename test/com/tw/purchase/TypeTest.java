package com.tw.purchase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTest {

    @Test
    public void shouldBeTaxable() {
        assertEquals(true, new Type("Electronics").taxable());
    }

}