package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.myConfig;
import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);

        UserServiceImpl userService =
                context.getBean("userServiceImpl", UserServiceImpl.class);

//        userService.createUsersTable();
//
//
//        userService.saveUser("Ali", "Zhumaev", (byte) 21);
//        userService.saveUser("Aika", "Abdrahmanova", (byte) 22);
//        userService.saveUser("Roza", "Asimbaeva", (byte) 22);
//        userService.saveUser("Aijan", "Nurmatova", (byte) 22);
//
        userService.getAllUsers();
//
//
//        userService.removeUserById(1);
//        userService.removeUserById(2);
//        userService.removeUserById(3);
//        userService.removeUserById(4);
//
//
//        userService.cleanUsersTable();
//
//
//        userService.dropUsersTable();
    }
}
