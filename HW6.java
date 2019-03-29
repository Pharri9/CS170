/*Patrick Harris
Pharri9
Section 004
I worked on the assignment with Shea Fallick using only this semester's materials' 
and notes'. */

public class HW6 {
	public static void main(String [] args) {
	}

	/* the method search finds a specific value in an array starting at a given point in that array
	@ param an integer array, an integer indicating which value to search for, and an integer
	indicating which element to being searching at
	@ return an integer giving the first index at which the value appears, with -1 indicating
 	that the value never appeared 
	*/
 	public static int search(int[] array , int find, int index) {
		if (index >= array.length) {
			return -1;
		}
		if (array[index] == find) {
			return index;
		}
		return search(array, find, index +1);
	}

	/* the method sumArray sums the values in an array starting at a given index
	@ param an array to be summed, and an index to begin summing at
	@ return a value that is the sum of the element in an array */
	public static int sumArray( int[] array , int index) {

		if (index >= array.length) {
			return 0;
		}

		return array[index] + sumArray(array, index + 1);
	}

	/* the method sumXArray sums every xth element in a given array, beginning at index x-1
	@ param in array to be summed, an integer representing which multiples to sum, and an index
	indicating where to begin
	@ return an integer representing the sum of every xth element */
	public static int sumXArray(int[] array, int every, int index) {
		if (((index + 1) * every) -1 >= array.length) {
			return 0;
		}

		return array[((index + 1) * every) -1] + sumXArray(array, every, index + 1 );
		}

	/* the method merge joins two arrays together into a new array with alternating elements
	@ param two integer arrays, a new array that is the legnth of array a and array b combined, and
	an index indicating which element from a and b is being added to the new array
	@ return a new array with alternating elements from array a and array b */
	public static int[] merge(int[] a, int[] b, int[] soln, int index) {

		// occurs if two empty arrays have been entered or when all elements have been
		// added to soln
		if(index >= a.length && index >= b.length) {
			return soln;
		}

		// occurs when array b is longer than array a and all elements
		// of a have been added to soln
		if (index < b.length && index >= a.length) {
			soln[index + a.length] = b[index];
			merge(a,b, soln, index +1); }

		// occurs when array a is longer than array b and all elements
		// of b have been added to soln
		if (index < a.length && index >= b.length) {
			soln[index + b.length] = a[index];
			merge(a,b, soln, index +1); 
		}

		// occurs when the arrays are the same length, or not all elements 
		// of the shorter array have been added to soln
		if (index < a.length && index < b.length) {
			soln[2*index] = a[index];
			soln[2*index + 1] = b[index];
			merge(a,b,soln, index +1); }

		return soln; }

}