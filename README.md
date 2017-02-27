# eegMr

Michael Ruvinshteyn, Edward Ro, Adeebur Rahman  
APCS2 p1  
Lab00 -- What Does the Data Say?    
2017-02-27  


##Merge Sort Algorithm

1. If array size is 1, return array
2. Else, split the array into halves (first half is smaller if array size is odd)
3. Sort each half of the array and merge the two halves

##Timing Algorithm

1. A random list of given size is created.
2. The current time is recorded with System.nanoTime() as startTime
3. The list is sorted with merge sort.
4. Difference between the new value returned from System.nanoTime() and the startTime is returned.
5. Process is repeated the given number of times.

##Sidenote

After running multiple runtime tests, we noticed that the runtime of the first few executions of MergeSort were significantly larger than runtimes of successive executions. We found that this is because java was still initializing. In order to get more accurate data, we added another set of tests of size 10000000 that does not get displayed on the terminal, so that the successive runtimes are more accurate. We used size 10000000 because this properly fixed the runtimes. When we tried shorter lists it didn't really have much of an effect. 

##Analysis

In order to get some data, we calculated the average runtime of lists between size 50000 and 1000000 with increments of 50000. We then took the average runtimes and graphed them. We also graphed n, log(n), nlog(n), and n^2 runtime for comparison. The graph looked most similar to nlog(n). To confirm the runtime, we graphed lines of xnlog(n) replacing x with some arbitray number to see if it was close to matching. We also graphed lines of xlog(n) and xn to compare. From our testing we found that our data is most closely represented by the line 13nlog(n). We then concluded that the runtime of merge sort is nlog(n).

##Graphs

See graph.png for our graphical data.