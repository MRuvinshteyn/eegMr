# eegMr

In order to find execution time of Merge Sort for each array of given lengths, we set time marks (using System.nanoTime()) immediately before and immediately after the
execution of Merge Sort. We then subtracted the value of the mark pre-execution from the value of the mark post-execution in order to get the time it took to run Merge
Sort. An interesting finding was that, at least in our code, the first execution of Merge Sort had a run time significantly larger than expected. We believe that is because of some sort of initialization of the methods used. In order to fix this,
we added a "hidden" execution of Merge Sort that would not be tested, and then read the run times of every execution after that one. This resulted in more accurate 
readings of run times.
To gather our end results, we made 50 trials for lists of length 1, 10, 100, 1000 and then recorded the average as the mean execution time.