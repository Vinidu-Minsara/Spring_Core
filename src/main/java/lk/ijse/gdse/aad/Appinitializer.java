package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.configs.AppConfig;
import lk.ijse.gdse.aad.data.DataProcess;
import lk.ijse.gdse.aad.di_methods.Car;
import lk.ijse.gdse.aad.di_methods.Engine;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinitializer {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        var myComponent = ctx.getBean("myComponent");
//        System.out.println(myComponent);
//
//        ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
//        boolean isSingleton  = beanFactory.isSingleton("myComponent");
//        System.out.println(isSingleton);

        //////////// dependency injection //////////////
        ///////constructor////////
//        var car = ctx.getBean(Car.class);
//        System.out.println(car.run());

        ///////setter injection////////
//        var car = ctx.getBean(Car.class);
//        car.setEngine(new Engine());
//        System.out.println(car.run());

        /////// field injection ///////
//        var car = ctx.getBean(Car.class);
//        System.out.println(car.run());

        //////////// aspect oriented programming ////////////
        var dataProcess = ctx.getBean(DataProcess.class);
        dataProcess.dataProcessStarted();
        dataProcess.dataProcessEnded();

        ctx.close();
    }
}
