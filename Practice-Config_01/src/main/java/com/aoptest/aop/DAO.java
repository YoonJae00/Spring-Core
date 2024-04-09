package com.aoptest.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DAO {

    private final Map<String, DTO> calc;

    public DAO() {
        this.calc = new HashMap<>();

        this.calc.put("윤재",new DTO(173.2,66.6));
        this.calc.put("재윤", new DTO(188.8,75.2));
    }

    public 
}
