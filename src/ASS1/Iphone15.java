package ASS1;

public class Iphone15 extends Device {
    public Iphone15() {
        super("Iphone 15", new FaceIDAuthentication());
    }

    @Override
    public void showModel() {
        System.out.println("I am Iphone 15");
    }
}
