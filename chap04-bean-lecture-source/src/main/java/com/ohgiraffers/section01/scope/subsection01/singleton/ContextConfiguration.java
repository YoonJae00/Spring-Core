package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵",1000,new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("초코우유",800,500);
    }

    @Bean
    public Product water() {
        return new Beverage("삼다수",50000,500);
    }

    /* 필기. 기본적인 스코프는 싱글톤 !!!
    *   하나의 인스턴스을 생성을 하고, 모든 빈이 해당 인스턴스를 공유한다.
    *  */
    @Bean
    @Scope("singleton")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }


}
