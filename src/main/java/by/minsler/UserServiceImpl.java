package by.minsler;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl
    implements UserService {

    private Map<String,User> database;

    public UserServiceImpl(){
        database = new HashMap<String, User>();
    }

    public User createUser(String userName, String firstName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setPassword(password);
        database.put(userName, user);
        return user;
    }

    public User createUser(String userName, String password) {
        return this.createUser(userName, null, password);
    }

    public User findUserByUserName(String userName) {
        return database.get(userName);
    }

    public int getUserCount() {
        return database.size();
    }

}