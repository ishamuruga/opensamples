package com.apstore.api.pos.apstoreposapi.config;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class SpringSecurityCORSFilter {
    // @Bean
    // public FilterRegistrationBean corsFilter() {
    //     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    //     CorsConfiguration config = new CorsConfiguration();
    //     config.setAllowCredentials(true);
        //config.addAllowedOrigin("http://localhost:3000");
        //config.setAllowedMethods(Arrays.asList("POST", "OPTIONS", "GET", "DELETE", "PUT"));
        //config.setAllowedHeaders(Arrays.asList("X-Requested-With", "No-Auth","Origin", "Content-Type", "Accept", "isrefreshtoken","authorization", "Authorization"));
        //source.registerCorsConfiguration("/**", config);
    //     config.setAllowCredentials(true);
    //     config.addAllowedOrigin("*");
    //     config.addAllowedHeader("*");
    //     config.addAllowedMethod("*");
    //     source.registerCorsConfiguration("/**", config);

    //     FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
    //     bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
    //     return bean;
    // }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:3000");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }


}
