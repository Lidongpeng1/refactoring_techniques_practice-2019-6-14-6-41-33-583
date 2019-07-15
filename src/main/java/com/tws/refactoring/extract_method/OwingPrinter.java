package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        printBanner();

        // print owings
        while (elements.hasNext()) {
            outstanding = getOutstanding(elements, outstanding);
        }

        // print details
        printDetails("name: " + name, "amount: " + outstanding);
    }

    private double getOutstanding(Iterator<Order> elements, double outstanding) {
        Order each = (Order) elements.next();
        outstanding += each.getAmount();
        return outstanding;
    }

    private void printDetails(String s, String s2) {
        System.out.println(s);
        System.out.println(s2);
    }

    private void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
