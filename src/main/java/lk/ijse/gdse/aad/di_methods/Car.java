package lk.ijse.gdse.aad.di_methods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    /////////// constructor injection ////////////

//    private Engine engine;
//
//    Car(Engine engine){
//        this.engine = engine;
//    }
//

    ////////// setter injection //////////

//    @Autowired
//    private Engine engine;
//
//    public void setEngine(Engine engine){
//        this.engine = engine;
//    }

    ///////// field injection ///////////
    @Autowired
    private Engine engine;

    public String run(){
        return engine.run();
    }
}
