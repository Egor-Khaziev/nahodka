package com.egorkhaziev.nahodka.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {


    public List<Integer> multiplicationTable(String request) {
        int number;
        List<Integer> list = new ArrayList<>();
        try {
            number = Integer.parseInt(request);

            for(int i = 1; i<=10;i++){
                list.add(number*i);
            }
            return list;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input: " + request);
        } finally {
            return list;
        }


    }
}
