package ru.gb.springlesson7.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Configuration
public class SecurityConfiguration {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//
//        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
//        converter.setJwtGrantedAuthoritiesConverter(source -> {
//            Map<String, Object> claim = source.getClaim("realm_access");
//            List<String> roles = (List<String>) claim.get("roles");
//            return roles.stream()
//                    .map(SimpleGrantedAuthority::new)
//                    .collect(Collectors.toList());
//        });
//
//        return httpSecurity
//                .authorizeHttpRequests(registry -> registry
//                        .requestMatchers("user/**").hasAnyAuthority("user", "admin")
//                        .requestMatchers("admin/**").hasAuthority("admin")
//                        .requestMatchers("auth/**").authenticated()
//                        .requestMatchers("any/**").permitAll()
//                        .anyRequest().denyAll()
//                )
////                .formLogin(Customizer.withDefaults())
////                .oauth2ResourceServer(configurer -> configurer
////                        .jwt(Customizer.withDefaults()))
//                .oauth2ResourceServer(configurer -> configurer
//                        .jwt(jwtConfigurer -> jwtConfigurer
//                                .jwtAuthenticationConverter(converter)))
//                .build();
//    }
}
