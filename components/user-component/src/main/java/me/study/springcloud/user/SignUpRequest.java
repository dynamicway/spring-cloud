package me.study.springcloud.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SignUpRequest {
    private String email;
    private String name;
    private String password;
}
