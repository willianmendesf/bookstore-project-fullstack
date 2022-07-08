package br.com.willianmendesf.bookstore.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.willianmendesf.bookstore.Model.BookModel;
import br.com.willianmendesf.bookstore.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public ArrayList<BookModel> list() {
		return repository.list();
	}
	
	public Optional<BookModel> getById(Integer id) {
		return repository.getById(id);
	}
	
	public BookModel create(BookModel newBook) {
		return repository.create(newBook);
	}
	
	public BookModel update(Integer id, BookModel book) {
		return repository.update(id, book);
	}
	
	public String delete(Integer id) {
		return repository.delete(id);
	}
}
