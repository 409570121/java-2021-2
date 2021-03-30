package com.kevin.cust;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("0001", 800);
        System.out.println(customer.id + "\t" +
                customer.amount + "\t" + customer.getTotal());
        Silvercustomer mary = new Silvercustomer("Mary", 1000);
        System.out.println(mary.id + "\t" +
                mary.amount + "\t" + mary.getTotal());
    }
}
