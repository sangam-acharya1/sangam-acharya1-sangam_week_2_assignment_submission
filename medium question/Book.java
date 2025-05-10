//Book Library (Manual Objects) Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().
public class Book {

    String title;
    String author;
    int isbn;

    //constructer
    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //methods

    void showDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }

    public static void main(String[] args){
        Book book1 = new Book("To Kill a Mockingbird","Harper lee", 11233 );
        book1.showDetails();
        Book book2 = new Book("1984", "George orwell", 123232);
        book2.showDetails();
        Book book3 = new Book("the great gatsby","f.scott",33435);
        book3.showDetails();




    }

}