package proxy.staticproxy;

import proxy.Person;

public class Father implements Person {

    Person person;

    Father(Person person){
       this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("帮助儿子找对象");
        person.findLove();
    }

    @Override
    public void f() {

    }
}
