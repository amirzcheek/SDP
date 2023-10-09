package ASS2;

public class DeviceDecorator extends Device{
    Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void getInfo(){
        device.getInfo();
    }
}
