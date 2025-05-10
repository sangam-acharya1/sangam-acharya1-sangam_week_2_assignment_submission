//Comparison using if-else Write a Java program that takes two numbers and prints the greater number.
public class GreaterNumber {
    int num1;
    int num2;

    //contructor
    GreaterNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }
    //methods
    String greater(){
        if(num1 > num2){
            return num1 + "is greater";
        } else if(num2 > num1){
            return num2 + "is greater";
        }else{
            return "equal";
        }
    }

    
    public static void main(String[] args){
        GreaterNumber number = new GreaterNumber(12, 11);
        System.out.println(number.greater());
    
        

    } 
}
