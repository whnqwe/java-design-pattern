package singleton.staticClass;

public class StaticClassSingleton {
    private StaticClassSingleton(){}

    private static   class StaticClassSingletonHolder {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public  static  final StaticClassSingleton getInstance(){
        return StaticClassSingletonHolder.INSTANCE;
    }
}
