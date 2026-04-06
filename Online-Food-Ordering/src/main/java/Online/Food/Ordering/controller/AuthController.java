package Online.Food.Ordering.controller;

import Online.Food.Ordering.Repository.UserRepository;
import Online.Food.Ordering.config.JwtProvider;
import Online.Food.Ordering.service.CustomerUserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private JwtProvider jwtProvider;
    private CustomerUserDetailsService;



}
