/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shooping;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ed
 */
public class ShoppingCart {
    private ArrayList items;
    
    public ShoppingCart() {
        items = new ArrayList();
    }
    public double getBalance() {
        double balance = 0.00;
        for (Iterator i = items.iterator(); i.hasNext();) {
            Product item = (Product)i.next();
            balance += item.getPrice();
    }
        return balance;
    }
    public void addItem(Product item) {
        items.add(item);
    }
    public void removeItem(Product item) {
        items.remove(item);
    }
    public int getItemCount() {
        return items.size();
    }
    public void empty() {
        items.clear();
    }

}
