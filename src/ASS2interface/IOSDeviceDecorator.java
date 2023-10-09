package ASS2interface;

public class IOSDeviceDecorator extends DeviceDecarator{
    public IOSDeviceDecorator(String name, AuthenticationPrincipe authenticationPrincipe) {
        super(name, authenticationPrincipe);
    }

    @Override
    public void authentication() {
        super.authentication();
        System.out.println("IOS Device authentication principe");
    }
}
