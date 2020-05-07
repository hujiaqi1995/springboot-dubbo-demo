package com.xdu.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xdu.dubbointerface.service.ServiceApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DubboConsumerApplication {


	@Reference(version = "1.0.0")
	private ServiceApi serviceApi;

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}

	@PostConstruct
	public void init() {
		String res = serviceApi.sayHello("aabb");
		System.out.println(res);
	}

}
