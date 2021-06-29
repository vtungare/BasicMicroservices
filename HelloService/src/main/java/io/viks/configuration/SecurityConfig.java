package io.viks.configuration;

//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
public class SecurityConfig {//extends WebSecurityConfigurerAdapter{
	
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/**").authorizeRequests()
//            .antMatchers("/", "/login**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .oauth2Login();
//    }

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		
//		auth.inMemoryAuthentication()
//			.withUser("User1")
//			.password("pass1")
//			.roles("USER")
//			.and()
//			.withUser("Admin1")
//			.password("pass2")
//			.roles("ADMIN");
//	}
//	
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeRequests()
//			.antMatchers("/limits-service/limits").hasRole("ADMIN")
//			.antMatchers("/hello-service/hello").hasAnyRole("USER", "ADMIN")
//			.antMatchers("/").permitAll()
//			.and().formLogin();
//			
//	}
}
