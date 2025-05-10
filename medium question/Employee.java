//Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():
public class Employee {
    String name;
    double salary;
    int yearsOfExperience;

    Employee(String name, double salary, int yearsOfExperience){
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

     double calculateBonus(){
        if(yearsOfExperience > 5){
            return salary * 0.2;
        }else{
            return salary * 0.1;
        }

    }
    public static void main(String[] args) {
        Employee e1 = new Employee("sangam",100, 6 );
        double bonus = e1.calculateBonus();
        System.out.println(bonus);

    }
}
