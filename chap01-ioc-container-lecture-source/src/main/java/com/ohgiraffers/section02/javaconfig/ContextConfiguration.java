package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean       // @Bean() 안에 id=" " 로도 가능
    public MemberDTO getMember() {      // 메소드의 이름이 아이디가 된다.

        return new MemberDTO(1,"user01","pass01","김윤재");
    }
}
