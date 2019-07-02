package observer;

public class Client {

    public static void main(String[] args) {
        House house = new House(1000D);

        HousePriceObserver housePriceObserverA = new HousePriceObserver("A");
        HousePriceObserver housePriceObserverB = new HousePriceObserver("B");
        HousePriceObserver housePriceObserverC = new HousePriceObserver("C");
        HousePriceObserver housePriceObserverD = new HousePriceObserver("D");

        house.addObserver(housePriceObserverA);
        house.addObserver(housePriceObserverB);
        house.addObserver(housePriceObserverC);
        house.addObserver(housePriceObserverD);

        house.setPrice(60000d);
        house.setPrice(80000d);

    }
}
