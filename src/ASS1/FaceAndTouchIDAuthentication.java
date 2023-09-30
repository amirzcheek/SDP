package ASS1;


public class FaceAndTouchIDAuthentication implements AuthenticationPrincipe {
    @Override
    public void authentication() {
        System.out.println("Authentication with both Face and Touch ID");
    }
}
