//Bank Account System Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.


public class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;

    //contructor
    BankAccount(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.println("deposited amount: "+amount+ "  new balance:"+balance);

        }else{
            System.out.println("invalid deposit amount");
        }
    }
    // snagam chor desh chorrrr

    public  void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("withdrawl amount: "+amount+  "  new balance: "+ balance);
            }else{
                System.out.println("Insufficient balance");
            }
        }

    public void displayInfo(){
            System.out.println("account holder name: "+accountHolderName);
            System.out.println("account Number: "+accountNumber);
            System.out.println("current balance: "+balance);
            
        }


    
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("sangam Acharya", 10124,1000 );
        account1.displayInfo();

        account1.withdraw(500);
        account1.deposit(100);

        account1.displayInfo();



    }
}
