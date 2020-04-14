package cn.server.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
class HellowWordController1 {
    @RequestMapping
    @ResponseBody
    String exit(){
        return "spring-Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellowWordController1.class,args);
    }
}
