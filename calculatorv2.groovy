
def add = { a, b -> a + b };
def substract = { a, b -> a - b };
def multiply = { a, b -> a * b };
def divide = { a, b -> a / b };
def power = { a, b -> a ** b };
def squareRoot = { a -> a ** 0.5 };


String options = ['add', 'subtract', 'multiply', 'divide', 'power', 'square root']
println("What would you like to do: add, subtract, multiply, divide, power, square root");
String userChoice = System.in.newReader().readLine();
userChoice = userChoice.toLowerCase();

if(!options.contains(userChoice)){
    println("Not a valid choice. Please try again.");
} else {
    if(userChoice == 'add'){
        println("Enter a number");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Enter another number");
        int num2 = System.in.newReader().readLine() as Integer;
        println(add(num1, num2));
    } else if(userChoice == 'subtract'){
        println("Enter a number");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Enter another number");
        int num2 = System.in.newReader().readLine() as Integer;
        println(subtract(num1, num2));
    } else if(userChoice == 'multiply'){
        println("Enter a number");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Enter another number");
        int num2 = System.in.newReader().readLine() as Integer;
        println(multiply(num1, num2));
    } else if(userChoice == 'divide'){
        println("Enter a number");
        int num1 = System.in.newReader().readLine() as Integer;
        println("Enter another number");
        int num2 = System.in.newReader().readLine() as Integer;
        println(divide(num1, num2));
    } else if(userChoice == 'power'){
        println("Enter the base number");
        int num1 = System.in.newReader().readLine() as Integer;
        println("to the power of...");
        int num2 = System.in.newReader().readLine() as Integer;
        println(power(num1, num2));
    } else if(userChoice == 'square root'){
        println("The square root of.... (Enter a number)");
        double num1 = System.in.newReader().readLine() as double;
        println(squareRoot(num1));
    } else {
        println("Error");
    }
}
