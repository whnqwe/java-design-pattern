package proxy.staticproxy;

import proxy.Person;
import proxy.Son;

/**
 * 保护目标对象
 * 扩展目标对象
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Father(new Son());
        person.findLove();
    }
}
