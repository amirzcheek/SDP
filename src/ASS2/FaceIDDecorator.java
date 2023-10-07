package ASS2;

public class FaceIDDecorator extends DeviceDecorator{
    Device device;

    public FaceIDDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void getInfo() {
        device.getInfo();
        System.out.print("Face ID authentication ");
    }
}
