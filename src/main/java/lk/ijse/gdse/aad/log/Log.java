package lk.ijse.gdse.aad.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Log {

    @Before("execution(public void dataProcessStarted())")
    public void starting(){
        System.out.println("LOG - data process started");
    }

    @After("execution(public void dataProcessEnded())")
    public void ending(){
        System.out.println("LOG - data process ending");
    }
}
