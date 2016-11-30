package com.caroline.exe.action;

import com.caroline.exe.manager.IUserManager;
import com.caroline.exe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午6:09
 */
@Controller
public class MainController {

    @Autowired
    private IUserManager userManagerImpl;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String view(Model model) {
        User user = userManagerImpl.getUserById(1);
        model.addAttribute(user);//TODO:model.addAttribute
        return "user";
    }

    @RequestMapping(value = "/main/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") int id) {
        return userManagerImpl.getUserById(id);
    }

}
