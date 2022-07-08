package br.com.willianmendesf.bookstore.Repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.willianmendesf.bookstore.Model.BookModel;

@Repository
public class BookRepository {
	
	ArrayList<BookModel> books = new ArrayList<>();
	private Integer id = 0;
	
	/**
	 * Retorna uma lista de todos livros na base.
	 * @return lista de livros
	*/
	public ArrayList<BookModel> list() {
		return books;
	}
	
	/**
	 * Busca na base o livro conectado com a id passada no parametro.
	 * @param Id do livro buscado 
	 * @return return o livro se existe na id;
	*/
	public Optional<BookModel> getById(Integer id) {
		return books.stream().filter(book -> book.getId() == id).findFirst();
	}
	
	/**
	 * Cria um novo livro com os dados passado e se houver sucesso o retorna.
	 * @param novo livro a ser criado
	 * @return retorna o livro criado
	 */
	public BookModel create(BookModel newBook) {
		Optional<BookModel> getBook = getById(newBook.getId());
		Integer id = this.id++;
		newBook.setId(id);
		
		if(getBook.isEmpty()) books.add(newBook);
		
		return newBook;
	}
	
	/**
	 * Atualiza o livro na base, a partir de sua id
	 * @param id do livro a ser atualizado
	 * @param novos dados do livro.
	 * @return o livro atualizado.
	 */
	public BookModel update(Integer id, BookModel book) {
		//Optional<BookModel> getBook = getById(id);
		delete(id);
		
		book.setId(id);
		books.add(book);
		
		return book;
	}
	
	/**
	 * Deleta o livro na base a partir da sua id;
	 * @param id do livro a ser deletado.
	 * @return retorna uma mensagem de sucesso.
	 */
	public String delete(Integer id) {
		Optional<BookModel> getBook = getById(id);
		books.removeIf(book -> book.getId() == id);
		
		if(getBook.isEmpty()) return "Este livro não existe";
		else return "Removido com sucesso";
	} 
}
