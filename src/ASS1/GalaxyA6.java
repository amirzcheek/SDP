package ASS1;

public class GalaxyA6 extends Device {
    public GalaxyA6() {
        super("Galaxy A6", new TouchIDAuthentication());
    }

    @Override
    public void showModel() {
        System.out.println("I am Galaxy A6");
    }
}
