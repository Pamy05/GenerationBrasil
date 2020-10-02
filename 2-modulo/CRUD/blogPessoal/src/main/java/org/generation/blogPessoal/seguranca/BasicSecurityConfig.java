package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;  //essa classe esta dentro de WebSecurityConfigurerAdapter
	
	@Override//sobrescrita de metodo
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{ //throws Exception tratativa de erro
		 auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override //sobrescrita de metodo
	protected void configure(HttpSecurity http) throws Exception{ //throws Exception tratativa de erro
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll() //serve para liberar endpoints para que o cliente tenha acesso a eles sem passar por um token
		.antMatchers("/usuarios/cadastrar").permitAll() //serve para liberar endpoints para que o cliente tenha acesso a eles sem passar por um token
		.anyRequest().authenticated() //todas as requisiçoes restantes devem ser autenticadas
		.and().httpBasic() //vamos utilizar o padrão basic para gerar a chave token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)     //sessionManagement() = indica a sessão que vamos utilizar STATELESS = não guarda nenhuma informação na aplicação
	    .and().cors() //habilitar o cors
	    .and().csrf().disable();
	
	}

}
