package com.github.cxhcode.mvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jack on 14-12-6.
 */
@Controller
@RequestMapping(
        value = {"request"},
        method = {RequestMethod.GET, RequestMethod.POST},
        params = {"create","!add"},
        consumes = {"application/*"},
        produces = {"text/*"}
)
public class RequestMappingController {
    @RequestMapping("mapping")
    public String mapping(String create) {
        System.out.println(create);
        return "hello";
    }
}
