package ASS2interface;

public abstract class DeviceDecarator implements AuthenticationPrincipe{
    private String name;
    private AuthenticationPrincipe authenticationPrincipe;

    public DeviceDecarator(String name, AuthenticationPrincipe authenticationPrincipe) {
        this.name = name;
        this.authenticationPrincipe = authenticationPrincipe;
    }

    @Override
    public void authentication() {
        authenticationPrincipe.authentication();
    }
}
