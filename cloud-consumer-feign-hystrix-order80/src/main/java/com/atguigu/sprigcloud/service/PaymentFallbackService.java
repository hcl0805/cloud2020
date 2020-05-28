package com.atguigu.sprigcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "PaymentFallbackService fall back paymentInfo_Ok ,😭😭😭";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall back paymentInfo_TimeOut ,😭😭😭";
    }
}
