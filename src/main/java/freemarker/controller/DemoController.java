package freemarker.controller;

import freemarker.function.SortMethod;
import freemarker.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by 陆英杰
 * 2018/9/13 21:48
 */
@Controller
public class DemoController {

    //添加普通类型
    @RequestMapping("/demo1")
    public ModelAndView index(){
        //new一个ModelAndView
        ModelAndView modelAndView=new ModelAndView("demo1");

        //设置普通类型
        modelAndView.addObject("intVar",100);
        modelAndView.addObject("longVar",1000000L);
        modelAndView.addObject("stringVar","我是字符串");
        modelAndView.addObject("doubleVar","3.24d");
        modelAndView.addObject("booleanVar",true);
        modelAndView.addObject("dateVar",new java.sql.Date(new Date().getTime()));
        modelAndView.addObject("nullVar",null);

        //设置对象
        User user=new User("张三",11);
        user.setDesc("<a href='http://www.baidu.com'>百度</a>");
        modelAndView.addObject("myUser",user);

        //设置List
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("C++");
        modelAndView.addObject("myList",list);

        //设置Map
        Map<String,String> map=new HashMap<>();
        map.put("java","你好java");
        map.put("python","你好python");
        map.put("C++","你好C++");
        modelAndView.addObject("myMap",map);

        return modelAndView;
    }


    //添加自定义函数
    @RequestMapping("/demo2")
    public ModelAndView index2(){
        //new一个ModelAndView
        ModelAndView modelAndView=new ModelAndView("demo2");

        //设置了自定义函数的类(实现了TemplateMethodModelEx接口)
        modelAndView.addObject("sort_init",new SortMethod());

        return modelAndView;
    }
}
