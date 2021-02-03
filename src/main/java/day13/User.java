package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;

    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);

    }

    public boolean isSubscribed(User user) {

        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        for (User user1 : subscriptions) {
            if (user1 == user) {
                for (User friend : user.getSubscriptions()) {
                    if (friend == this)
                        return true;
                }
            }
        }
        return false;

    }

    public void sendMessage(User user, String text) {

    }

    @Override
    public String toString() {
        return username;
    }
}

