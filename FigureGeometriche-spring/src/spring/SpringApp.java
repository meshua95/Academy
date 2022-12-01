package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import figure.Cerchio;
import figure.Quadrato;

public class SpringApp {

	public static void main( String[] args )  {

		ClassPathXmlApplicationContext context;

		context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();

		Quadrato f1 = (Quadrato) context.getBean("figura01"); 
		System.out.println( "Prima Figura con Spring: " + f1);
		System.out.println( "Area: " + f1.area());
		
		Cerchio f2 = (Cerchio) context.getBean("figura02"); 
		System.out.println( "Cerchio con Spring: " + f2);
		System.out.println( "Area: " + f2.area());

		
	}
}