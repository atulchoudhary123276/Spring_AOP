package org.example;

public class PaymentService implements Payment{
    public void makePayment(int a){              //join point
        System.out.println("payment processed");
        System.out.println("-------------------");
        System.out.println("payment complete within some seconds");
        System.out.println("-------------------");

    }

    @Override
    public void amount(int a) {
        System.out.println("amount method");
    }
}
