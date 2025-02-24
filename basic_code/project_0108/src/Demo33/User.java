package Demo33;

public class User {
    private String username;
    private String password;
    private String idnumber;
    private String phonenumber;
    public User() {
    }
    public User(String username, String password, String idnumber, String phonenumber) {
        this.username = username;
        this.password = password;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getIdnumber() {
        return idnumber;
    }
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    
}
