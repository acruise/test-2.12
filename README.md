### A mixed Scala 2.11/2.12 project

This project contains three modules:

* util
  * cross-compiled for 2.11 and 2.12
  * Detects at runtime what version it's in
* spark
  * depends on a Spark 2.3.x library and thus requires 2.11
  * depends on util and actually uses it
* service 
  * compiles with 2.12
  * depends on util and actually uses it

#### To build/test (can we simplify this?) ####
```
$ sbt
> ++ 2.11.12
> util/publishLocal // or just `publishLocal`
>
> ++ 2.12.7
> service/run // OK, 2.12
> spark/run // OK, 2.11 
> 
```