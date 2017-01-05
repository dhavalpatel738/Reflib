package com.vmware.licensecheck.web;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmware.licensecheck.service.HelloWorldService;



@Controller
public class WelcomeController {

	private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	@Autowired
	private final HelloWorldService helloWorldService;
	@Value("${licenses.location}")
	private String licenseKeytPath;

	/*@RequestMapping(value = "/license", method = RequestMethod.GET)
	public @ResponseBody String checkLicense(@RequestParam("serial") String serial, HttpServletResponse response) {
		try {
			return helloWorldService.isLicenseValid(serial, licenseKeytPath);
		} catch (LicensecheckException e) {
			logger.warn("Getting license type threw exception.", e);
			response.setStatus(403);
			return "Key validation failed.";
		}
	}*/

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public @ResponseBody String statusCheck() {
		return "I'm Alive";
	}
	
	@Autowired
	public WelcomeController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		logger.info("index() is executed!");

		model.put("title", helloWorldService.getTitle(""));
		model.put("msg", helloWorldService.getDesc());
		
		return "index";
	}
	
	@RequestMapping(value = "licenseAgree/downloadWar", method = RequestMethod.GET)
	public String downloadWar(Map<String, Object> model) {
		logger.debug("downloadWar() is executed");
		
		return "downloadWar";
	}
	
	@RequestMapping(value = "/licenseAgreement", method = RequestMethod.GET)
	public String licenseAgreement(Map<String, Object> model) {
		logger.debug("licenseAgreement() is executed");
		
		return "licenseAgreement";
	}
	
}