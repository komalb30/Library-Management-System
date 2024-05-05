package com.java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}