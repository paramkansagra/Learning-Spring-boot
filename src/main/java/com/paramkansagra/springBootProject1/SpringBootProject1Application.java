package com.paramkansagra.springBootProject1;

import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject1Application implements CommandLineRunner {

    // This is tight coupling and
    private RazorPaymentService paymentService;

    // Now dependency injection framework will see that we need the payment service here
    // and would automatically add the dependency using the bean (component)
    public SpringBootProject1Application(RazorPaymentService razorPaymentService) {
        this.paymentService = razorPaymentService;
    }

    // this is where the program starts from
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProject1Application.class, args);
    }

    // This runs just after the application context is set and everything is good to go
    // Also this is a non-static method meaning we can use objects which are not static, and we can init on run time
    @Override
    public void run(String @NonNull ... args) throws RuntimeException {
        try {
            String payment = paymentService.pay();
            System.out.println("Payment done:" + payment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
