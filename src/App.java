import data.daoImpl.UserDaoImpl;
import models.Gender;
import models.Role;
import models.User;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.login.LoginNewJPanel;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
//        searchPlace("linwood");
    }


//    public static List<String> searchPlace(String query) {
//        List<String> place = new ArrayList<>();
//        try {
//            StringBuilder result = new StringBuilder();
//
//            URL url = new URL("https://api.geoapify.com/v1/geocode/autocomplete?text=" + query + "&apiKey=17c8ca70b691459093932067b452a5f5");
//            HttpURLConnection http = (HttpURLConnection) url.openConnection();
//            http.setRequestProperty("Accept", "application/json");
//            InputStream in = new BufferedInputStream(http.getInputStream());
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                result.append(line);
//            }
//
//            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
//
//            JSONObject res = new JSONObject(result.toString());
//
//            JSONArray jsonArray = new JSONArray(res.getJSONArray("features"));
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject ele = jsonArray.getJSONObject(i);
//                place.add(ele.getJSONObject("properties").getString("address_line1"));
//            }
//            http.disconnect();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return place;
//    }
}
