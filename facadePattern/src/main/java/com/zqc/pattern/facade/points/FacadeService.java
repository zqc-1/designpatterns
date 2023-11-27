package com.zqc.pattern.facade.points;

public class FacadeService {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void exchange(Info info) {
        if (qualifyService.isAvailable(info)) {
            if (paymentService.pay(info)) {
                String shippingNo = shippingService.delivery(info);
                System.out.println("下单成功，物流单号是: " + shippingNo);
            }
        }
    }
}
