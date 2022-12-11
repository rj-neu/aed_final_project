import data.daoImpl.UserDaoImpl;
import models.Gender;
import models.Role;
import models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.login.LoginNewJPanel;

import java.util.Date;

/**
 * @author rishabh
 */
public class App {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("./resources/Beans.xml");
//
//        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
//
//        userDao.create(new User("Orijit", "12456789", "ori@gmail.com", Gender.MALE, Role.LOGISTIC_MANAGER, new Date()));

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginNewJPanel().setVisible(true);
            }
        });
    }

}
