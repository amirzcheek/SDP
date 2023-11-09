package FinalProject;

public class QiwiAdapter implements PaymentMethod{
    private QiwiPayment qiwiPayment;

    public QiwiAdapter(QiwiPayment qiwiPayment) {
        this.qiwiPayment = qiwiPayment;
    }

    @Override
    public void payment() {
        qiwiPayment.makePayment();
    }
}
