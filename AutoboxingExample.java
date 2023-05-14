import java.util.ArrayList;

public class AutoboxingExample{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        int primitiveValue1 = 42;
        numbers.add(primitiveValue1); //autoboxing: int to Interger

        int primitiveValue2 = 100;
        numbers.add(primitiveValue2); //autoboxing:int to Integer

        System.out.println("ArrayList: " + numbers); //Output: ArrayList: [42, 100]
    }
}