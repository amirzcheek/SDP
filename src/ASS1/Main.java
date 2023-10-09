package ASS1;


public class Main {
    public static void main(String[] args) {
        Device galaxyA5 = new GalaxyA5();
        Device s22 = new S22();

        s22.showModel();

        galaxyA5.authenticationMethod();

        s22.authenticationMethod();


    }
}