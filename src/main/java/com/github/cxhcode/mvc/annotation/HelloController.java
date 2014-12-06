package com.github.cxhcode.mvc.annotation;

import com.github.cxhcode.model.Book;
import com.github.cxhcode.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jack on 14-12-6.
 */
@Controller
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping("requestParam")
    public String  requestParam(@RequestParam(value = "name", required = true, defaultValue = "hello") String name) {
        System.out.println(name);
        return "hello";
    }

    @RequestMapping(value = "requestBody", consumes = "application/json")
    @ResponseBody
    public User requestBody(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
    @RequestMapping(value = "requestBody1", consumes = "application/json")
    @ResponseBody
    public Book requestBody1(@RequestBody Book book) {
        System.out.println(book);
        return book;
    }

    @RequestMapping(value = "pathVariable/{id}/{name}")
    public String pathVariable(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + name);
        return "hello";
    }

    @RequestMapping("modelAttribute")
    public void modelAttribute(@ModelAttribute User user) {
        System.out.println(user);
    }

}
