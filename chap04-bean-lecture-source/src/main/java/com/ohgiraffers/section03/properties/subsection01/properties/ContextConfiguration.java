package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
// resources 폴더 하위에 기술한 파일을 읽어오는 annotation
@PropertySource("section03/properties/subsection01/properties/product-info.properties")
public class ContextConfiguration {

    /* 필기.
        @Value
        ${} : 치환자(placeholder) 문법을 이용하여 properties 에 저장된 key 를 입력하면
              value 에 해당하는 값을 꺼내올 수 있다.
     */
    @Value("${bread.carpbread.name}")
    private String carpBreadName;
    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;
    @Value("${beverage.milk.name}")
    private String milkName;
    @Value("${beverage.milk.price}")
    private int milkPrice;
    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread() {

        return new Bread(carpBreadName, carpBreadPrice, new Date());
    }

    @Bean
    public Product milk() {

        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name}") String waterName, @Value("${beverage.water.price}") int waterPrice,
                         @Value("${beverage.water.capacity}") int waterCapacity) {
        return new Beverage(waterName, waterPrice, waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
