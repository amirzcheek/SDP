package ASS4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game dota2 = new Game("dota 2");
        Game cs2 = new Game("cs 2");

        IObserver user1 = new UserObserver("Miposhka");
        IObserver user2 = new UserObserver("YatoroGOD");
        IObserver user3 = new UserObserver("Colapse");
        IObserver user4 = new UserObserver("Larl");
        IObserver user5 = new UserObserver("Mira");

        List<IObserver> iObservers = new ArrayList<>();
        iObservers.add(user5);
        iObservers.add(user4);
        iObservers.add(user3);
        iObservers.add(user2);
        iObservers.add(user1);

        for (IObserver iObserver : iObservers) {
            dota2.getNotificationCenter().addObserver(iObserver);
        }

        dota2.getNotificationCenter().notifyObservers("new Hero in " + dota2.getGameName());
        System.out.println("\n------------------------------------\n");
        dota2.getNotificationCenter().removeObserver(user4);
        IObserver user6 = new UserObserver("Nisha");
        dota2.getNotificationCenter().addObserver(user6);
        System.out.println(dota2.getNotificationCenter().getiObservers());

        System.out.println("\n-----------------------------------------------\n");

        IObserver userCs1 = new UserObserver("S1mple");
        IObserver userCs2 = new UserObserver("Perfecto");
        IObserver userCs3 = new UserObserver("M0nesy");
        IObserver userCs4 = new UserObserver("Zeus");
        IObserver userCs5 = new UserObserver("Fantastic");

        List<IObserver> iObserversCs = new ArrayList<>();
        iObserversCs.add(userCs5);
        iObserversCs.add(userCs4);
        iObserversCs.add(userCs3);
        iObserversCs.add(userCs2);
        iObserversCs.add(userCs1);

        for (IObserver iObserver : iObserversCs) {
            cs2.getNotificationCenter().addObserver(iObserver);
        }
        cs2.getNotificationCenter().notifyObservers("G2 won the MAJOR");
    }
}
