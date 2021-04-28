package com.example.demo.service;

import com.example.demo.config.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    private DemoProperties demoProperties;

    @Autowired
    public void setDemoProperties(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }
}
