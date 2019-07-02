package proxy;

import proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子找对象");
    }

    @Override
    public void f() {
        System.out.println("f");
    }
}
