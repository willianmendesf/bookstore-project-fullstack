package br.com.willianmendesf.bookstore.Model;

public class BookModel {
	
	private Integer id;
	private String title;
	private String subtitle;
	private String author;
	private Integer pages;
	private Integer value;
	
	public BookModel(Integer id, String title, String subtitle, String author, Integer pages, Integer value) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.pages = pages;
		this.value = value;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
