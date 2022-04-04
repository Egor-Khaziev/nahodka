package com.egorkhaziev.nahodka.controllers;

import com.egorkhaziev.nahodka.services.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @PostMapping("/test")
    public List<Integer> test (@RequestBody String request){
        return myService.multiplicationTable(request);
    }

}
