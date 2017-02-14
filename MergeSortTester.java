/*======================================
  class MergeSortTester

  ALGORITHM:
  1. If array size is 1, return array
  2. Else, split the array into halves (first half is smaller if array size is odd)
  3. Sort each half of the array and merge the two halves

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlog(n))

  Mean execution times for dataset of size n:
  Batch size: 10
  n=1       time: 256 nanoseconds
  n=10      time: 12522 nanoseconds
  n=100     time: 72833 nanoseconds
  ...
  n=<huge>  time: 542032 nanoseconds

  ANALYSIS:
  An array of length 1 has a significantly lower runtime demand than arrays of length 10, 100, and greater. This must be due to the
  fact that the array did not require comparisons to be done in order to sort it, as there is only one item that would be compared
  to an empty second half.
  ======================================*/

public class MergeSortTester 
{

    public static int[] randArr(int length) {
	int[] retArr = new int[length];
	for (int i = 0; i < length; i++) {
	    retArr[i] = (int) (Math.random()*100);
	}
	return retArr;
    }

    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    
    /******************************
     * execution time analysis 
     After running multiple runtime tests, we noticed that the runtime of the first execution of MergeSort was significantly larger
     than runtimes of successive executions. In order to get more accurate data, we added another execution of MergeSort that does
     not get displayed on the terminal, so that the successive runtimes are more accurate. This resulted in the runtime of 1 item-long
     arrays getting 256 nanosecond average runtime, rather than its previous 400000 nanosecond runtime, which was unrealistic given
     the runtimes of 10 item-long arrays and 100 item-long arrays.

     In order to read the runtimes, we mark the system runtime right before we initiate a MergeSort of an array. To display the time it
     took to run that execution, we mark the time after the sort, and subtract that from the mark made before the sort to get the time
     difference. This time is printed out and displayed for the user to see how long it took to sort the array.
     ******************************/
    public static void main( String[] args ) 
    {
	
	long mark1, first, mark2, second, mark3, third, mark4, fourth, mark5, fifth;
	int[] one1 = randArr(1);
	printArray(one1);
	int[] ten1 = randArr(10);
	printArray(ten1);
	int[] hundred1 = randArr(100);
	printArray(hundred1);
	int[] thousand1 = randArr(1000);
	printArray(thousand1);

	mark1 = System.nanoTime();
        MergeSort.sort(one1);	
	first = System.nanoTime(); //Results in significantly large runtime that is evidently not representative of the array being sorted

	mark2 = System.nanoTime();
	MergeSort.sort(one1);
	second = System.nanoTime();
	System.out.println("Length 1: " + (second - mark2) + " nanoseconds");

	mark3 = System.nanoTime();
	MergeSort.sort(ten1);
	third = System.nanoTime();
	System.out.println("Length 10: " + (third - mark3) + " nanoseconds");

	mark4 = System.nanoTime();
	MergeSort.sort(hundred1);
	fourth = System.nanoTime();
	System.out.println("Length 100: " + (fourth - mark4) + " nanoseconds");

	mark5 = System.nanoTime();
	MergeSort.sort(thousand1);
	fifth = System.nanoTime();
	System.out.println("Length 1000: " + (fifth - mark5) + " nanoseconds");
    }//end main

}//end class
