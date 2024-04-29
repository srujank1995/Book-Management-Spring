package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookStore.model.Book;
import com.bookStore.repository.BookRepository;

@org.springframework.stereotype.Service

public class BookService {

	@Autowired
	private BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
	}
	
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
	
}
