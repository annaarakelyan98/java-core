package com.bank.service;

import com.bank.model.User;
import com.bank.storage.UserStorage;

import java.util.List;

public class UserStorageServiceImpl implements UserStorageService {
    UserStorage userStorage;

    public UserStorageServiceImpl(UserStorage userStorage1) {
        this.userStorage = userStorage1;
    }

    boolean validateUserUniqueness(User user) {
        for (User u : userStorage.getStorage()) {
            if (user.getUsername().equals(u.getUsername())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean add(User user) {
        boolean isValid = validateUserUniqueness(user);
        if (isValid) {
            userStorage.getStorage().add(user);
            System.out.println("Added user: " + user.getName());
        } else System.out.println("User is already added");
        return isValid;
    }

    @Override
    public User get(String name) {
        for (User u : userStorage.getStorage()) {
            if (u.getUsername().equals(name)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean remove(User user) {
        return userStorage.getStorage().remove(user);
    }

    @Override
    public List<User> printAll() {
        for (User user : userStorage.getStorage()) {
            System.out.println(user);
        }
        return null;
    }
}
