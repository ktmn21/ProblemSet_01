package org.example.taskmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b){
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, int b){
        if (b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double ) a / b;
    }



}
