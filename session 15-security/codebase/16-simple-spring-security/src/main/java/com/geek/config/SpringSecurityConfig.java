package com.geek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
	 @Bean
	    public UserDetailsService userDetailsService() {
	        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	        manager.createUser(User.withUsername("Albin")
	            .password(passwordEncoder().encode("password"))
	            .roles("USER")
	            .build());
	        
	        manager.createUser(User.withUsername("admin")
	            .password(passwordEncoder().encode("admin"))
	        		// .password("password")
	            .roles("ADMIN")
	            .build());
	        
	        manager.createUser(User.withUsername("Raj")
		            .password(passwordEncoder().encode("raj"))
		        		// .password("password")
		            .roles("ADMIN")
		            .build());
	        return manager;
	    }

	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http.cors().and().csrf().disable().authorizeHttpRequests()
	                .requestMatchers("/home/admin/**").hasRole("ADMIN")
	               .requestMatchers("/home/**").hasAnyRole("ADMIN","USER")
	                .requestMatchers("/").permitAll()
	                .and()
	                .formLogin();
	        return http.build();
	    }
	    @Bean public PasswordEncoder passwordEncoder() {
			//  return NoOpPasswordEncoder.getInstance();
	    	return new BCryptPasswordEncoder();
		  }
}
