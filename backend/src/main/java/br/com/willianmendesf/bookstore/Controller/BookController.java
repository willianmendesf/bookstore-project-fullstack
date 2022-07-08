package br.com.willianmendesf.bookstore.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.willianmendesf.bookstore.Model.BookModel;
import br.com.willianmendesf.bookstore.Service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/list")
	public ArrayList<BookModel> list() {
		return service.list();
	}
	
	@GetMapping("/book/{id}")
	public Optional<BookModel> getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/book/create")
	public BookModel create(@RequestBody BookModel newBook) {
		return service.create(newBook);
	}
	
	@PostMapping("/book/update/{id}")
	public BookModel update(@PathVariable Integer id, @RequestBody BookModel newBook) {
		return service.update(id, newBook);
	}
	
	@PostMapping("/book/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return service.delete(id);
	}
}
