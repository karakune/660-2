package com.A1.Webflix2.services;

public interface SecurityService {
    String findLoggedInUserEmail();

    void autoLogin(String email, String password);
}