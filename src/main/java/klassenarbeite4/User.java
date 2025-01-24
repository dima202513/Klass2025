package klassenarbeite4;

public class User {
    private String login;
    private String password;
    private Bascet bascet;

    public User(String login, String password, Bascet bascet) {
        this.login = login;
        this.password = password;
        this.bascet = bascet;
    }




    public Bascet getBascet() {
        return bascet;
    }
}


