/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lap3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class CheckCartTest {
    
    @Test
    void testAddItem() {
        CheckCart cart = new CheckCart();

        Product product = new Product("1", "Product A", 100, true);
        CartItem cartItem = new CartItem(product, 1);

        cart.addItem(cartItem);

        assertEquals(1, cart.getItems().size());
        assertEquals(product, cart.getItems().get(0).getProduct());
        assertEquals(1, cart.getItems().get(0).getQuantity());
    }

    @Test
    void testGetTotalCost() {
        CheckCart cart = new CheckCart();

        Product product1 = new Product("1", "Product 1", 100, true);
        CartItem cartItem1 = new CartItem(product1, 1);

        Product product2 = new Product("2", "Product 2", 200, true);
        CartItem cartItem2 = new CartItem(product2, 1);

        cart.addItem(cartItem1);
        cart.addItem(cartItem2);

        assertEquals(300, cart.getTotalCost());
    }

}
