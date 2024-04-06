package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDAOImpl;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Component
/* @Component 의 세분화 어노테이션으로 Service 계층에서 사용된다. */
@Service("ServiceField")
public class BookService {

    /* BookDAO 타입의 Bean(객체) 를 이 프로퍼티에 자동으로 주입해준다.  */
    @Autowired
    private BookDAO bookDAO;

    /* 전체조회 호출 */
    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();
    }

    /* 번호로 책 하나 조회 */
    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }


}
