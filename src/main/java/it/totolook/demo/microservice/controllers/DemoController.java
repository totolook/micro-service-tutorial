package it.totolook.demo.microservice.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.totolook.demo.microservice.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * DemoController
 */
@Component
@RestController
@Slf4j
public class DemoController {

    @GetMapping("/")
    public UserDTO getUser() {
        log.info("incoming call!");
        return UserDTO.builder().name("Toto").surname("Look").email("totolook@totolook.it").age("25").build();
    }

}