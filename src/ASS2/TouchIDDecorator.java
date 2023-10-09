package ASS2;

public class TouchIDDecorator extends DeviceDecorator{
    Device device;

    public TouchIDDecorator(Device device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Touch ID authentication");
    }
}
