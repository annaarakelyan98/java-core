package com.bank;

import com.bank.model.User;
import com.bank.operation.OperationType;
import com.bank.operation.UserOperation;
import com.bank.operation.UserOperationImpl;
import com.bank.service.UserStorageService;
import com.bank.service.UserStorageServiceImpl;
import com.bank.storage.UserStorage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new UserStorage();

        UserStorageService userStorageService = new UserStorageServiceImpl(userStorage);
        UserOperation operation = new UserOperationImpl(userStorageService);

        userStorageService.add(new User("Arman", "arm1"));
        userStorageService.add(new User("Arman", "arm2"));
        userStorageService.add(new User("Arthur", "art1"));

        Scanner scanner = new Scanner(System.in);
        OperationType operationType = null;
        do {
            System.out.println("Enter operation from list: " + Arrays.toString(OperationType.values()));
            String operationName = scanner.nextLine();
            operationType = OperationType.findOperation(operationName);
            if (operationType == null) {
                System.out.println("Unknown operation type");
                continue;
            }
            switch (operationType){
                case GET:
                    operation.get(scanner);
                    break;
                case EXIT:
                    operation.exit();
                    break;
                case ADD:
                    operation.add(scanner);
                    break;
                case GET_ALL:
                    operation.getAll();
                    break;
                case REMOVE:
                    operation.remove(scanner);
                    break;
                case UPDATE:
                    operation.update(scanner);
                    break;
            }
        } while (operationType != OperationType.EXIT);
    }
}
