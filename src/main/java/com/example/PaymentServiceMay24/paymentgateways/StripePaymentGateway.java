package com.example.PaymentServiceMay24.paymentgateways;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String createPaymentLink(Long orderId) {
        return null;
    }
}
