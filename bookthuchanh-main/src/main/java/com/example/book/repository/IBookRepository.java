package com.example.book.repository;

import org.springframework.stereotype.Repository;

import com.example.book.Model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public  interface  IBookRepository extends JpaRepository<Book,Long> {
    
}
