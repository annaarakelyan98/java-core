package com.bank.service;

import com.bank.model.User;

import java.util.List;

public interface UserStorageService {
    boolean add(User user);

    User get(String name);

    boolean remove(User user);

    List<User> printAll();
}
