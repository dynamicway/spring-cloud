package me.study.springcloud.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;
    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/welcome")
    public String welcome() {
        return greetingMessage;
    }

    @PostMapping("/users")
    public void signUp(
            @RequestBody SignUpRequest signUpRequest
    ) {
        userService.signUp(signUpRequest);
    }

}
