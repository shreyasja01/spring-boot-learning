package com.HomeWork1.assignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {
    public final CakeBaker cakeBaker;

    public AssignmentApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}
