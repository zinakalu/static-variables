public class Autoboxing1{
    public static void printNumber(Integer number){
        System.out.println("Number: " + number);
    }

    public static void main(String[] args){
        int primitiveValue = 30;
        printNumber(primitiveValue); 
    }
}
//printNumber() expects an 'Integer' object as an argument. But an 'int' primitive value ('primitiveValue')
//was passed. Autoboxing automatically converts the 'int' value to an 'Integer' object, allowing it to be
//passed as a method