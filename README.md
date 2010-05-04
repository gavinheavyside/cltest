cltest
======

This application is is a minimal
[cascalog](http://github.com/nathanmarz/cascalog) project that  counts
words in a text file.  It was written to confirm that I could run
cascalog jobs on a real Hadoop cluster.

Installing and running
======================
Prerequisites
-------------
1. install [leiningen](http://github.com/technomancy/leiningen)
1. download and compile cascalog according to the instructions [in the
readme](http://github.com/nathanmarz/cascalog)
1. install cascalog locally using `lein install`

Building cltest
---------------
1. `git clone http://github.com/hgavin/cltest.git`
1. `cd cltest`
1. `lein deps && lein uberjar`

Running Example
---------------
1. `hadoop fs -mkdir cltest_in`
1. `hadoop fs -put README.md cltest_in`
1. `hadoop jar cltest-standalone.jar cltest_in cltest_out`
