package com.ohgiraffers.common;

import lombok.ToString;

@ToString
public class PersonalAccount implements Account {

    private final int backCode;     // 은행코드
    private final String accNo;     // 계좌번호
    private int balance;            // 잔액

    public PersonalAccount(int backCode, String accNo) {
        this.backCode = backCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은" + this.balance + "입니다.";
    }

    @Override
    public String deposit(int money) {

        String str = "";
        if (money >= 0) {
            this.balance += money;
            str = money + "원이 입급되었습니다!!!";
        } else {
            str = "금액을 잘못 입력하셨습니다";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";
        if(this.balance >= money){
            this.balance -= money;
            str = money + "가 출금되었습니다!";
        } else str = "잔액이 부족합니다.";

        return str;
    }
}
