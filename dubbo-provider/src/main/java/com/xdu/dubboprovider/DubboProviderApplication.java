package com.xdu.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args) {
		new EmbeddedZooKeeper(2181, false).start();
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}
