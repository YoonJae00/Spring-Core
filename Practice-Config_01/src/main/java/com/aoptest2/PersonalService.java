package com.aoptest2;

import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    private final PersonalDAO personalDAO;

    public PersonalService(PersonalDAO personalDAO) {
        this.personalDAO = personalDAO;
    }

    public void showPW() {
        System.out.println(personalDAO.showMIX());
    }
}
