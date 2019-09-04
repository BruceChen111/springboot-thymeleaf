package net.wanho.controller;

import net.wanho.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {


    @RequestMapping("toHello")
    public String toHello(Map map) {
        map.put("message", "hello java");
        map.put("username", "lisi");

        return "hello";

    }


    @RequestMapping("condition")
    public String condition(Map map) {
        map.put("flag", "no");
        return "hello";
    }


    @RequestMapping("getUsers")
    public String getUsers(Map map) {
        map.put("users", getUsers());
        return "hello";
    }

    @RequestMapping("url")
    @ResponseBody
    public String url() {
        return "hello";
    }



    @RequestMapping("eq")
    public String eq(Map map) {
        map.put("name", "zhangsan");
        map.put("age", 31);
        return "hello";
    }

    @RequestMapping("sw")
    public String sw(Map map) {
        map.put("gender", "w");
        return "hello";
    }



    private List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan", 12));
        list.add(new User("lisi", 20));
        list.add(new User("wangwu", 30));
        return list;
    }




}
