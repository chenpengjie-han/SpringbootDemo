package project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HellowWordController {
    @RequestMapping
    @ResponseBody
    String exit(){
        return "spring-Boot111";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellowWordController.class,args);
    }
}
