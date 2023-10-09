package ASS2interface;

public class Main {
    public static void main(String[] args) {
        AuthenticationPrincipe faceID = new FaceIDAuthentication();
        AuthenticationPrincipe touchID = new TouchIDAuthentication();
        AuthenticationPrincipe hairID = new HairIDAuthentication();

        AuthenticationPrincipe iosDevice = new IOSDeviceDecorator("Iphone 13", faceID);
        AuthenticationPrincipe androidDevice = new AndroidDeviceDecorator("Samsing Galaxy S20", new TouchIDAuthentication());

    }
}
