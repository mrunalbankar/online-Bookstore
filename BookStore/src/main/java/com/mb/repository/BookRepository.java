package com.mb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
