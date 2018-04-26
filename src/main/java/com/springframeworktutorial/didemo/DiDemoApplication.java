package com.springframeworktutorial.didemo;

import com.springframeworktutorial.didemo.controllers.ConstructorInjectedController;
import com.springframeworktutorial.didemo.controllers.MyController;
import com.springframeworktutorial.didemo.controllers.PropertyInjectedController;
import com.springframeworktutorial.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.heyYOU();
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
