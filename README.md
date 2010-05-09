cltest
======

This application is is a minimal
[cascalog](http://github.com/nathanmarz/cascalog) project that  counts
words in a text file.  It was written to confirm that I could run
cascalog jobs on a real Hadoop cluster.

There is a much better example by the creator of Cascalog available
[here](http://github.com/nathanmarz/cascalog-demo)

Installing and running
======================
Prerequisites
-------------
1. [leiningen](http://github.com/technomancy/leiningen)

Building cltest
---------------
    git clone http://github.com/hgavin/cltest.git
    cd cltest
    lein deps
    lein uberjar

Running cltest
---------------
Create some test input data

    hadoop fs -mkdir cltest_in
    hadoop fs -put README.md cltest_in

Run cltest specifying input dir/file and output dir

    hadoop jar cltest-standalone.jar cltest.core cltest_in cltest_out

View the output

    hadoop fs -cat cltest_out/part*

From the REPL
-------------

    $ hadoop jar cltest-standalone.jar clojure.main.Repl
    user=> (use 'cltest.core)
    nil
    user=> (count-words "cltest_in" "cltest_out")

License
-------

BSD
