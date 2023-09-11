package org.example;

import org.example.User;

public class Mocking {
    User user;

    public void setUser(User user) {
        this.user = user;
    }

    public int assignPermission() {
        if(user.getRole().equals(("admin"))) {
            String username = user.getUsername();
            System.out.println("Assign special permission");
            return 1;
        } else {
            System.out.println("Cannot assign permission");
            return -1;
        }
    }
}
