package com.amal.MirroredNumber_SpringBoot.Demo;

import com.amal.MirroredNumber_SpringBoot.Demo.MirroredNumberSpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MirroredNumberSpringBootApplication.class);
	}

}
