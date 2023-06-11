package com.example.springbootcalculator.services.Impl;

import com.example.springbootcalculator.services.Function;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements Function {

    @Override
    public double addition(double a, double b) {
        double result = a + b;
        return result;
    }

    @Override
    public double subtraction(double a, double b) {
        double result = a - b;
        return result;
    }

    @Override
    public double multiplication(double a, double b) {
        double result = a * b;
        return result;
    }

    @Override
    public double division(double a, double b) {
        double result = a / b;
        return result;
    }
}