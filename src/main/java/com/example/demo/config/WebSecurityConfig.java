//package com.example.demo.config;
//
//import com.example.demo.service.UserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final CustomAuthenticationProvider provider;
//
//    public WebSecurityConfig(CustomAuthenticationProvider provider) {
//        this.provider = provider;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(provider);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        String[] staticResources = {
//                "/css/**",
//                "/img/**",
//                "/js/**",};
//
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/", "/wineries", "/wines", "/signup", "/api/**", "/events/sort/**").permitAll()
//                .antMatchers("/resource/**").permitAll()
//                .antMatchers(staticResources).permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login").permitAll()
//                .failureUrl("/login?error=BadCredentials")
//                .defaultSuccessUrl("/events", true)
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .clearAuthentication(true)
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessUrl("/login")
//                .and()
//                .exceptionHandling().accessDeniedPage("/access_denied");
//    }
//}