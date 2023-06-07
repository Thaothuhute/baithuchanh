package com.example.book.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.Model.Book;
import com.example.book.Repository.IBookRepository;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> getAllBooks(){
        
        return bookRepository.findAll();
    }
    public Book getBookById(Long id){
        
        return bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book){
        
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        
        bookRepository.deleteById(id);
    }
    public void updateBook(Book book){
        
        bookRepository.save(book);
    }
}
