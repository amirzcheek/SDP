package ASS1;


public class GalaxyA5 extends Device {
    public GalaxyA5() {
        super("Galaxy A5", new TouchIDAuthentication());
    }

    @Override
    public void showModel() {
        System.out.println("I am Galaxy A5");
    }
}
