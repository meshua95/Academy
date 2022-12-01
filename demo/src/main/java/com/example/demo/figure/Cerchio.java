package com.example.demo.figure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cerchio implements Figura {
	
	private double raggio;
	
	@Bean(name="figura02")
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double circonferenza() {
		return 2*raggio*Math.PI;
	}
	
	public double area() {
		return Math.pow(raggio, 2)*Math.PI;
	}


	@Override
	public void draw() {
		System.out.println("Cerchio [raggio=" + raggio + ", area()=" + area() + "]");
	}

}
