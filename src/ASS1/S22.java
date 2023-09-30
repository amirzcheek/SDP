package ASS1;


public class S22 extends Device {
    public S22() {
        super("S 22", new FaceAndTouchIDAuthentication());
    }

    @Override
    public void showModel() {
        System.out.println("I am ASS1.S22");
    }
}
