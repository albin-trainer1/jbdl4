package com.geek.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geek.dto.BorrowBookDto;
import com.geek.entity.Book;
import com.geek.entity.User;
import com.geek.service.UserService;
@RestController
@RequestMapping("users")
public class UserApi {
	@Autowired
	private UserService userService;
	@PostMapping
	public ResponseEntity<User> addNewUser(@RequestBody User u) {
		//insert or update
		return  new ResponseEntity<User>(userService.addNewUser(u),HttpStatus.CREATED);
	}
	@PostMapping("borrowBook")
	public ResponseEntity<Book> borrowBook( @RequestBody BorrowBookDto borrowDto){
		return new ResponseEntity<Book>(userService.borrowBook(borrowDto),HttpStatus.CREATED);
	}
	
	@PutMapping("returnBook/{tid}")
	public ResponseEntity<Book> returnBook( @PathVariable int tid ){
		return new ResponseEntity<Book>(userService.returnBook(tid),HttpStatus.OK);
	}
}
