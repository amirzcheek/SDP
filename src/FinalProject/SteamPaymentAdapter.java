package FinalProject;

public class SteamPaymentAdapter implements PaymentMethod{
    private SteamPayment steamPayment;

    public SteamPaymentAdapter(SteamPayment steamPayment) {
        this.steamPayment = steamPayment;
    }

    @Override
    public void payment() {
        steamPayment.makePayment();
    }
}
