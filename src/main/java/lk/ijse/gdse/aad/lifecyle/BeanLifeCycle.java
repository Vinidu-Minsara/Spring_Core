package lk.ijse.gdse.aad.lifecyle;

import lk.ijse.gdse.aad.di.GoodFood;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanLifeCycle implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {

    @Autowired
    GoodFood goodFood;

    @PostConstruct
    public void init(){
        System.out.println(goodFood.eat());
    }

    public BeanLifeCycle(){
        System.out.println("Constructor");
    }

    public void myMethod01(){
        System.out.println("My Method 01");
    }

    public void myMethod02(){
        System.out.println("My Method 02");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set Bean Factory : "+beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Set Bean Name : "+beanName);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Man yanooo.Byee");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set");
//        System.out.println(goodFood.eat());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context : "+applicationContext);
    }
}
