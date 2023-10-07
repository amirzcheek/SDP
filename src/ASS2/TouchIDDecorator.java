package ASS2;

public class TouchIDDecorator extends DeviceDecorator{
    Device device;

    public TouchIDDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void getInfo() {
        device.getInfo();
        System.out.print("Touch ID authentication ");
    }
}
