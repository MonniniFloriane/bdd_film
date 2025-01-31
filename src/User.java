public class User {
    private int userID       = 0;
    private String userName  = "";
    private boolean userAuth = false;
    private EUserRole userRoles;

    public User(int userID, String userName, Boolean userAuth) {
        this.userID   = userID;
        this.userName = userName;
        this.userAuth = userAuth;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(Boolean userAuth) {
        this.userAuth = userAuth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userAuth='" + userAuth + '\'' +
                ", userRoles=" + userRoles +
                '}';
    }
}