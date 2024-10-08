package com.geek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.geek.dto.BookDto;
import com.geek.entity.Authour;
import com.geek.entity.Book;
import com.geek.entity.Genre;
import com.geek.entity.Transaction;
import com.geek.exception.ApplicationException;
import com.geek.repository.AuthourRepository;
import com.geek.repository.BookRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class BookServiceImpl implements BookService {
 @Autowired
	private BookRepository bookRepo;
 @Autowired
 private AuthourRepository authourRepo;
	@Override
	public Authour addAuthour(Authour authour) {
		//return bookRepo.addAuthourRepo(authour);
		return authourRepo.save(authour);
				
	}

	@Override
	public Book addBook(BookDto b) {
		// TODO Auto-generated method stub
	//	Authour authour=bookRepo.searchById(b.getAuthourId());
		 Optional< Authour> authour=authourRepo.findById(b.getAuthourId());
		if(authour.isPresent()) {
			Book book=new Book();
			book.setAuthour(authour.get());
//			book.setBookId(b.getBookId());
//			book.setBookName(b.getBookName());
//			book.setCost(b.getCost());
//			book.setGenre(b.getGenre());
//			book.setStock(b.getStock());
			BeanUtils.copyProperties(b, book);
			bookRepo.save(book);
			return book;
		}
		throw new ApplicationException("Authour "+ b.getAuthourId()+" Not Exists");
	}
	public List<Book> searchByGenre2(Genre genre) {
		//Pageable pageable=PageRequest.of(pageNo, size, Sort.by("bookId").ascending());
		return bookRepo.findByGenre(genre);
	}

	@Override
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}

	@Override
	public List<Book> searchByAuthour(int authourId) {
		// TODO Auto-generated method stub
		return bookRepo.searchBooksByAuthourId(authourId);
	}

	@Override
	public List<Book> searchByGenre(Genre genre) {
		
		return bookRepo.searchBooksByGenre(genre);
	}

	@Override
	public Book updateBook(Book book, int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> searchByBookName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Book> allBookswithPagination(int pageNo, int size) {
		Pageable pageable=PageRequest.of(pageNo, size, Sort.by("bookId").ascending());
		Page<Book>  pages=bookRepo.findAll(pageable);
		return pages;
	}

}
