public class Book {
    private String title;
    private String author;
    private String genre;


    public Book(String title, String author, String genre){
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
