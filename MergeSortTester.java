//Michael Ruvinshteyn, Edward Ro, Adeebur Rahman
//APCS2 p1
//HW07 -- What Does the Data Say?  
//2017-02-14

/*======================================
  class MergeSortTester

  ALGORITHM:
  1. If array size is 1, return array
  2. Else, split the array into halves (first half is smaller if array size is odd)
  3. Sort each half of the array and merge the two halves

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlog(n))

  Mean execution times for dataset of size n:
  Batch size: 50
  n=1       time: 256 nanoseconds
  n=10      time: 12522 nanoseconds
  n=100     time: 72833 nanoseconds
  ...
  n=<huge> 1000  time: 542032 nanoseconds

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
	
	int[] init = randArr(1);	
	long initStart = System.nanoTime();
        MergeSort.sort(init);	
	long initEnd = System.nanoTime(); //Results in significantly large runtime that is evidently not representative of the array being sorted

	long startTime, runtime, total;
	total = 0;
	System.out.println("Length 1");
	for (int i = 0; i < 50;i++){
	    int[] one = randArr(1);
	    printArray(one);
	    startTime = System.nanoTime();
	    MergeSort.sort(one);
	    runtime = System.nanoTime() - startTime;
	    System.out.println("Trial " + i + " : " + runtime + " nanoseconds\n");
	    total += runtime;
	}
	double oneAverage = total/50f;

	total = 0;
	System.out.println("Length 10");
	for (int i = 0; i < 50;i++){
	    int[] ten = randArr(10);
	    printArray(ten);
	    startTime = System.nanoTime();
	    MergeSort.sort(ten);
	    runtime = System.nanoTime() - startTime;
	    System.out.println("Trial " + i + " : " + runtime + " nanoseconds\n");
	    total += runtime;
	}
	double tenAverage = total/50f;
	
	
	total = 0;
	System.out.println("Length 100");
	for (int i = 0; i < 50;i++){
	    int[] hundred = randArr(100);
	    printArray(hundred);
	    startTime = System.nanoTime();
	    MergeSort.sort(hundred);
	    runtime = System.nanoTime() - startTime;
	    System.out.println("Trial " + i + " : " + runtime + " nanoseconds\n");
	    total += runtime;
	}
	double hundredAverage = total/50f;


	total = 0;
	System.out.println("Length 1000");
	for (int i = 0; i < 50;i++){
	    int[] thousand = randArr(1000);
	    printArray(thousand);
	    startTime = System.nanoTime();
	    MergeSort.sort(thousand);
	    runtime = System.nanoTime() - startTime;
	    System.out.println("Trial " + i + " : " + runtime + " nanoseconds\n");
	    total += runtime;
	}
	double thousandAverage = total/50f;

	System.out.println("Average time for length 1: " + oneAverage + " nanoseconds");
	System.out.println("Average time for length 10: " + tenAverage + " nanoseconds");
	System.out.println("Average time for length 100: " + hundredAverage + " nanoseconds");
	System.out.println("Average time for length 1000: " + thousandAverage + " nanoseconds");
    }//end main

}//end class
