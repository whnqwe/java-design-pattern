package strategy.pay;

public enum PayType {
    ALI_PAY(new AliPay()),

    WX_PAY(new WxPay()),

    UNION_PAY(new UnionPay());

    // 每一个枚举实例都会拥有自己的commonPay
    private CommonPay commonPay;

    PayType(CommonPay commonPay) {
        this.commonPay = commonPay;
    }

    public CommonPay get() {
        return this.commonPay;
    }
}
