package me.study.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserApi {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/welcome")
    public String welcome() {
        return greetingMessage;
    }

}
