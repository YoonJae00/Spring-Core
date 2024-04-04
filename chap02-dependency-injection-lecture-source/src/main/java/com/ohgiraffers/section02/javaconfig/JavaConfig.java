package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Account account() {

        return new PersonalAccount(10, "01-13231-3123");
    }

    @Bean
    public MemberDTO member() {

        /* 생성자를 통한 주입 */
//        return new MemberDTO(1, "김윤재", "123-1234-1234", "123@gmail,com", account());

        /* setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("김윤재");
        member.setPhone("123-123123-13");
        member.setEmail("13123@gmail.com");
        member.setPersonalAccount(account());

        return member;
    }

}
