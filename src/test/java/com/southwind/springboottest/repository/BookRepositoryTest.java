package com.southwind.springboottest.repository;

import com.southwind.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());;
    }

    @Test
    void findById(){
        System.out.println(bookRepository.findById(1).get());

    }

    @Test
    void bookUpdate(){
        Book book=new Book();
        book.setId(121);
        book.setName("测试测试");
        Book book1 =  bookRepository.save(book);
        System.out.println(book1);
    }
}