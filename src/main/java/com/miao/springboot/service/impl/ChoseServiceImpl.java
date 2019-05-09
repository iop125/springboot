package com.miao.springboot.service.impl;

import com.miao.springboot.service.ChoseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class ChoseServiceImpl implements ChoseService {
    @Override
    public String read() {
        return "pro";
    }
}
