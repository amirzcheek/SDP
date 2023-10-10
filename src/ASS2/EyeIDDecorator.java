package ASS2;

public class EyeIDDecorator extends DeviceDecorator {

    public EyeIDDecorator(IDevice device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Eye ID authentication ");
    }
}
