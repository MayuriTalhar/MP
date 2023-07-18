package com.example.demo.serviceTest;

import com.example.demo.repository.InputRepository;
import com.example.demo.service.InputServicImpl;
import com.example.demo.service.InputService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.*;

import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class InputServiceImplTest {

    private InputServiceImplTest inputServiceImplTest;


    private InputRepository inputRepositoryMock;

    private InputService inputService;

    @BeforeEach
    public void setup(){
        inputRepositoryMock = Mockito.mock(InputRepository.class);
        inputService=new InputServicImpl(inputRepositoryMock);
    }


    @Test
    public void getPrimeNumbers(){
        List<Integer> expected=new ArrayList<>();
        expected.add(3);
        expected.add(2);

        when(inputRepositoryMock.getInput()).thenReturn(expected);

       List<Integer> actual=inputService.getPrimeNumbers();

       assertEquals(expected,actual);

    }

    @Test
    public void keyDivisbletwo(){
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"germany");
        map.put(35,"london");
        map.put(64,"france");
        map.put(73,"europe");
        map.put(12,"greece");

        List<String> expected=new ArrayList<>();
        expected.add("france");
        expected.add("greece");

        when(inputRepositoryMock.getMapInput()).thenReturn(map);

        List<String> actual=inputService.keyDivisbletwo();

        assertEquals(expected,actual);

    }




}
