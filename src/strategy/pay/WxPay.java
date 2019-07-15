package strategy.pay;

public class WxPay implements CommonPay {
    @Override
    public void pay(Integer money) {
        System.out.println("使用微信支付：" + money + "元。");
    }
}
