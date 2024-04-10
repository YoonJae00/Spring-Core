package com.aoptest2;

import org.springframework.stereotype.Repository;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonalDAO {

    private final Map<Integer,PersonalDTO> personalMap;

    public PersonalDAO(){
        this.personalMap = new HashMap<>();

        personalMap.put(1,new PersonalDTO("user01","pass01"));
        personalMap.put(2,new PersonalDTO("user02","pass02"));
        personalMap.put(3,new PersonalDTO("user03","pass03"));
        personalMap.put(4,new PersonalDTO("user04","pass04"));
        personalMap.put(5,new PersonalDTO("user05","pass05"));
    }


    public Map<Integer,PersonalDTO> showMIX(){
        return personalMap;
    }

    public String showId(int no){
        return personalMap.get(no).getPersonID();
    }

    public String showPW(int no){
        return personalMap.get(no).getPersonPW();
    }

    public void setPW(int no, String a){
        personalMap.put(no,new PersonalDTO(personalMap.get(1).getPersonID(),a));
    }

}
