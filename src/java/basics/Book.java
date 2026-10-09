package java.basics;

public class Book {
    String title;
    String author;
    int pages;
    void displayBookDetails(){
        System.out.println("Book Name: "+ title);
        System.out.println("Author Name: "+ author);
        System.out.println("No of pages in the Book: "+pages);
    }

    static void main(String[] args) {
        Book obj = new Book();
        obj.title= "Fire and Blood";
        obj.author="Martin";
        obj.pages=700;
        obj.displayBookDetails();
    }
}
