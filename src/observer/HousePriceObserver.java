package observer;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {

     private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }



    @Override
    public void update(Observable o, Object arg) {
        System.out.println("购房人"+name+" 收到房子报价 "+arg);
    }
}
