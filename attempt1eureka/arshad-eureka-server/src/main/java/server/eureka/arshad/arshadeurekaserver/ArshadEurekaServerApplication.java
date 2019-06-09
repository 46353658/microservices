package server.eureka.arshad.arshadeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArshadEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArshadEurekaServerApplication.class, args);
	}

}
