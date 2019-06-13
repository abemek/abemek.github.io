package MockDB;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class MockDb {

    private List<User> users = new ArrayList<>();

    public MockDb(){
        users.add(new User("Abenezer","Mekonnen"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
