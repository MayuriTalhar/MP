package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface InputService {

    public boolean checkPrime(int num);

    public List<Integer> getPrimeNumbers();

    public List<String> keyDivisbletwo();

    public Map<Integer,String> getMapValuegreaterthan25();

}
