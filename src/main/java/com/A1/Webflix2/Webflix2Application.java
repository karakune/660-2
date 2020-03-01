package com.A1.Webflix2;

import java.util.List;

import com.A1.Webflix2.models.ClientPackage;
import com.A1.Webflix2.services.ClientPackageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Webflix2Application implements CommandLineRunner {

	@Autowired
	ClientPackageService clientPackageService;

	public static void main(String[] args) {
		SpringApplication.run(Webflix2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ClientPackage> packages = clientPackageService.list();

		for (ClientPackage p : packages) {
			System.out.println(p.getPackageName());
		}
	}

}
