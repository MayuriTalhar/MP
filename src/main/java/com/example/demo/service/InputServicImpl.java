package com.example.demo.service;

import com.example.demo.repository.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InputServicImpl implements InputService {

    private InputRepository inputRepository;

    @Autowired
    public InputServicImpl(InputRepository inputRepository) {
        this.inputRepository=inputRepository;
    }


    @Override
    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Integer> getPrimeNumbers() {
        List<Integer> inputList = inputRepository.getInput();
        List<Integer> op = new ArrayList<>();
        for (Integer num : inputList) {
            if (checkPrime(num)) {
                op.add(num);
            }

        }
        return op;
    }

    @Override
    public List<String> keyDivisbletwo(){
        Map<Integer,String> inputMap=inputRepository.getMapInput();
        List<String> op=new ArrayList<>();
        for(Map.Entry<Integer,String> m:inputMap.entrySet()){
             if(m.getKey()%2==0){
                 op.add(m.getValue());
             }
        }
        return op;
    }

    @Override
    public Map<Integer,String> getMapValuegreaterthan25(){
       Map<Integer,String> ip=inputRepository.getMapInput();
       Map<Integer,String> op=new HashMap<>();
       for(Map.Entry<Integer,String> m:ip.entrySet()){
            if(m.getKey()>25){
                op.put(m.getKey(), m.getValue());
            }
       }
       return op;
    }

}

