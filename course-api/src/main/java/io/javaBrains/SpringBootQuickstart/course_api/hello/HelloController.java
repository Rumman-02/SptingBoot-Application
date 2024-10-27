package io.javaBrains.SpringBootQuickstart.course_api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //It is the controller
public class HelloController { //Methods, in the class and mapped to URL Request

    @RequestMapping("/hello") // a parameter(URL) it will map to, SO it execute sayHi();
    public String sayHi(){
        return "Hello from no where";
    }
}
