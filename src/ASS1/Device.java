package ASS1;


public abstract class Device {
    private String name;
    private AuthenticationPrincipe authenticationPrincipe;

    public Device(String name, AuthenticationPrincipe authenticationPrincipe) {
        this.name = name;
        this.authenticationPrincipe = authenticationPrincipe;
    }

    public abstract void showModel();

    public void authenticationMethod(){
        authenticationPrincipe.authentication();
    }

    public void setAuthenticationPrincipe(AuthenticationPrincipe authenticationPrincipe) {
        this.authenticationPrincipe = authenticationPrincipe;
    }


}
