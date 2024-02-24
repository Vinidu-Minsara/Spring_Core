package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long hair")
public class Vibhasha implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Vibhasha kiss");
    }
}
