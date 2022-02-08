package com.southwind.springboottest.controller;

import com.southwind.springboottest.entity.Book;
import com.southwind.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookHandler {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page-1,size);
        return bookRepository.findAll(pageable);
    }
    @PostMapping("/save")
    public String save(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if (result!=null){
            return "success";
        }else {
            return "falsae";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){
        return bookRepository.findById(id).get();
    }

    @PutMapping("/save")
    public String update(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if (result!=null){
            return "success";
        }else {
            return "falsae";
        }
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }
}
