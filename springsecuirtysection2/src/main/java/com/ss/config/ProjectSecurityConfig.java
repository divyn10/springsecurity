package com.ss.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        /*
        Below is th Custom security configuration
        */

        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/myAccount", "myBalance", "/myLoans", "myCards").authenticated()
                .requestMatchers("/notices", "/contact").permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();

        /*
        Configurations to deny all the requests
         */
        /*http.authorizeHttpRequests((requests) -> requests
                        .anyRequest().denyAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();*/

        /*
        Configurations to permit all the requests
         */
       /* http.authorizeHttpRequests((requests) -> requests
                        .anyRequest().permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();*/
    }
}