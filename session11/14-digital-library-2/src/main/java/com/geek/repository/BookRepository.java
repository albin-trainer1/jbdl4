package com.geek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geek.dto.BookDto;
import com.geek.entity.Authour;
import com.geek.entity.Book;
import com.geek.entity.Genre;

public interface BookRepository extends JpaRepository<Book, Integer> {
    //query method
	List<Book> findByGenre(Genre genre);
	
//	Authour addAuthourRepo(Authour authour);
//	Book addBookRepo(Book book);
//	List<Book> searchByGenre2Repo(Genre genre);
//
//	List<Book> allBooksRepo();
//	List<Book> searchByAuthourRepo(int authourId);
//	List<Book> searchByGenreRepo(String genre);
//	Book updateBookRepo(Book book,int bookId);
//	void removeBookRepo(int bookId);
//	List<Book> searchByBookNameRepo(String bookName);
//	Authour searchById(int id);
}
