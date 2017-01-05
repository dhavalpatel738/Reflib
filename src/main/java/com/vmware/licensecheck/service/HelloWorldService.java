package com.vmware.licensecheck.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "Gradle + Spring MVC Hello World Example";

	}

	public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Hello World";
		}else{
			return "Hello " + name;
		}
		
	}
	
/*	public static final String PATH_DIR_PREFIX = "dir://";
    private Licensecheck licensecheck = new Licensecheck();
	    
    public String isLicenseValid(String serial, String licenseKeytPath) throws LicensecheckException {
        logger.info("Checking license {}", serial);
        LicenseAttr licenseAttr = licensecheck.checkSerial(serial, null, null, PATH_DIR_PREFIX + licenseKeytPath);
        logger.info("Found {}", licenseAttr.getLicenseEdition());
        return licenseAttr.getLicenseEdition();
    }*/
}