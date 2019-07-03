package singleton.hungry;

public class HungrySingleton {

    private static HungrySingleton hungrySingleton;

    private HungrySingleton(){}

    public  static  HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
