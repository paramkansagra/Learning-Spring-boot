package com.paramkansagra.springBootProject1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

// So when the payment.provider in the application.properties is equal to stripe then make the bean of razorpay else don't make
@Component
@ConditionalOnProperty(name = "payment.provider" , havingValue = "razorpay")
public class RazorPaymentService implements PaymentService {
    public String pay() {
        String payment = "Razorpay";
        System.out.println("Payment from:" + payment);
        return payment;
    }
}
