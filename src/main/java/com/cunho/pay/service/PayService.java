package com.cunho.pay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface PayService {

    PayResponse create(String orderId, BigDecimal amount);


}
