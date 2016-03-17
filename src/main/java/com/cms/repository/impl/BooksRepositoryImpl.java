package com.cms.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cms.domain.Book;
import com.cms.exception.BookNotFound;
import com.cms.repository.BooksRepository;

@Repository
public class BooksRepositoryImpl implements BooksRepository{

	@Autowired
	SessionFactory factory;
	
	@Override
	public void addBooks(Book book) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().save(book);
	}

	@Override
	public Book getBookInfoById(int bookId) {
		// TODO Auto-generated method stub
		Book book = (Book) factory.getCurrentSession().get(Book.class, bookId);
		
		if(book == null){
			throw new BookNotFound("No book found with the book id : " + bookId);
		}
		
		return book;
		
	}

	@Override
	public void deleteBookById(int bookId) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(Book.class);
		
	}

	
	@Override
	public List<Book> showAllBooks() {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<Book>();
		
		Query query = factory.getCurrentSession().createQuery("from Book");
		bookList = (List<Book>) query.list();
		
		return bookList;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().update(book);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(book);
	}

	@Override
	public void deleteStudentBookById(Book book) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().delete(book);
	}

}
