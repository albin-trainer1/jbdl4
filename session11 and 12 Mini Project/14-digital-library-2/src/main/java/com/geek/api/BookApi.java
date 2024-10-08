package com.geek.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geek.dto.BookDto;
import com.geek.entity.Authour;
import com.geek.entity.Book;
import com.geek.entity.Genre;
import com.geek.service.BookService;
@RestController
@RequestMapping("/books")
public class BookApi {
	@Autowired
	private BookService bookService;
	@PostMapping("/authour")
	public ResponseEntity<Authour> addAuthour(@RequestBody Authour a){
	 //	bookService.addAuthour(a);
	 	return new ResponseEntity<Authour>(bookService.addAuthour(a),HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody BookDto bookDto){
	 //	bookService.addAuthour(a);
		
	 return new ResponseEntity<Book>(bookService.addBook(bookDto),HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<Book>> allBooks(){
		 return new ResponseEntity<List<Book>>(bookService.allBooks(),HttpStatus.OK);
	}
	@GetMapping("/search")
	public ResponseEntity<List<Book>> findByGenre( @RequestParam("genre") Genre genre){
		 return new ResponseEntity<List<Book>>(bookService.searchByGenre2(genre),HttpStatus.OK);

	}
	@GetMapping("/page")
	public ResponseEntity<Page<Book>> booksPagination( @RequestParam int pageNo,@RequestParam int size){
		 return new ResponseEntity<Page<Book>>(bookService.allBookswithPagination(pageNo, size),HttpStatus.OK);
	}
	@GetMapping("/search/genre")
	public ResponseEntity<List<Book>> findByGenre2( @RequestParam("genre") Genre genre){
		 return new ResponseEntity<List<Book>>(bookService.searchByGenre(genre),HttpStatus.OK);

	}
	@GetMapping("/search/authour/{authourId}")
	public ResponseEntity<List<Book>> findByGenre( @PathVariable("authourId") int authourId){
		 return new ResponseEntity<List<Book>>(bookService.searchByAuthour(authourId),HttpStatus.OK);

	}
	
}
