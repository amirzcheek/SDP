package FinalProject;

public class RussianCousine implements Cousine{
    @Override
    public void makeFood() {
        System.out.println("Cooking Russian food");
    }

    @Override
    public void giveFood() {
        System.out.println("Giving Russian food");
    }
}
