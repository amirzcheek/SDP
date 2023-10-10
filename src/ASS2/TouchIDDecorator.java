package ASS2;

public class TouchIDDecorator extends DeviceDecorator{

    public TouchIDDecorator(IDevice device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Touch ID authentication");
    }
}
