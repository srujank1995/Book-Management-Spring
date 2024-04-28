package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookStore.model.Book_entity;
import com.bookStore.repository.book_Repo;

@org.springframework.stereotype.Service

public class Book_Service {

	@Autowired
	private book_Repo repo;

	public void BookSave(Book_entity b) {
		repo.save(b);
	}
	public List<Book_entity> getAllBooks(){
		return repo.findAll();
	}
}
