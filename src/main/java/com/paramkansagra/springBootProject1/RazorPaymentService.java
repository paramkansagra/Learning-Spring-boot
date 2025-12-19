package com.paramkansagra.springBootProject1;

public class RazorPaymentService {
    public String pay(){
        String payment = "Razorpay payment";
        System.out.println("Payment from:" + payment);
        System.out.println("Payment To: " + payment);
        return payment;
    }
}
