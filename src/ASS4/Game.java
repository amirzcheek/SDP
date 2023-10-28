package ASS4;

public class Game {
    public String gameName;
    private final NotificationCenter notificationCenter;

    public Game(String gameName) {
        this.gameName = gameName;
        notificationCenter = new NotificationCenter();
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        getNotificationCenter().notifyObservers(this.gameName + " game name changed to " + gameName);
        this.gameName = gameName;
    }

    public NotificationCenter getNotificationCenter() {
        return notificationCenter;
    }
}
