import java.util.Arrays;
/*Patrick Harris
Pharri9
Section 004
I worked on the assignment alone, using only this semester's materials' 
and notes'. */
public class Patron {
	private String name;
	private Book[] books;
	

	/* the constructor method puts the Patron's name into a variable and initiliazes a book
	@ param  A String that is the Patron's name
	@ return it does not return a value */
	public Patron(String name) {
		this.name = name;
		this.books = new Book[0];
	}

	/* the method checkout assigns a book to a specific patron and marks the book as borrowed. It does this
	by checking the getBorrowed instance method and creating a new array
	@ param a book object
	@ return it does not return a variable */
	public void checkout(Book b) {
		if (b.getBorrowed() == false) {
		Book[] newCheckout = new Book[books.length +1];
		

		for (int indx = 0; indx < newCheckout.length -1; indx++) {
			newCheckout[indx] = books[indx];
		}

		newCheckout[newCheckout.length -1] = b;
		b.borrowBook();
		this.books = newCheckout; 
		} 
 	}

 	/* the method returnBook  unassigns a book from a patron and marks a book as NOT borrowed, it does this
 	by checking the getBorrowed method and creating a new array of book objects
 	@ param a book object
 	@ return it does not return a value */
	public void returnBook(Book b) {

		if (b.getBorrowed() == true) {
			Book[] newCheckout = new Book[books.length];
			Book[] corrected = new Book[newCheckout.length -1];
			int index = 0;

			b.returnBook();

			for (int i = 0; i < books.length; i ++) {
				if (books[i].getBorrowed() == true) {
					newCheckout[index] = books[i];
					index ++;
				}
			}

			this.books = newCheckout;

			if (newCheckout[newCheckout.length -1] == null) {
				for (int i = 0; i < newCheckout.length -1; i ++) {
					corrected[i] = newCheckout[i];
				}
				this.books = corrected;
			}
		
		
		}
	}
	/* the method getBooks eturns an array of Book objects representing the books the patron currently has
	it uses the book object created by the other methods
	@ param it does not take an paramaters
	@ return a book object */
	public Book[] getBooks() {
		return this.books;
	}

	/* tge method toString displays information about the Patron, including name and books checked out, it does this by concatanting strings 
	@ param a String that is the Patron's name
	@ return a String that is information about the books the patron has checked out */ 
	public String toString() {
		if (books.length == 0) { 
		return "The Patron: " + name + " has not checked out a book";
		}

		 else {
			return ("The Patron: " + name +  " has checked out: " + books.length + " the books are: " + Arrays.toString(books) + '\n');
		}
	}
}