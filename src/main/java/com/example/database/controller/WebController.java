package com.example.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WebController {
    @RequestMapping("/")
    public String login(HttpServletRequest request)
    {
        Cookie[] cookies = request.getCookies();
        boolean flag=false;
        if(cookies!=null)
        {
            for(Cookie cookie:cookies)
            {
                if(cookie.getName().equals("username"))
                {
                    request.getSession().setAttribute("username",cookie.getValue());

                }
                if(cookie.getName().equals("password"))
                {
                    request.getSession().setAttribute("password",cookie.getValue());
                }
                if(cookie.getName().equals("identity"))
                {
                    request.getSession().setAttribute("identity",cookie.getValue());
                    flag=true;
                }
            }
        }
        if(!flag)
            request.getSession().setAttribute("identity","管理员");
        return "page/login";
    }
}
