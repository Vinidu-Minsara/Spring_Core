package lk.ijse.gdse.aad.di;

import org.springframework.stereotype.Component;

@Component
public class Hiruni implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Hiruni Kisss");
    }
}
