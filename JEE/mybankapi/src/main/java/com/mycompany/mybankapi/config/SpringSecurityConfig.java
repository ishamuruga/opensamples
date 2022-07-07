package com.mycompany.mybankapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Autowired
	private CustomJwtAuthenticationFilter customJwtAuthenticationFilter;

    @Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/api/*").hasRole("ADMIN")
                .antMatchers("/auth/*").permitAll()
                .antMatchers("/register/*").permitAll()
                .anyRequest().authenticated().and()
                .exceptionHandling()
                .authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.addFilterBefore(customJwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
    }           
    
}
