/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import data.daoImpl.UserDaoImpl;
import models.Gender;
import models.Role;
import models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author rishabh
 */
public class FoodWasteManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("./resources/Beans.xml");

        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");

        userDao.create(new User("Orijit", "12456789", "ori@gmail.com", Gender.MALE, Role.LOGISTIC_MANAGER, new Date()));
    }

}
