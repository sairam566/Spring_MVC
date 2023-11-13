package com.tsr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.tsr.service","com.tsr.exceptions"})
public class RootConfig {

}
