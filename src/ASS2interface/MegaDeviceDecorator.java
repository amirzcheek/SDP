package ASS2interface;

public class MegaDeviceDecorator extends DeviceDecarator{
    public MegaDeviceDecorator(String name, AuthenticationPrincipe authenticationPrincipe) {
        super(name, authenticationPrincipe);
    }

    @Override
    public void authentication() {
        super.authentication();
        System.out.println("Mega Device authentication principe");
    }
}
