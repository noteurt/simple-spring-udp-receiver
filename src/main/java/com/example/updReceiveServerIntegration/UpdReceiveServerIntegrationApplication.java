package com.example.updReceiveServerIntegration;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UpdReceiveServerIntegrationApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UpdReceiveServerIntegrationApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder()
				.bannerMode(Banner.Mode.OFF)
				.sources(UpdReceiveServerIntegrationApplication.class)
				.run(args);
	}

}
