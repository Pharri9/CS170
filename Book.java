/*Patrick Harris
Pharri9
Section 004
I worked on the assignment alone, using only this semester's materials' 
and notes'. */
public class Book {

	// declaration of instance variables 
	private String title, author;
	private Boolean borrowed; 
	

	/* constructor method Book assigns the author and title of the book to the instance variables
	@ paramater a String that is the author of the book and a String that is the title of the book
	@ return does not return a value */

	public Book (String title, String author) {
		this.title = title; 
		this.author = author;
		this.borrowed = false;
	}

	/* the instance bethod borrowBook marks a book as borrowed
	@ param no paramaters
	@ return no paramaters */
	public void borrowBook() {
		borrowed = true;
		
	}

	/* the instance bethod returnBook marks a book as returned 
	@ param no paramaters
	@ return no paramaters */ 
	public void returnBook() {
		borrowed = false;
		
	}

	/* the instance method getTitle returns the title of the book from the instance variable 
	@ param no paramaters
	@ return a String that is the title of the book */
	public String getTitle() {
		return (this.title);
	}

	/* the instance method get Author returns the author of the book from the instance variable
	@ param no paramaters
	@ return a String that is the author of the book */
	public String getAuthor() {
		return (this.author);
	}

	/* the instance method getBorrowed determines if a book is borrowed
	@ param no paramaters
	@ return a boolean indicating whethere or not a book is currently borrowed */
	public boolean getBorrowed() {
		return borrowed;
	 }
	
	/* the instance method toString presents in a clear formating the title, author, and whethere or not a book is available
	@ param no paramaters
	@ return a String that prints out information about the book regarding the author, title, and borrowed status */
	public String toString() {
		if (borrowed) { 
		return ("the author is: " + this.author + "; the title is: " + this.title + "; the book is currently borrowed." + '\n');
	}
		else {
			return ("the author is: " + this.author + "; the title is: " + this.title + "; the book is currently not borrowed." + '\n');
		}
	}
}