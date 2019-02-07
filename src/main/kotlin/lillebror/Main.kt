package lillebror

import spark.Spark.*;

fun main(args: Array<String>){
  println("Hello World")
  println("Kotlin!")
  get("/hello", {req, res -> "Hello World"} );
}
