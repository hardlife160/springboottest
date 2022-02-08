package com.southwind.springboottest;

import com.southwind.springboottest.entity.Book;
import com.southwind.springboottest.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboottestApplicationTests {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Book book=new Book();
        book.setName("springboot");
        book.setAuthor("账期");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }
    @Test
    void deleteById(){
        bookRepository.deleteById(121);
    }
}
