package com.example.demo.springcomponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.figure.Figura;
import com.example.demo.figure.Quadrato;

@Configuration
public class Beans {

	//se non metto niente in name è il nome del metodo
	@Scope(scopeName="singleton")
	@Bean(name="figura001")		//, initMethod="init", destroyMethod="destroy"
	public Figura getFigura01() {
		return new Quadrato(4);
	}
}
