package ASS2;

public class FaceIDDecorator extends DeviceDecorator{

    public FaceIDDecorator(IDevice device) {
        super(device);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(", Face ID authentication");
    }
}
