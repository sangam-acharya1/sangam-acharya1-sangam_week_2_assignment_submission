// Simple Class with a Method Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age. In the main method, create a Student object and call displayInfo().
public class ClassMethodExample {
    String name;
    int age;
// contructor
    ClassMethodExample(String name ,  int age){
        this.name = name;
        this.age = age;
    }
//method
void displayInfo(){
    System.out.println(name);
    System.out.println(age);

}
public static void main(String[] args) {
    ClassMethodExample s1 = new ClassMethodExample("sangam", 20);
    s1.displayInfo();
}
    
    
}
