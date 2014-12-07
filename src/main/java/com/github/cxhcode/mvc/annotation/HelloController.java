package com.github.cxhcode.mvc.annotation;

import com.github.cxhcode.model.Book;
import com.github.cxhcode.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

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

    @RequestMapping("responseBody")
    @ResponseBody
    public User responseBody() {
        User user = new User();
        Book book = new Book();
        book.setName("java core");
        book.setId(1);
        book.setPublication(new Date());
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        user.setId(1);
        user.setName("jack");
        user.setPassword("123asd");
        user.setBookList(books);
        return user;
    }

    @RequestMapping("cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String jsessionId) {
        System.out.println(jsessionId);
        return "hello";
    }

    @RequestMapping("requestHeader")
    public String requestHeader(@RequestHeader String accept) {
        System.out.println(accept);
        return "hello";
    }
}
