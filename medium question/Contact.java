//Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition).



public class Contact {
    String name;
    long  phoneNumber;
    String email;


    Contact(String name, int phoneNumber, String email){
        this.name = name;
        this.phoneNumber =  phoneNumber;
        this.email = email;
    }
    void checkEmail(){
        if(email == null){
            System.out.println("email is empty");
        }else{
            System.out.println(name);
            System.out.println(phoneNumber);
            System.out.println(email);
        }
    }

    public static void main(String[] args) {
        Contact person1 = new Contact("sangam",98989999,"yuvrajacharya9816@gmail.com");
        person1.checkEmail();
    }


    
}
