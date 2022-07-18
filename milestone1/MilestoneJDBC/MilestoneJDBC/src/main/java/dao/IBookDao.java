package dao;

import java.util.List;

import entity.Book;



public interface IBookDao {
	
	
	public static final String URL="jdbc:mysql://localhost:3306/milestone";
	
	public static final String USERNAME="root";
	
	public static final String PASSWORD="Praveensql@12";
	
	
	public abstract void addBook(Book b);
	
	public abstract void deleteBook(int bookid );
	
	public abstract void updateBook(Book e); 	
	
	public List<Book>showAllBooks();
	
	public   String findBook(int bookid);
	
	
	

}
