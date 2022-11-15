package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

@Override
// here we are overriding the configure method for role based authentication

protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	auth.inMemoryAuthentication().withUser("Sourav").password("Password").roles("ADMIN");
}	
@Override
protected void configure(HttpSecurity http) throws Exception{
	// here we are disabling the http csrf token
	http.csrf().disable();
	
	// now we will specify the method where we want to implement the security
	
	// here we are fully implementing the security for every request so we use fully authenticated
	http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
}

// it is expecting the password in an encrypted format so we will use the PasswordEncoder Class but here it is not expecting the password in an encrypted format
@Bean
public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}


}
