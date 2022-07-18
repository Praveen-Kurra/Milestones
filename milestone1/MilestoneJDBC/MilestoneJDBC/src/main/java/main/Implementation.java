package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.BookDaoMysqlImpl;
import entity.Book;

public class Implementation {

	public static void options() {
		System.out.println("-----------------------------------------");

		System.out.println("1. Add new Book ");

		System.out.println("2. Delete Book ");

		System.out.println("3. Update Paricular Book");

		System.out.println("4. show Particular Book");

		System.out.println("5. Display All Book Details");

		System.out.println("6.  Exit ");

		System.out.println("-----------------------------------------");

	}

	public static void main(String[] args) {

		int key = 0;

		BookDaoMysqlImpl connection = new BookDaoMysqlImpl();

		Scanner sc = new Scanner(System.in);

		do {
			options();

			key = sc.nextInt();

			switch (key) {
			case 1:

				Book b = new Book();

				System.out.println("Enter the Book id");
				b.setBookId(sc.nextInt());

				System.out.println("Enter the book name");

				b.setBookName(sc.next());

				System.out.println("Enter the Book price");

				b.setBookPrice(sc.nextFloat());

				System.out.println("Enter the publisher Name");

				b.setPublisher(sc.next());

				System.out.println("Enter year of Publication");

				b.setYear(sc.nextInt());

				connection.addBook(b);

				break;

			case 2:

				System.out.println("Please enter the bookId you want to delete");

				connection.deleteBook(sc.nextInt());

				break;

			case 3:

				Book d = new Book();

				System.out.println("Please enter the Book id you want to update");

				d.setBookId(sc.nextInt());

				System.out.println("Please enter the Book name");

				d.setBookName(sc.next());

				System.out.println("Please enter the book price");

				d.setBookPrice(sc.nextFloat());

				System.out.println("Please enter the publisher name");

				d.setPublisher(sc.next());

				System.out.println("Please enter the year");

				d.setYear(sc.nextInt());

				connection.updateBook(d);

				break;

			case 4:

				System.out.println("Plese enter the Book id you want ");

				String result = connection.findBook(sc.nextInt());

				System.out.println(result);

				break;

			case 5:

				List<Book> allBooks = new ArrayList<Book>();

				allBooks = connection.showAllBooks();

				int bookid;

				String bookName;

				Float price;

				String Publisher;

				int year;

				for (int i = 0; i < allBooks.size(); i++) {

					bookid = allBooks.get(i).getBookId();

					bookName = allBooks.get(i).getBookName();

					price = allBooks.get(i).getBookPrice();

					Publisher = allBooks.get(i).getPublisher();

					year = allBooks.get(i).getYear();

					System.out.println(bookid + " " + bookName + " " + price + "  " + Publisher + " " + year);

				}

				break;

			case 6:

				System.out.println("Have a nice day ! Thank you !!!!!!");
				break;

			default:
				break;
			}

		} while (key != 0);

	}

}
