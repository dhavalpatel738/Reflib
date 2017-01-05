package com.vmware.licensecheck.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oterner on 12/9/2014.
 *
 * License check application runner
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.vmware.licensecheck")
public class LicenseCheckValidatorRunner {

    private static final Logger logger = LoggerFactory.getLogger(LicenseCheckValidatorRunner.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LicenseCheckValidatorRunner.class, args);
        logger.info("Complete loading context for {}.", ctx.getApplicationName());
    }
}
