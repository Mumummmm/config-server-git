package com.spike.configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author spike.lin
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGitApplication.class, args);
	}
}
