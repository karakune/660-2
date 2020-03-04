package com.A1.Webflix2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashSet;
import java.util.Set;

import com.A1.Webflix2.models.Client;
import com.A1.Webflix2.repositories.ClientRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) {
        Client client = clientRepository.findByEmail(email);
        if (client == null) throw new UsernameNotFoundException(email);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(client.getClientPackage().getPackageName()));
        
        return new org.springframework.security.core.userdetails.User(client.getEmail(), client.getPassword(), grantedAuthorities);
    }
}