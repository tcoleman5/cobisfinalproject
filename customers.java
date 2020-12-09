package com.company;

import java.util.ArrayList;

public class Customers {
    private String cusname;
    private String receipt;

    public Customers(String cusname) {
        this.cusname = cusname;
    }

    public Customers() {
    }

    public String getName() {
        return cusname;
    }

    public void setName(String cusname) {
        this.cusname = cusname;
    }

    public double getReceipt() {
        return receipt;
    }

    public void addProducts() {
        receipt.add(prod);
    }
}
