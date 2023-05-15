public class Autoboxing1{
    public static void printNumber(Integer number){
        System.out.println("Number: " + number);
    }

    public static void main(String[] args){
        int primitiveValue = 30;
        printNumber(primitiveValue); //autoboxing int to Integer
    }
}