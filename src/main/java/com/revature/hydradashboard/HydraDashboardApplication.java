package com.revature.hydradashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication

public class HydraDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydraDashboardApplication.class, args);
	}
}
