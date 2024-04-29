package com.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.model.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository mybookrepo;

	public void saveMyBooks(MyBookList mybook) {
		mybookrepo.save(mybook);

	}
}
