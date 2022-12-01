package com.example.demo.figure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Quadrato extends Rettangolo implements PoligonoRegolare{
	
	//@Bean(name="figura01")
	public Quadrato(double lato) {
		super(lato, lato);
	}

	@Override
	public double perimetro() {
		return super.getBase() * 4;
	}
	

	@Override
	public void draw() {
		System.out.println("Quadrato [lato=" + getBase() + ", perimetro=" + perimetro() + ", area()=" + area() + "]");
	}

}
