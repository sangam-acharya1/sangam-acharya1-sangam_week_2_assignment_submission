//Class Initialization through Constructor Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().
public class Book {
    String author;
    String title;

    //contructor
    Book(String author, String title){
        this.author = author;
        this.title = title;

    }

    // methods

   void showBooks(){
    System.out.println(author);
    System.out.println(title);
   }

   public static void main(String[] args) {
    Book book1 = new Book("sangam", "how to master java");
    book1.showBooks();

   }


}
