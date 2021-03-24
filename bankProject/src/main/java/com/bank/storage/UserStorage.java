package com.bank.storage;

import com.bank.model.User;
import com.bank.service.UserStorageService;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class UserStorage{
    @Getter
    private List<User> storage;

    public UserStorage() {
        storage = new ArrayList<>();
    }
}
