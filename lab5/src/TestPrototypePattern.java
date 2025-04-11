import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ajoku
 * @date 12/03/2025
 */
public class TestPrototypePattern {

    public static boolean isSuper(User requester){
        if(requester.getUserName().equals("SUPERUSER")){
            return true;
        }
        return false;
    }

    public static void DisplayUser(User requester){
    }
    public static void main(String[] args) {
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User user = new User("User A", "USER Level", userAccessControl);
        System.out.println(user.getUserName());

        User[] array = new User[3];
        array[0] = user;
        System.out.println("************************************");
        System.out.println(user);
        array[1] = user;

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "USER Level", userAccessControl);
        array[1] = user;
        System.out.println("Changing access control of: " + user.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");

        System.out.println(user);

        System.out.println("************************************");

        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER Level", managerAccessControl);
        System.out.println(user);
        array[2] = user;
        System.out.println("************************************");

        AccessControl superuserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER");
        SuperUser superUser = new SuperUser("SUPERUSER", "SUPERUSER LEVEL", superuserAccessControl);

        System.out.println(superUser);
        System.out.println("************************************");
        isSuper(superUser,array);
    }
    public static void isSuper(SuperUser superUser,User[] array){
        if(superUser.getUserName().equals("SUPERUSER")){
            for(int i = 0; i<array.length; i++){
                System.out.println("IS SUPER USER, PRINTING USERS");
                System.out.println(array[i]);
            }
        }
        else{
            System.out.println("NOT A SUPERUSER");
        }
    }
}
