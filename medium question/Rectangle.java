//Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.


public class Rectangle {
    float length;
    float width;

    //constructor
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    // methods 
    float calculateArea(){
        return length*width;
    }


    

public static void main(String[] args){
    Rectangle rect1 = new Rectangle(12.4f, 6.60f);
    float area = rect1.calculateArea();
    System.out.println(area);

    Rectangle rect2 = new Rectangle(15.4f, 6.60f);
    float area1 = rect2.calculateArea();
    System.out.println(area1);
}


}

