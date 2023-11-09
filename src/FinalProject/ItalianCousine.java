package FinalProject;

public class ItalianCousine implements Cousine{
    @Override
    public void makeFood() {
        System.out.println("Cooking Italian food");
    }

    @Override
    public void giveFood() {
        System.out.println("Giving Italian food");
    }
}
