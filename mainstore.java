package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

      public static void main(String[] args) {
        
        ArrayList<Inventory> products = new ArrayList<Inventory>();
        ArrayList<Prices> prices = new ArrayList<Prices();
        ArrayList<Customers> customers = new ArrayList<Customers>();
  
        Store st = new Store();
        st.setProduct("Red-Hot Spicy Doritos");
        st.setPrice(2.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Cool Ranch Doritos");
        st.setPrice(2.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Coke");
        st.setPrice(0.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Diet Coke");
        st.setPrice(0.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Pepsi");
        st.setPrice(0.99);
        products.add(st);
        
        st = new Sstore();
        st.setProduct("Five Hour Energy");
        st.setPrice(3.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Sunflower Seeds");
        st.setPrice(0.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Peanuts");
        st.setPrice(0.99);
        products.add(st);
        
        st = new Store();
        st.setProduct("Mac Book Chargers");
        st.setPrice(120.00);
        products.add(st);
        
        st = new Store();
        st.setProduct("Dell Chargers");
        st.setPrice(50.00);
        products.add(st);

        Scanner input = new Scanner(System.in);
        String answer = null;
        String answertwo = null;
        String prod = null;
        double total = 0;
        
        do{
            System.out.println("Hello, how can we help you?" + "To begin new transaction, type 'a'. To close store, type 'b'.);
            answer = input.nextLine();
     
                if (answer.equals("a")) {
                  System.out.print("Input Customer Name:");
                  String cusname = input.nextLine();
                  Customers newcus = new Customer();
                  Customers.add(newcus);

                  newreceipt.setReceipt(cusname);
                  receipt.add(newreceipt);
                  
                  do {

                    System.out.println("What do you want to buy? To add product, type '1'. To complete transaction, type '2' ");
                      answertwo = input.nextLine();
                      if(answertwo.equals("1")) {
                 
                    System.out.println("What product would you like to add?");
                      prod = input.nextLine();

                      for (int i = 0; i < products.size(); i++) {
                      if (products.get(i).getName().equals(prod)) {
                        index = i;
                        receipt.addInventory(products.get(i));
                        total += products.get(i).getPrices();
                        receipt.setTotal(total);
               
                   } else if(answertwo.equals("2")) {
                        System.out.println("Transaction complete. Thank you for shopping!");
                   }
                   
                } while (!answertwo.equals("2"));
                } while (!answer.equals("c"));
              }
            }
        System.out.println("The store is now closing.");
        System.out.println("Here's your receipt:");
        System.out.println("The inventory sold is: " + receipt);
        System.out.println("The total is: " + total);
        }
    }
