package com.bank;

import com.bank.model.User;
import com.bank.service.UserStorageInterfaceImpl;
import com.bank.service.UserStorageService;
import com.bank.storage.UserStorage;

public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new UserStorage();

        UserStorageService userStorageService = new UserStorageInterfaceImpl(userStorage);

        userStorageService.add(new User("Arman", "arm1"));
        userStorageService.add(new User("Arman", "arm2"));
        userStorageService.add(new User("Arthur", "art1"));

        User user = userStorageService.get("arm1");
        System.out.println(user.getName());

        System.out.println(userStorageService.remove(user));

        userStorageService.printAll();
    }
}
