/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package lillebror

import spark.Spark.*

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    get("/hello", {req, res -> App().greeting})
}
