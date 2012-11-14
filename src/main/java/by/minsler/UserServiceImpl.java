package by.minsler;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl
    implements UserService {

    static private Map<String,User> database = new HashMap<String, User>();

    public UserServiceImpl(){
    }

    public User createUser(String userName, String firstName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setPassword(password);
        database.put(userName, user);
        System.out.println(user);
        return user;
    }

    public User createUser(String userName, String password) {
        User user = this.createUser(userName, null, password);
        System.out.println(user);
        return  user;

    }

    public User findUserByUserName(String userName) {
        User user = database.get(userName);
        System.out.println("found " + user);
        return user;
    }

    public int getUserCount() {
        return database.size();
    }

}