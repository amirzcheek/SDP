package ASS2;

public class EyeIDDecorator extends DeviceDecorator {
    Device device;

    public EyeIDDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void getInfo() {
        device.getInfo();
        System.out.print("Eye ID authentication ");
    }
}
