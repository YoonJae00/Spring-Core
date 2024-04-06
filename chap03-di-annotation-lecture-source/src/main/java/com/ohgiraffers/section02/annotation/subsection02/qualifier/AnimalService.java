package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("animalQualifier")
public class AnimalService {

    /* 필기.
        @Qualifier 어노테이션은 여ㅓx`ㄹ 개의 Bean 객체 중에서 특정 Bean 객체를
        이름으로 지정하는 어노테이션이다.
        @Primary 어노테이션이 존재하더라도 Qualifier 로 이름을 지정해두면
        우선순위를 갖는다.
     */

    /* 필드 주입 방식 */
//    @Autowired
//    @Qualifier("raccoon")
//    private Animal animal;


    /* 생성자 주입 방식 */

    private Animal animal;

    // 필기. 생성자 주입의 경우 @Qualifier 어노테이션은 메소드의 파라미터 앞에 기재한다.
    public AnimalService(@Qualifier("raccoon") Animal animal){
        this.animal = animal;
    }
    public void animalEat() {
        animal.eat();
    }

}
