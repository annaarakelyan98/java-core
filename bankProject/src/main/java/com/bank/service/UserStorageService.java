package com.bank.service;

import com.bank.model.User;

public interface UserStorageService {
    boolean add(User user);

    User get(String name);

    boolean remove(User user);

    void printAll();
}
