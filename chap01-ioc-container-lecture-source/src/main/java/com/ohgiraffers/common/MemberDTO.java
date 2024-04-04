package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// @Data <- x 안정성 별로?
public class MemberDTO {

    private int sequence;       // 회원 번호
    private String id;
    private String pwd;
    private String name;
}
