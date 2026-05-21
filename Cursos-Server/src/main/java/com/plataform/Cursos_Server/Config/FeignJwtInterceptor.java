package com.plataform.Cursos_Server.Config;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

@Configuration
public class FeignJwtInterceptor {
    /*@Bean
    public RequestInterceptor jwtInterceptor() {
        return requestTemplate -> {
            var auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth instanceof JwtAuthenticationToken jwtAuth) {
                String token = jwtAuth.getToken().getTokenValue();
                requestTemplate.header("Authorization", "Bearer " + token);
            }
        };
    }*/
}
