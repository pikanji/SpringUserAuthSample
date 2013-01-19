package net.pikanji.springuserauthsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@RequestMapping("/signup")
@SessionAttributes("user")
@Controller
public class SignUpFormController {

    private static final String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/db_name?useUnicode=true&characterEncoding=UTF-8";
    private static final String DB_USER = "db_user";
    private static final String DB_PSWD = "db_password";

    private static final Logger logger = LoggerFactory
            .getLogger(SignUpFormController.class);

    /**
     * This is called when the signup page is loaded.
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showform(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    /**
     * This is called when submit button of the form is pressed and the page is reloaded.
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submitform(@ModelAttribute("user") User user, BindingResult result, Model model) {

        try {
            Class.forName(DB_DRIVER_NAME); // Load driver
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PSWD);
            Statement state = con.createStatement();

            StandardPasswordEncoder encoder = new StandardPasswordEncoder();
            String encodedPass = encoder.encode(user.getPassword());

            String sql = "INSERT INTO `users` (`user_name`, `password`, `enabled`) VALUES ('" +
                    user.getUserName() + "', '" +
                    encodedPass + "', '" +
                    1 + "')";
            state.execute(sql);
            con.close();
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage());
        } catch (SQLException e) {
            logger.error(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        model.addAttribute("username", user.getUserName());
        model.addAttribute("password", user.getPassword());

        return "success";
    }
}
