package strategy.pay;

public class StrategyTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.pay(PayType.ALI_PAY, 100);
    }
}
