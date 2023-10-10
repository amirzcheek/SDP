package ASS2;

public class DeviceDecorator implements IDevice{
    IDevice device;

    public DeviceDecorator(IDevice device) {
        this.device = device;
    }

    @Override
    public void getInfo(){
        device.getInfo();
    }


}
