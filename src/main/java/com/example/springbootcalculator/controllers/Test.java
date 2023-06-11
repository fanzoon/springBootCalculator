package com.example.springbootcalculator.controllers;

import com.example.springbootcalculator.services.Impl.CalculateServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {
    private final CalculateServiceImpl calculateService;

    public Test(CalculateServiceImpl calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/")
    public String form() {
        return "calculate";
    }

    @PostMapping("/calculate")
    public String Calculate (@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("method") String method, Model model) {

        double result;
        switch (method) {
            case "addition":
                result = calculateService.addition(a, b);
                break;
            case "subtraction":
                result = calculateService.subtraction(a, b);
                break;
            case "multiplication":
                result = calculateService.multiplication(a, b);
                break;
            case "division":
                result = calculateService.division(a, b);
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);
        return "calculate";
    }
}