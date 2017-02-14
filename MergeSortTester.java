/*======================================
  class MergeSortTester

  ALGORITHM:
  1. If array size is 1, return array
  2. Else, split the array into halves (first half is smaller if array size is odd)
  3. Sort each half of the array and merge the two halves

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlog(n))

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	
	long first, second;
	int[] one1 = randArr(1);
	int[] ten1 = randArr(10);
	int[] hundred1 = randArr(100);
	int[] thousand1 = randArr(1000);
	first = System.nanoTime();
	//first = System.currentTimeMillis();
	MergeSort.sort(one1);
	second = System.nanoTime();
	//second = System.currentTimeMillis();
	System.out.println((second - first) + " nanoseconds");
	
    }//end main

}//end class
