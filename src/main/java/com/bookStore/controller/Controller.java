package com.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.model.Book_entity;
import com.bookStore.service.Book_Service;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Controller {

	@Autowired
	private Book_Service service;

	@GetMapping("/")
	public String home() {
		return "Home";
	}

	@GetMapping("/Book_Register")
	public String Book_Reg() {
		return "Book_Register";
	}

	@GetMapping("/Available_Books")
	public ModelAndView getAllBooks() {
		List<Book_entity> list = service.getAllBooks();
		return new ModelAndView("bookList", "book", list);
	}

	@GetMapping("/myBook")
	public String getMyBooks() {
		return "My_Book";
	}

	@PostMapping("/save")
	public String postMethodName(@ModelAttribute Book_entity b) {
		service.BookSave(b);
		return "redirect:/";
	}
	
		@PostMapping("/mylist/{id}")
		public String getMyList(@PathVariable("id") int id) {
			Book_entity b = service.getBookById(id);
			return "";
		}
		
}
