package ru.zinoviev.spring.securityrestjwt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class MainContoller {

    //В этот эндпоинт может зайти любой пользователь
    @GetMapping("/unsecured")
    public String unsecuredData() {
        return "Unsecured data";
    }

    //В этот эндпоинт может зайти авторизованный пользователь
    @GetMapping("/secured")
    public String securedData() {
        return "Secured data";
    }

    //В этот эндпоинт может зайти только админ
    @GetMapping("/admin")
    public String adminData() {
        return "Admin data";
    }

    //В этот эндпоинт может конкретный пользователь
    @GetMapping("/info")
    public String userData(Principal principal) {
        return "User data: " + principal.getName();
    }

}
