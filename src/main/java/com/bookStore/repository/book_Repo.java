package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.model.Book_entity;

@Repository
public interface book_Repo extends JpaRepository<Book_entity, Integer> {

}
