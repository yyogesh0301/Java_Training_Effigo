package java_concepts;

import java.util.HashSet;
import java.util.Set;

// custom class named Book
class Book {
	String title;
	String author;

	// Constructor to initialize Book with title and author
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// Override the equals method to compare Book objects based on both title and author
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		return title.equals(book.title) && author.equals(book.author);
	}

	// Override the hashCode method to generate a unique hash code based on title and author
	public int hashCode() {
		int result = title.hashCode();
		result = 31 * result + author.hashCode();
		return result;
	}
}

// Main class to demonstrate HashSet with custom class
public class HashCode {
	public static void main(String[] args) {

		// Create a HashSet to store Book objects
		Set<Book> bookSet = new HashSet<>();

		// Create several Book objects with different titles and authors
		Book book1 = new Book("Java", "James");
		Book book2 = new Book("Python", "Guido");
		Book book3 = new Book("Java", "James"); // Duplicate of book1

		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3); // duplicate

		System.out.println("Books Present:");
		for (Book book : bookSet) {
			System.out.println(book.title + " - " + book.author);
		}
	}
}
