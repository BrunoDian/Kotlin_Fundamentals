
/* What is Kotlin?
 * It's a modern programming language, used for:
 * Web development;
 * Server side applications;
 * Data Science;
 * Declared by Google as the main development language for Android;
 * And now it's in Beta for Multiplatform Mobile, when you share the logic of your iOS and Android apps.
 *
 * How can Kotlin do all this? Because of JDK and JVM.
 * The Kotlin code that you write is compiled by the JDK (Java Development Kit) to another code called
 * 'Java bytecode' and it's an intermediate of high level code and a machine code.
 * This 'Java bytecode' is read by the JVM (Java Virtual Machine) and converted to a Machine Code, adding
 * instructions about the processor and system operational.
 * This means that every system that has a JVM can run Kotlin code!
 */

// ~~~~~~~~~~ START -> COMMENTS ~~~~~~~~~~ //

    // comments in Kotlin are made with two ways:
    // <-- This is a Single Line comment.

    /*
    * And this is a multiline
    * comment
    */

// ~~~~~~~~~~ FINISH -> COMMENTS ~~~~~~~~~~ //

fun main(){
    /*
    * This is the 'main' function, all projects need to have one to work,
    * this is the entry point to the compiler read and construct your project.
    */

    print(userName)
    // 'print' is a built-in function that outputs in terminal.
    println(password)
    // 'println' outputs in terminal and add a new line after the print.
}

// ~~~~~~~~~~ START -> VARIABLES ~~~~~~~~~~ //

    /*
    * Kotlin is a statically typed language, it means that when you assign a type or a value in a variable,
    * you cannot change the type more, just his value.
    * There is two ways to create a variable in Kotlin, the first is a mutable variable:
    */

    var userName: String = "John"
    // 'var' you can reassign the value, just not the data type.
    /*
    * After the variable name, you can specify the data type, but it is optional,
    * because Kotlin assigns the variable type based on the assigned value.
    */

    /*
    * And you have the second way to store data in Kotlin, is with immutable variables:
    */

    val password = 123456
    // Remember, write the data type is optional.
    // 'val' you cannot reassign the value or the data type, it's a constant.
