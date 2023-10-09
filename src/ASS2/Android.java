package ASS2;

public class Android extends Device{

    public Android() {
        this.name = "Android";
    }

    public Android(String name) {
        super(name);
    }

    @Override
    public void getInfo() {
        System.out.print(name);
    }
}
