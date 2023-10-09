package ASS2interface;

public class AndroidDeviceDecorator extends DeviceDecarator{
    public AndroidDeviceDecorator(String name, AuthenticationPrincipe authenticationPrincipe) {
        super(name, authenticationPrincipe);
    }

    @Override
    public void authentication() {
        super.authentication();
        System.out.println("Android Device authentication principe");
    }
}
