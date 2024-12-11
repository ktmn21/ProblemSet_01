package org.example.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {
    @GetMapping("/reverse")
    public String reverse(@RequestParam String input){
        return new StringBuilder(input).reverse().toString();
    }

    @GetMapping("/count-vowels")
    public int countVowels(@RequestParam String input){
        return (int) input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    @GetMapping("/to-upper")
    public String toUpper(@RequestParam String input){
        return input.toUpperCase();
    }
}
