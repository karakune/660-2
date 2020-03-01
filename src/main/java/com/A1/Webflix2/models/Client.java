package com.A1.Webflix2.models;

import java.sql.Date;

import org.springframework.context.annotation.Bean;

public class Client {
    public String firstName;

    public String lastName;

    public String email;

    public String phoneNumber;

    public String addressNumber;

    public String addressStreet;

    public String addressCity;

    public String addressProvince;

    public String addressPostalCode;

    public Date birthDate;

    public String password;

    public Location[] locations;

    public ClientPackage clientPackage;
    

    private static Client activeClient;

    @Bean
    public static Client getActiveClient() {
        return activeClient;
    }

    @Bean
    public static void setActiveClient(Client client) {
        System.out.println("***********************************************");
        System.out.println("Active client set!");
        System.out.println("***********************************************");
        activeClient = client;
    }
}