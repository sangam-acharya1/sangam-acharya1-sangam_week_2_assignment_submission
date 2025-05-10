//Movie Details Manager Create a Movie class with attributes: name, language, rating (out of 5). Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails().

public class Movie {
    String name;
    String language;
    float rating;

    Movie(String name, String language, float rating){
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    void displayMovieDetails(){
        System.out.println(name);
        System.out.println(language);
        System.out.println(rating);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The green miles", "english", 4.8f );
        movie1.displayMovieDetails();

        Movie movie2 = new Movie("The Truman Show", "english", 4.7f );
        movie2.displayMovieDetails();

        Movie movie3 = new Movie("The silence of the lambs", "english", 4.8f );
        movie3.displayMovieDetails();

        Movie movie4 = new Movie("Interstellar", "english", 4.9f );
        movie4.displayMovieDetails();

        Movie movie5 = new Movie("The dark Knight", "english", 4.89f );
        movie5.displayMovieDetails();






    }


}
