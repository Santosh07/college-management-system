package com.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cms.domain.Book;
import com.cms.repository.BooksRepository;
import com.cms.service.BooksService;

@Service
@Transactional
public class BooksServiceImpl implements BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	@Override
	public void addBooks(Book book) {
		// TODO Auto-generated method stub
		booksRepository.addBooks(book);
	}

	@Override
	public Book getBookInfoById(int bookId) {
		// TODO Auto-generated method stub
		return booksRepository.getBookInfoById(bookId);
	}

	@Override
	public void deleteBookById(int bookId) {
		// TODO Auto-generated method stub
		booksRepository.deleteBookById(bookId);
	}

	@Override
	public List<Book> showAllBooks() {
		// TODO Auto-generated method stub
		return booksRepository.showAllBooks();
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		booksRepository.updateBook(book);
	}

	@Override
	public void deleteBOok(Book book) {
		// TODO Auto-generated method stub
		booksRepository.deleteBook(book);
	}

	@Override
	public void deleteStudentBook(Book book) {
		// TODO Auto-generated method stub
		booksRepository.deleteStudentBookById(book);
	}


}
