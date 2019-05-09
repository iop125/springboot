package com.miao.springboot.service.impl;

import com.miao.springboot.service.ChoseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ChoseService2Impl implements ChoseService {
    @Override
    public String read() {
        System.out.println("------ChoseService2Impl-----");
        return "dev";
    }
}
