package com.example.PaymentServiceMay24.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String createPaymentLink(Long orderId) throws RazorpayException;
}
