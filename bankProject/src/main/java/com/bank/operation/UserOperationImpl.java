package com.bank.operation;

import com.bank.model.User;
import com.bank.service.UserStorageService;
import lombok.Data;

import java.util.List;
import java.util.Scanner;

@Data
public class UserOperationImpl implements UserOperation {

    UserStorageService userStorageService;

    public UserOperationImpl(UserStorageService userStorageService) {
        this.userStorageService = userStorageService;
    }

    @Override
    public void get(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = userStorageService.get(username);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Username not found!");
        }
    }

    @Override
    public boolean add(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name, username);
        boolean isAdd = userStorageService.add(user);
        if (isAdd) {
            System.out.println("User added completely");
        }
        return true;
    }

    @Override
    public List<User> getAll() {
        System.out.println("All users");
        List<User> users = userStorageService.printAll();
        return users;
    }

    @Override
    public boolean remove(Scanner scanner) {
        System.out.print("Enter username: ");
        User user = userStorageService.get(scanner.nextLine());
        if (user != null) {
            userStorageService.remove(user);
            System.out.println("User removed");
        } else {
            System.out.println("Username not found!");
        }
        return true;
    }

    @Override
    public User update(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        String name;
        User user = userStorageService.get(username);
        if (user != null) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            user.setName(name);
            user = userStorageService.get(user.getUsername());
        } else {
            System.out.println("Username not found!");
        }
        return user;
    }
}
