package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Book;


public class BookDaoMysqlImpl implements IBookDao {
	
	
	private Connection cn=null;
	
	private PreparedStatement pst=null;
	
	private ResultSet rs=null;
	
	
	
	public static final String INS_CMMAND="INSERT INTO book values (?,?,?,?,?)";
	
	public static final String UPDATE_COMMAND="UPDATE book set bookName=?,bookPrice=?,bookPublisher=?,yearOfPublication=? where bookId=?";
	
	public static final String DELETE_COMMAND="DELETE  from book where bookId=?";
	
	public static final String FIND_COMMAND="select * from book where bookId=?";
	
	public static final String SELECT_ALL="Select * from book";
	
	
	
	public BookDaoMysqlImpl() {
		
		
		try {
			cn=DriverManager.getConnection(URL, USERNAME,PASSWORD);
			
		} catch (SQLException e) {
			
         System.out.println("Unable to establish connection");
			
			e.printStackTrace();
		}
	}
	
	
	






	public void addBook(Book b) {
		int i=0;
	
		try {
			pst=cn.prepareStatement(INS_CMMAND);
			
			pst.setInt(1, b.getBookId());
			
			pst.setString(2, b.getBookName());
			
			pst.setFloat(3, b.getBookPrice());
			
			pst.setString(4, b.getPublisher());
			
			pst.setInt(5, b.getYear());
			
			i=pst.executeUpdate();
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		if(i>0) {
			System.out.println("Bokk details added sucessfully");
		}
	}






	public void deleteBook(int bookid) {
		
		
		try {
			pst=cn.prepareStatement(DELETE_COMMAND);
			
			pst.setInt(1, bookid);
			
			pst.executeUpdate();
			
			System.out.println("Deleted sucessfully");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}






	public void updateBook(Book e) {
		
		
		try {
			pst=cn.prepareStatement(UPDATE_COMMAND);
			
			pst.setString(1, e.getBookName());
			
			pst.setFloat(2, e.getBookPrice());
			
			pst.setString(3, e.getPublisher());

			pst.setInt(4, e.getYear());
			
			pst.setInt(5, e.getBookId());
			
			pst.executeUpdate();
			
			
			pst.close();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}






	public List<Book> showAllBooks() {
		
		Book selectAllTemp=null;
		
		List<Book> elist=new ArrayList<Book>();
		
		try {
			pst=cn.prepareStatement(SELECT_ALL);
			
			
		   rs=pst.executeQuery();
		   
		   while(rs.next()) {
			   
			   selectAllTemp=new Book();
			   
			   selectAllTemp.setBookId(rs.getInt(1));
			   
			   selectAllTemp.setBookName(rs.getString(2));
			   
			   selectAllTemp.setBookPrice(rs.getFloat(3));
			   
			   selectAllTemp.setPublisher(rs.getString(4));
			   
			   selectAllTemp.setYear(rs.getInt(5));
			   
			   elist.add(selectAllTemp);
			   
		   }
			return elist;																											
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return null;
	}






	public String findBook(int bookid) {
		
		try {
			pst=cn.prepareStatement(FIND_COMMAND);
			
			pst.setInt(1, bookid);
			
			rs=pst.executeQuery();
			
			while (rs.next()) {
				
				String setails=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4)+" "+rs.getInt(5);
				
				return setails;
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
