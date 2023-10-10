package ASS2;

public class DeviceDecorator implements IDevice{
    Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void getInfo(){
        device.getInfo();
    }


}
