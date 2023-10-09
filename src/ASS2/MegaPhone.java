package ASS2;

public class MegaPhone extends Device{

    public MegaPhone() {
        this.name = "MEGA Phone";
    }

    public MegaPhone(String name) {
        super(name);
    }

    @Override
    public void getInfo() {
        System.out.print(name);
    }
}
