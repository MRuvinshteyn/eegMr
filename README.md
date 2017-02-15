# eegMr

In order to find execution time of Merge Sort for each array of given lengths, we set time marks (using System.nanoTime()) immediately before and immediately after the
execution of Merge Sort. We then subtracted the value of the mark pre-execution from the value of the mark post-execution in order to get the time it took to run Merge
Sort. An interesting finding was that, at least in our code, the first execution of Merge Sort had a run time significantly larger than expected. In order to fix this,
we added a "hidden" execution of Merge Sort that would not be tested, and then read the run times of every execution after that one. This resulted in more accurate 
readings of run times.