import java.util.HashMap;
import java.util.Map;

public class User {

    private String userName;
    private String level;
    private AccessControl accessControl;

    private static Map<String, User> allusers = new HashMap<String, User>();

    public User(String userName, String level, AccessControl accessControl) {
        allusers.put(userName, this);
        this.userName = userName;
        this.level = level;
        this.accessControl = accessControl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "Name: " + userName + ", Level: " + level + ", Access Control Level:" + accessControl.getControlLevel() + ", Access: " + accessControl.getAccess();
    }
}
