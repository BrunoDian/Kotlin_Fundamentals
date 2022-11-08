
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

// ------------------------------------------------------------------------------------------------------------------//

// ~~~~~~~~~~ START -> COMMENTS ~~~~~~~~~~ //

    // comments in Kotlin are made with two ways:
    // <-- This is a Single Line comment.

    /*
    * And this is a multiline
    * comment
    */

// ~~~~~~~~~~ FINISH -> COMMENTS ~~~~~~~~~~ //

// ------------------------------------------------------------------------------------------------------------------//

fun main(){
    /*
    * This is the 'main' function, all projects need to have one to work,
    * this is the entry point to the compiler read and construct your project.
    */

    print(userName)
    // 'print' is a built-in function that outputs in terminal.

    println(password)
    // 'println' outputs in terminal and add a new line after the print.

    println("My name is $userName and i have ${2022-1997} years old.")
    /*
    * In Kotlin, you can use the String Template to print variables or expressions
    * using the dollar sign for variables or put an expression inside curly braces.
    */

    unusedVariables()
    // This is how you call a function.
}

// ------------------------------------------------------------------------------------------------------------------//

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

    fun printOut() {
        val password = 123456
        // Remember, write the data type is optional.
        // 'val' you cannot reassign the value or the data type, it's a constant.
        print(password)
    }

    // Why did I put the variable 'val' within a function? Because the IDE accused it of bad practice.
    /*
    * Variable 'val' can be initialized at runtime, but in this case, because the 'val' password
    * is outside a class or function, it must be initialized at compile time.
    * The good practice here is to add the keyword 'const' before 'val':
    */

    const val password = 123456
    /* This initialization does not conflict with the other 'password' variable because the
    * SCOPE of it is private to the 'printOut()' function.
    */

// ~~~~~~~~~~ FINISH -> VARIABLES ~~~~~~~~~~ //

// ------------------------------------------------------------------------------------------------------------------//

// ~~~~~~~~~~ START -> DATA TYPES ~~~~~~~~~~ //

    /* There are many types of data with different storage capacities.
    * The correct choice at the time of initializing a variable can positively impact application performance.
    * For example: A variable that will always have only one number can be declared as type 'Byte',
    * which reserves less space in the device's memory, because in kotlin's automatic inference,
    * this variable would be treated as 'Int' which would increase the amount of memory to be reserved for its use.
    */

    // 'Byte': stores values between -127 and 128;
    // 'Short': stores values between -32768 and 32767;
    // 'Int': stores values between -2147483648 and 2147483647;
    // 'Long': stores values between -9223372036854775808 and 9223372036854775807;
        // In 'Long' you need add a 'L' after the number:
            const val numberLong = 4278913465L

    // For numbers with decimals, Kotlin have:

    // 'Float': stores values between 1.4E-45 and 3.4028235E38;
        // In 'Float' you need add a 'f' or 'F' after the number:
            const val numberFloat = 3.14f
    // 'Double': stores values between 4.9E-324 and 1.7976931348623157E308;
        // 'Double' is the default data type to floating point numbers.
            const val numberDouble = 2.5 // Kotlin automatically infers the 'Double' type.

// ~~~~~~~~~~ FINISH -> DATA TYPES ~~~~~~~~~~ //

// ------------------------------------------------------------------------------------------------------------------//



// In so that the IDE does not accuse the non-use of variables or others, they will be called in this function below.
fun unusedVariables() {
    print(numberLong)
    print(numberFloat)
    print(numberDouble)

    printOut()
}