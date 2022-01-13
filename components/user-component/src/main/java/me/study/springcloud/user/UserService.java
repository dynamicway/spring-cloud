package me.study.springcloud.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signUp(SignUpRequest signUpRequest) {
        userRepository.save(signUpRequest.getUserEntity());
    }

}
