package com.aoptest.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final DAO BMIDAO;


    public MemberService(DAO bmiDAO){
        this.BMIDAO = bmiDAO;
    }

    public void showALLBMI(){

        Map<String,Double> all = BMIDAO.showALlBMI();
        for(int i =0 ;i<all.size();i++){
            System.out.println(all.get(BMIDAO.showYourBMI().get(i+1).getName()));
        }

    }


}
