package org.example;

//@Component
public class PaymentService implements Payment{
    public void makePayment(int a){              //join point
        System.out.println("payment processed");
        System.out.println("-------------------");
        System.out.println("payment complete within some seconds");
        System.out.println("-------------------");

    }

//    @Overrid
    public void amount(int a) {
        System.out.println("amount method");
    }
}
