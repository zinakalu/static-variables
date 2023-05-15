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