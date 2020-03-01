package com.A1.Webflix2;

import com.A1.Webflix2.models.Client;
import com.A1.Webflix2.models.ClientPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home").permitAll()
                .antMatchers("/h2-console/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();

				
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("a")
				.roles("USER")
				.build();

		// AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(WebSecurityConfig.class);
		// Client clientBean = (Client) ctx.getBean("setActiveClient");
		// ClientPackage cp = new ClientPackage();
		// cp.maxLocations = 1;

		// Client activeClient = new Client();
		// activeClient.clientPackage = cp;

		// Client.setActiveClient(activeClient);


		// ctx.close();

		return new InMemoryUserDetailsManager(user);
	}
}