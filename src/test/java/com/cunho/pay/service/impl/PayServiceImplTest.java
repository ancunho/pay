package com.cunho.pay.service.impl;

import com.cunho.pay.PayApplicationTests;
import com.cunho.pay.service.PayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PayServiceImplTest extends PayApplicationTests {


    @Autowired
    private PayService payService;


    @Test
    public void create() {
        payService.create("8346598798798432", BigDecimal.valueOf(0.01));

    }
}










