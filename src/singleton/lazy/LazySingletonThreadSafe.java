package singleton.lazy;

public class LazySingletonThreadSafe {

    private static LazySingletonThreadSafe lazySingletonThreadSafe;
    private LazySingletonThreadSafe(){}


    private static synchronized  LazySingletonThreadSafe getInstance(){
        if(lazySingletonThreadSafe == null){
            lazySingletonThreadSafe = new LazySingletonThreadSafe();
        }
        return lazySingletonThreadSafe;
    }
}
