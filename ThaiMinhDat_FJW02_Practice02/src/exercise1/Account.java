package exercise1;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Account {
    private String id;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String createDate;
    private String fullName;
    private String locationUser;
    public Account(){

    }
    LocalDateTime current = LocalDateTime.now();
    SimpleDateFormat dateFormat= new SimpleDateFormat();
    public Account(String id, String email, String userName, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName+lastName;
        this.createDate = dateFormat.format(current);
    }

    public Account(String id, String email, String userName, String firstName, String lastName,String createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName+lastName;
        this.createDate = dateFormat.format(current);
    }
}
