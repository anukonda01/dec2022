package com.example.dec2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class Calculator {

    @GetMapping("/add/{first}/{second}")
    public double add(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber) {
        return firstNumber + secondNumber;
    }

    @GetMapping("/subtract/{first}/{second}")
    public double subtract(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber) {
        return firstNumber - secondNumber;
    }

    @GetMapping("/multiply/{first}/{second}")
    public double multiply(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber) {
        return firstNumber * secondNumber;
    }

    @GetMapping("/divide/{first}/{second}")
    public double divide(@PathVariable("first") double firstNumber, @PathVariable("second") double secondNumber) {
        return firstNumber / secondNumber;
    }

}
