package com.example.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book.Model.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
