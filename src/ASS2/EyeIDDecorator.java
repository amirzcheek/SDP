package ASS2;

public class EyeIDDecorator extends DeviceDecorator {

    public EyeIDDecorator(Device device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Eye ID authentication ");
    }
}
