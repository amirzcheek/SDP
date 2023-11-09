package FinalProject;

public class CousineFactory {
    public Cousine createDish(String cousineType){
        Cousine cousine = null;
        switch (cousineType){
            case "Kazakh" -> cousine = new KazakhCousine();
            case "Russian" -> cousine = new RussianCousine();
            case "Italian" -> cousine = new ItalianCousine();
        }
        return cousine;
    }
}
