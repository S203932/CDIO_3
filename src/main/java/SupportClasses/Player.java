package SupportClasses;

public class Player {
    private String name;
    private Account account;


    public Player() {
        setPlayerName("Player one");
        startAccount();
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
