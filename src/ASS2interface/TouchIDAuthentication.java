package ASS2interface;

public class TouchIDAuthentication implements AuthenticationPrincipe{
    @Override
    public void authentication() {
        System.out.println("Authentication with Touch ID ");
    }
}
