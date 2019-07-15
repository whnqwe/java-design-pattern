package strategy.pay;

public class UnionPay implements CommonPay {
    @Override
    public void pay(Integer money) {
        System.out.println("使用银联支付：" + money + "元。");
    }
}
