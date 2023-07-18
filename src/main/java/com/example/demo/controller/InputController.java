package com.example.demo.controller;

import com.example.demo.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InputController {

    @Autowired
    private InputService inputService;

    @GetMapping(value = "/getPrimeNumbers")
    public List<Integer> getPrimeNumbers(){
        List<Integer> outputList=inputService.getPrimeNumbers();
        return outputList;
    }

    @GetMapping(value = "/getValue")
    public List<String> keyDivisbletwo(){
        List<String> outputMap=inputService.keyDivisbletwo();
        return outputMap;
    }

    @GetMapping(value = "/returnMap")
    public Map<Integer,String> getMapValuegreaterthan25(){
        Map<Integer,String> op=inputService.getMapValuegreaterthan25();
        return op;
    }

}
