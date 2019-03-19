package com.linlin.shop.controller;

import com.linlin.shop.common.Msg;
import com.linlin.shop.dao.UserDao;
import com.linlin.shop.domain.User;
import com.linlin.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class UserController {

    @Autowired
    private UserDao userdao;

    private User user=new User();


    @RequestMapping("/index")
    public String index(){
        return "redirect:/index.html";
    }

    @RequestMapping("/register")
    public String register(){
        return "redirect:register.html";
    }

    //登录
    @RequestMapping(value="/login")
    public String login(HttpServletRequest request, HttpSession session, @RequestParam(required = false) String username, @RequestParam(required = false) String password){
        User param = new User();
        param.setPassword(password);
        param.setUsername(username);
        User user=userdao.login(param);
        String str="";
        if(user!=null){
            request.getSession().setAttribute("user",username);
            str="redirect:/index.html";
        }else{
            str="redirect:/login.html";
        }

        return str;
    }

    //注册

    /**
     * 接收前端请求的方法，你要声明这个方法的mapping路径是什么
     * 后端返回一般只有两类，一类是字符串形式的返回，一类的直接指向一个页面
     * 一般来说，插入，更新数据用post
     * 查询数据用get
     * 在你的参数中，你必须要指明哪些是你要求前端传入的
     * RequestParam 表明是前端传入的
     * @RequestParam(required = false) 前端传入，但是非必需的
     * @RequestParam("aa")  String username 前端要求传入aa,但是我希望我后端用username这个变量来接收 不指定名字则表示同名
     * @param username
     * @param password
     * @param gender
     * @param phonenumber
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public String Register(@RequestParam  String username,@RequestParam String password,String gender,String phonenumber) {
        //判断该用户名是否已被注册
        User num = userdao.findByUser(username);

        if (num != null && null!=num.getUsername()) {
            return Msg.error().toString();
        } else {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setGender(gender);
            user.setPhonenumber(phonenumber);
            int flag = userdao.register(user);
            //insert操作返回一个主键，主键来判断是否插入成功
            if (flag>0) {
                return Msg.success().toString();
            } else {
                return Msg.error().toString();
            }
        }
    }


}
