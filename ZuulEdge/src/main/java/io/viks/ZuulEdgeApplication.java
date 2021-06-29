package io.viks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableOAuth2Sso
@EnableZuulProxy
public class ZuulEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeApplication.class, args);
	}

}
