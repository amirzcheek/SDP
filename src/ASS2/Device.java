package ASS2;


public class Device implements IDevice {

    protected String name;

    public Device() {
        this.name = "Device";
    }

    public Device(String name) {
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.println("Device");
    }
}