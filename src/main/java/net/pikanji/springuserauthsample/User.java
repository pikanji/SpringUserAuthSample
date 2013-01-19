package net.pikanji.springuserauthsample;

public class User {
    // Basic Details
    private int userId;
    private String userName;
    private String password;

    // Login Details
    private int enabled = 1;
    private String userAuthority = "ROLE_USER";

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getEnabled() {
        return enabled;
    }
    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
    public String getUserAuthority() {
        return userAuthority;
    }
    public void setUserAuthority(String userAuthority) {
        this.userAuthority = userAuthority;
    }
}
