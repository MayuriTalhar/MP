package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InputRepository {

    public List<Integer> getInput(){
        List<Integer> inputList=new ArrayList<>();
        inputList.add(10);
        inputList.add(20);
        inputList.add(55);
        inputList.add(82);
        inputList.add(34);
        inputList.add(3);
        inputList.add(2);

        return inputList;
    }

    public Map<Integer,String> getMapInput(){
        Map<Integer,String> inputMap=new HashMap<>();
        inputMap.put(1,"germany");
        inputMap.put(35,"london");
        inputMap.put(64,"france");
        inputMap.put(73,"europe");
        inputMap.put(12,"greece");

        return inputMap;
    }

}
