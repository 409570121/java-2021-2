package com.kevin.cust;

public class Silvercustomer extends Customer {
    float discount = 0.1f;

    public Silvercustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }
}