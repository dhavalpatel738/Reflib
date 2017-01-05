package com.vmware.licensecheck.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.vmware.licensecheck.service" })
public class SpringRootConfig {
}