package lk.ijse.gdse.aad.components;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE) //Change scope to singleton to prototype
public class MyComponent {

    MyComponent(){
        System.out.println("My Component");
    }
}
