package ASS2;


public abstract class Device {
    private String name;

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public abstract void getInfo();



}