package me.suyong.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.suyong.springbootdeveloper.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService {

    private final UserRepository userRepository;
    
}
