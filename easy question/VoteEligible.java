//Use of Logical Operators Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)


public class VoteEligible {

    int age;
    boolean iscitizen;

    // contructor
    VoteEligible(int age, boolean iscitizen){
        this.age = age;
        this.iscitizen = iscitizen;
    }

    //method
    void eligible(){
        if(age>=18 && iscitizen == true ){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }

    }

    public static void main(String[] args){

        VoteEligible citizen1 = new VoteEligible(20, true);
        citizen1.eligible();

    }

    
    
}
