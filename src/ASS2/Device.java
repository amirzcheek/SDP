package ASS2;


public abstract class Device {

    protected String name;

    public Device() {
        this.name = "Device";
    }

    public Device(String name) {
        this.name = name;
    }

    public abstract void getInfo();

}