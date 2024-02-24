package lk.ijse.gdse.aad.di;

import lk.ijse.gdse.aad.di.GoodFood;
import org.springframework.stereotype.Component;

@Component
public class MyFood implements GoodFood {
    @Override
    public String eat() {
        return "Eat rice.";
    }
}
