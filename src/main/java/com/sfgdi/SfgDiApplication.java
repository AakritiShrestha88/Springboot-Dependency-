package com.sfgdi;

import com.sfgdi.controller.ControllerInjectedController;
import com.sfgdi.controller.MyController;
import com.sfgdi.controller.PropertyInjectedController;
import com.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println("----------Primary Bean");
		System.out.println(myController.syHello());
		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController )ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController =(SetterInjectedController )ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------Controller");
		ControllerInjectedController controllerInjectedController =(ControllerInjectedController )ctx.getBean("controllerInjectedController");
		System.out.println(controllerInjectedController.getGreeting());
	}

}
