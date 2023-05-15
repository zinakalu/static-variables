public class Autoboxing3{
    public static void printResult(Boolean result){
        if(result){
            System.out.println("Result is true");
        } else{
            System.out.println("Result is false");
        }
    }

    public static void main(String[] args){
        int value1 = 10;
        int value2 = 20;

        boolean isGreaterThan = value1 > value2; //Boolean expression
        printResult(isGreaterThan); //autoboxing: boolean to Boolean
    }
}

//the 'printResult()' method takes a 'Boolean' object as a parameter. We compare