package strategy.pay;

public class Customer {

    public void pay(PayType payType, Integer money){
        payType.get().pay(money);
    }
}
