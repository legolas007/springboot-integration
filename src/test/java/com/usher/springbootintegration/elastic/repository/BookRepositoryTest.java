package com.usher.springbootintegration.elastic.repository;

import com.usher.springbootintegration.elastic.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Usher
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest  {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void test(){
        Book book = new Book();
        book.setAuthor("usher");
        book.setId(2);
        book.setBookName("love lala land");
        bookRepository.index(book);
        for (Book book1 : bookRepository.findByBookNameLike("lov")){
            System.out.println(book);
        }
    }

}