package SupportClasses;

public class Player {
    private String name;
    private Account account;

    private int position;

    public Player() {
        setPlayerName("Player one");
        startAccount();
        setPosition(-1);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setPlayerName(String navn) {
        this.name = navn;
    }

    public void startAccount() {
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public String getPlayerName() {
        return name;
    }
}
