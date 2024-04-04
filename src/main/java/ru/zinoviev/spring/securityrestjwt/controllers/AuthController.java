package ru.zinoviev.spring.securityrestjwt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.zinoviev.spring.securityrestjwt.dtos.JwtRequest;
import ru.zinoviev.spring.securityrestjwt.service.UserService;
import ru.zinoviev.spring.securityrestjwt.utils.JwtTokenUtils;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final JwtTokenUtils jwtTokenUtils;

    @PostMapping
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {

    }

    }

}
