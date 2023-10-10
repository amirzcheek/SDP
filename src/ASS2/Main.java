package ASS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Device GalaxyS22 = new Android();
        IDevice galaxy = new FaceIDDecorator(GalaxyS22);
        IDevice megaPhone = new EyeIDDecorator(new TouchIDDecorator(new FaceIDDecorator(new MegaPhone())));



        Device megaPhone2 = new MegaPhone("Phone3000");

        galaxy.getInfo();
        System.out.println();
        megaPhone2.getInfo();

        System.out.println("\n\n\n");

        megaPhone.getInfo();

        System.out.println();
        if (megaPhone instanceof EyeIDDecorator){
            System.out.println("Do you want to remove EyeID from this device? \n 1 -> yes \n 2 -> no");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println(megaPhone);
                System.out.println(((EyeIDDecorator) megaPhone));
                megaPhone = ((EyeIDDecorator) megaPhone);
            }
        }
        megaPhone.getInfo();
    }
}
