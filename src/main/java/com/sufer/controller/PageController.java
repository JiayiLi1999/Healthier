package com.sufer.controller;

import com.sufer.pojo.User;
import com.sufer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping({"/page-login","/"})
    public String login(){
        return "page-login";
    }

    @RequestMapping("/app-profile")
    public String appProfile(){
        return "app-profile";
    }

    @RequestMapping("/new_prescription")
    public String newPrescription(){
        return "new_prescription";
    }

    @RequestMapping("/new_record")
    public String newRecord(){
        return "new_record";
    }

    @RequestMapping("/login")
    public String pageLogin(@RequestParam("user-email")String userEmail,
                            @RequestParam("password")String password,
                            HttpSession session,
                            Model model){
        User user = userService.selectPasswordByEmail(userEmail, password);
        if ( user != null){
            //登录成功！
            session.setAttribute("username",user.getUserName());
            //session.setAttribute("userEmail",user.getUserEmail());
            System.out.println(123);
            //登录成功！防止表单重复提交，我们重定向
            return "redirect:/index";
        }else {
            //登录失败！存放错误信息
            System.out.println(456);
            model.addAttribute("msg","用户名或密码错误");
            return "page-login";
        }
    }

    @RequestMapping("/register")
    public String register(@RequestParam("user-email")String userEmail,
                               @RequestParam("user-pwd")String password,
                               @RequestParam("user-name")String userName,
                               HttpSession session,
                               Model model, HttpServletResponse response) throws IOException {
        User user = new User(0,userName,password,userEmail,false);
        System.out.println(user);
        int s = userService.addUser(user);
        System.out.println("s = " + s);
        model.addAttribute("msg","注册成功!");
        return "page-register";
    }

    @RequestMapping("/page-register")
    public String pageRegister(){
        return "page-register";
    }


    @RequestMapping("/page-reset-password")
    public String pageResetPassword(){
        return "page-reset-password";
    }

    @RequestMapping("/search_personalInfo")
    public String searchPersonalInfo(Model model){
        return "search_personalInfo";
    }

    @RequestMapping("/search_prescription")
    public String searchPrescription(){
        return "search_prescription";
    }

    @RequestMapping("/search_record")
    public String searchRecord(){
        return "search_record";
    }

    @RequestMapping("/search_medicine")
    public String searchMedicine(){
        return "search_medicine";
    }
}
