package com.robotfleet;

import org.springframework.boot.SpringApplication;

public class TestRobotFleetApplication {

	public static void main(String[] args) {
		SpringApplication.from(RobotFleetApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
