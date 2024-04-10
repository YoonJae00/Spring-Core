package com.aoptest.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DAO {

    private final Map<Integer, DTO> calc;

    public DAO() {
        this.calc = new HashMap<>();

        this.calc.put(1, new DTO("윤재", 173.2, 66.6));
        this.calc.put(2, new DTO("재윤", 188.8, 75.2));

    }

    public Map<Integer, DTO> showYourBMI() {
        return calc;
    }

    public Map<String,Double> showALlBMI() {
//        DTO dto1 = calc.get(1);
//        double bmiResult1 = dto1.getWeight() / (dto1.getHeight() * dto1.getHeight());
//        DTO dto2 = calc.get(2);
//        double bmiResult2 = dto2.getWeight() / (dto2.getHeight() * dto2.getHeight());

        Map<String, Double> all = new HashMap<>();
        for (int i = 0; i < calc.size(); i++) {
            double bmiResult = calc.get(i+1).getWeight()/Math.pow(calc.get(i+1).getHeight(),2);

            all.put(calc.get(i + 1).getName(),bmiResult);
        }
        return all;
    }
}
