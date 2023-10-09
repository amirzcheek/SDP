package ASS2;

public class FaceIDDecorator extends DeviceDecorator{
    Device device;

    public FaceIDDecorator(Device device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Face ID authentication");
    }
}
