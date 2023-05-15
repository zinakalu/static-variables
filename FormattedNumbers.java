public class FormattedNumbers{
    public static void main(String[] args){
        int one = 892839;
        double two = 3382830.382932323;

        String s = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(s);
    }
}