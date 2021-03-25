package com.bank.operation;

import com.bank.model.User;

import java.util.List;
import java.util.Scanner;

public interface UserOperation {
    default void exit() {
        System.out.println("Operation EXIT completed successfully");
    }

    void get(Scanner scanner);

    boolean add(Scanner scanner);

    List<User> getAll();

    boolean remove(Scanner scanner);

    User update(Scanner scanner);
}
