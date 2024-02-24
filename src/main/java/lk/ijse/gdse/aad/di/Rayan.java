package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Rayan {

    @Autowired
    @Qualifier("Long hair")
    @Wow
    GoodGirl goodGirl;

    @PostConstruct
    public void init(){
        goodGirl.kiss();
    }
}
