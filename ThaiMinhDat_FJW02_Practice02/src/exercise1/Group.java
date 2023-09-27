package exercise1;

public class Group {
    public Group(){

    }
    private String croupName;
    private String creator;
    private Account[] accounts;
    private String createDate;
    private String[] userName;

    public Group(String croupName, String creator, Account[] accounts, String createDate) {
        this.croupName = croupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String croupName, String creator,  String createDate, String[] userName) {
        this.croupName = croupName;
        this.creator = creator;
        this.createDate = createDate;
        this.userName = userName;
    }
}
