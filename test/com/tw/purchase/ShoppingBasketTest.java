package com.tw.purchase;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketTest {

    @Test
    public void shouldCalculateTaxForEmptyBasket() {
        assertEquals(0, new ShoppingBasket().totalTax(), 0.0);
    }


}