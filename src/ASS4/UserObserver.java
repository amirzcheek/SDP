package ASS4;

public class UserObserver implements IObserver{
    private String userName;


    public UserObserver(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String update) {
        System.out.println(userName + " received update about " + '"' + update + '"');
    }

    @Override
    public String toString() {
        return userName + '\'';
    }
}
