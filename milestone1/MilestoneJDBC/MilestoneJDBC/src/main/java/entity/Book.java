package entity;

public class Book {
	
	private int BookId;
	private String BookName;
	private float bookPrice;
	private String Publisher;
	private int year;
	
	

	public Book(int bookId, String bookName, float bookPrice, String publisher, int year) {
		super();
		BookId = bookId;
		BookName = bookName;
		this.bookPrice = bookPrice;
		Publisher = publisher;
		this.year = year;
	}


	public int getBookId() {
		return BookId;
	}


	public void setBookId(int bookId) {
		BookId = bookId;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public float getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getPublisher() {
		return Publisher;
	}


	public void setPublisher(String publisher) {
		Publisher = publisher;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}



	
	
	public Book() {
		super();
	}

	
}
