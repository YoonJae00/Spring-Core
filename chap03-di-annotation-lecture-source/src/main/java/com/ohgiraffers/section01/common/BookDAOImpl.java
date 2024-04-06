package com.ohgiraffers.section01.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Component
/* @Component 의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용  */
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {


    private final Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 12345, "혼자공부하는자바", "김윤재", "한빛출판", new Date()));
        bookList.put(2, new BookDTO(2, 1234512, "혼자공부하는자바2", "김재윤", "한빛출판", new Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
