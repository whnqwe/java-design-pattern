package proxy.dynamicproxy;

import proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeiBo implements InvocationHandler {

    private Person person;
    public  Object getInstance(Person person){
         this.person = person;
         Class clazz = person.getClass();
         return  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(person,args);
    }
}
