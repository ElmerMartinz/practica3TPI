/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shooping;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Ed
 */
public class ShoppingCartTest extends TestCase {
    
    private ShoppingCart cart1;
    private Product prod1;
    
    public static Test Suite() {
       TestSuite suite= new TestSuite(ShoppingCartTest.class);
       return suite;
    }

    
    @Override
    protected void setUp(){
       cart1 = new ShoppingCart();
       prod1 = new Product("P001", "Plasma TV LG 32","Plasma TV with TDT Decod. and high resolution Screen",699.99);
       cart1.addItem(prod1);

    }
    
    @Override
    protected void tearDown(){
        cart1=null;
        prod1=null;
    }

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    public void testGetBalance() {
        System.out.println("getBalance");
        double expResult = 699.99;
        double result = cart1.getBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    public void testAddItem() {
        System.out.println("addItem");
        Product prod2 = new Product("P002", "DVD player Sanmsung","DVD player with remote control and programming features", 39.99);
        cart1.addItem(prod2);
        assertEquals(2, cart1.getItemCount());
        double expectedBalance = prod1.getPrice()+prod2.getPrice();
        assertEquals(expectedBalance, cart1.getBalance());
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    public void testRemoveItem() {
        System.out.println("removeItem");
         cart1.removeItem(prod1);
        assertEquals(0, cart1.getItemCount());
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    public void testGetItemCount() {
        System.out.println("getItemCount");
        int expResult = 1;
        int result = cart1.getItemCount();
        assertEquals(expResult, result);

    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    public void testEmpty() {
        System.out.println("empty");
        cart1.empty();
        assertEquals(0, cart1.getItemCount());

    }
    
}
