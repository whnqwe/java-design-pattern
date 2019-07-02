package observer;

import java.util.Observable;

public class House extends Observable {

    private Double price; //房子的价格

    House(Double price){
       this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        setChanged();
        this.notifyObservers(price);
    }
}
