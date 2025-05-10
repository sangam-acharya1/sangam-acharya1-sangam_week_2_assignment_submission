//Simple arithmetic operations Write a Java program that declares two integers and prints their sum, difference, product, and quotient.

public class Arthmetic {

    public int add(int a, int b){
        return a+b;

    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero");
            return 0;

        }
    }

    public static void main(String[] arg){
        Arthmetic arth = new Arthmetic();

        int a = 5;
        int b = 10;

        int c = arth.add(a, b);
        System.out.println(c);

        int d = arth.sub(a,b);
        System.out.println(d);

        int e = arth.multiple(a, b);
        System.out.println(e);

        int f = arth.div(a, b);
        System.out.println(f);





        
    }
}