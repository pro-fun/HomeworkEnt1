package by.academypvt;

import by.academypvt.service.UserService;
import by.academypvt.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.registration("user5", "123", "Igor","Petrov" );
        userService.registration("user6", "222", "Andrey","Semenov" );
        userService.usersInfo();
        userService.deleteClient(2);
        System.out.println("***********************");
        userService.usersInfo();



    }
}