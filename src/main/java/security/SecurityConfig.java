package security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Disable CSRF protection for JWT
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/login").permitAll()  // Allow unauthenticated access to /login
                        .anyRequest().authenticated()  // Require authentication for all other requests
                );

        return http.build();
    }

}