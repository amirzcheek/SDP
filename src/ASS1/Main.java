package ASS1;


public class Main {
    public static void main(String[] args) {
        Device iphone15 = new Iphone15();
        Device galaxyA5 = new GalaxyA5();
        Device s22 = new S22();

        iphone15.showModel();

        galaxyA5.authenticationMethod();

        s22.authenticationMethod();


    }
}