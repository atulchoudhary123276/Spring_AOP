package org.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect            //aspect(class) which contain all advice/action
public class MyAspect {
//    @Before("execution(* org.example.PaymentService.makePayment(..))")  //(..) -for parameter in joint method   //point cut expression(match this with join point)
//    public void beforePayment(){                                   //advice(action on joint point)
//        System.out.println("Advice:payment starting...");
//    }
//    @After("execution(* org.example.PaymentService.makePayment())")  //() -for zeroParameter //point cut expression(match this with join point)
//    public void afterPayment(){                                           //advice(action on join point)
//        System.out.println("Advice:payment done...");
//    }

    //wrap this join poin method and only execute itself
    @Around("execution(* org.example.PaymentService.makePayment(..))")
    public void aroundPayment(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Advice: wrap makepayment  and process payment");
        joinPoint.proceed(); //it execute join point method explicitly
    }
    //first * for any return type of service method
    //execution(* org.example.PaymentService *)  --last * execute before/after all method of service class


///--you can also define pointcut as method and use it anywhere
    @Pointcut("execution(public * make*(..))")        //make* -- it find first method name match only
     public void myPointCuts(){
     }

    @After("myPointCuts()")
    public void afterPayment(){
        System.out.println("Advice:payment done..");
    }





}
