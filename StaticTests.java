public class StaticTests extends StaticSuper{
   final static int rand;

    static{
        rand = (int) (Math.random()*6);
        System.out.println("static block " + rand);
    }

    StaticTests(){
        System.out.println("static block " + rand);
    }

    public static void main(String[] args){
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}