public class Autoboxing2{
    public static Integer incrementNumber(Integer number){
    return number + 1;
    }

    public static void main(String[] args){
        int primitiveValue = 42;
        Integer incrementedValue = incrementNumber(primitiveValue);
        System.out.println("Incremented value: " + incrementedValue);
    }
}
//the 'incrementNumber()' method takes an 'Integer' object as a parameter and returns
//an 'Integer' object by incrementing the input value. We pass an 'int' primitive
//('primitiveValue') as an argument, and autoboxing automatically converts it to an 
//'Integer' object when returning the incremented value