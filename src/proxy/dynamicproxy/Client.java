package proxy.dynamicproxy;

import proxy.Person;
import proxy.Son;

public class Client {

    public static void main(String[] args) {
        Person person  = (Person) new MeiBo().getInstance(new Son());

        person.findLove();
    }
}
