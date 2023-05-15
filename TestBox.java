public class TestBox{
    private Integer i;
    private int j;

    public static void main(String[] args){
        TestBox t = new TestBox();
        t.setI(42);
        t.j = 12;
        t.go();
    }
    public void setI(Integer I){
        this.i = I;
    }

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}

//NB: the 'j' instance varaible is of type 'int', which is a primitive type in Java. Unlike reference types
//(like 'Integer'), primitive types DON'T have setter mthods. Since 'j' is an 'int'(primitive), you can't
//set its value through a setter method like you can with 'i' (which is of type 'Integer', a reference type).
//To set the value of 'j', you can assign a value directly to it using the assignment operator '='
