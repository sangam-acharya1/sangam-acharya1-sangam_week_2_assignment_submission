//Student Grading (Switch Statement) Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder. Create 3 students and display their grades.
public class StudentGrading {
    String name;
    float marks;

    //constructor
    StudentGrading(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    //methods
    String calculateGrade(){
        if(marks > 90){
            return "A";

        }else if(marks > 80){
            return "B";
        }else if(marks > 70){
            return "C";
        }else if(marks > 60){
            return "D";
        }else{
            return "F";
        }


        }
        public static void main(String[] args) {
            StudentGrading s1 = new StudentGrading("sangam", 70);
            String grade = s1.calculateGrade();
            System.out.println(grade);
        }

    }
    

