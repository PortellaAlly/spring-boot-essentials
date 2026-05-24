package br.com.portella.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

    /*
    @GetMapping
    public String helloWorld() {
        return "hello world";
    }


    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("bobao games");
    }
    */

    @PostMapping
        public ResponseEntity<String> helloWorld(){
            return new ResponseEntity<>("atumalaca", HttpStatus.CREATED);
    }
}
