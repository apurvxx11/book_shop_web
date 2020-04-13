package com.euphoria.online_book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.euphoria.online_book_store.entity.Book;


@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book,Long>{

}
