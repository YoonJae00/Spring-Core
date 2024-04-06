package com.ohgiraffers.section01.autowired.subsection03.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceSetter")
public class BookService {

    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }

}
