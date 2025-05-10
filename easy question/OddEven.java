//Even or Odd Checker Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement.
public class OddEven {
    public int oddEven(int n){
        if(n%2 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] arg){
        OddEven check = new OddEven();
        int n = 15;
        int result = check.oddEven(n);

        if(result == 1){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

    
}
