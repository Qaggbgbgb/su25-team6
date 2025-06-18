package com.example.Game_Platform.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;

import jakarta.servlet.DispatcherType;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    private CustomCustomerDetailsService customerDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        
    HttpSessionRequestCache requestCache = new HttpSessionRequestCache();
    requestCache.setMatchingRequestParameterName(null);
    http
        .csrf(AbstractHttpConfigurer::disable)
        .authorizeHttpRequests((authorize) -> authorize
            .dispatcherTypeMatchers(DispatcherType.FORWARD,
                DispatcherType.ERROR)
            .permitAll()
            .requestMatchers("/", "/customers", "/home", "/customers/signUp","/customers/Login","/games/name","/chat","/chat/*","/chat/**").permitAll()
            .requestMatchers("/css/**", "/js/**", "/images/**", "/webjars/**").permitAll()
            .requestMatchers(HttpMethod.POST, "/customers").permitAll()
            .requestMatchers("/Developers","/Developers/login","/Developers/signup","/Developers/developerhome/*","/Developers/games/*","/Developers/*","/Developers/**",
            "/Developers/gamestore/*","/Developers/gamestore/createForm","/Developers/gamestore/updateForm/*").permitAll()

             .requestMatchers("/customers/library","/customers/library/**").hasAuthority("customer")
            .anyRequest().authenticated())
        .formLogin(form -> form.loginPage("/customers/Login").defaultSuccessUrl("/customers", true).permitAll())
        .exceptionHandling((x) -> x.accessDeniedPage("/403"))
        .logout(withDefaults())
        .requestCache((cache) -> cache
            .requestCache(requestCache));

    return http.build();
  }

  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(customerDetailsService).passwordEncoder(
        passwordEncoder());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

    
}
