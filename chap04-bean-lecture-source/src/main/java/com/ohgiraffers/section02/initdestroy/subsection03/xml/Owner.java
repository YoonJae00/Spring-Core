package com.ohgiraffers.section02.initdestroy.subsection03.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Owner {
    public void openShop() {
        System.out.println("사장님이 가게를 열었습니다. 이제 쇼핑을 즐겨보세요!!");
    }

    public void closeShop(){
        System.out.println("사장님이 가게를 닫았습니다. 이제 쇼핑은 아쉽게도 못하겠네요..");
    }

}
