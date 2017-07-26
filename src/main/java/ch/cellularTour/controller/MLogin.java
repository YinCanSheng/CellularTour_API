package ch.cellularTour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 今夜犬吠 on 2017/7/17.
 * 登录
 */
@Controller
@RequestMapping(value = "/Account")
public class MLogin {

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String mLogin(String name, String passWord) {
        if (name != null && passWord != null) {
            if (name.equals("今夜犬吠") && passWord.equals("123456")) {
                return "redirect:/main.jsp";
            }
        }
        //return "redirect:/main.jsp";
        return "index";
    }
}
