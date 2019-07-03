package singleton.lazy;

public class LazySingletonThreadUnsafe {
    private static LazySingletonThreadUnsafe instance;
    private LazySingletonThreadUnsafe(){}

    public static LazySingletonThreadUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonThreadUnsafe();
        }
        return instance;
    }
}
