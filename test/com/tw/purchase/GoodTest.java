package com.tw.purchase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTest {

    @Test
    public void shouldReturnFalseIfNotImported() {
        assertEquals(false, new Good("chocolates",12.0,new Type("food")).imported());
    }

}