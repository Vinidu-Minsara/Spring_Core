package lk.ijse.gdse.aad.data;

import org.springframework.stereotype.Component;

@Component
public class DataProcess {

    public void dataProcessStarted(){
        System.out.println("Started");
    }
  
    public void dataProcessEnded(){
        System.out.println("Ended");
    }
}
