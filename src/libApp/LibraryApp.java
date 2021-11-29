package libApp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){

        System.out.printf("Searching for book with ISBN %s. \n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            System.out.printf("found:\n\tTitle: %s\n\tGenre: %s\n\tOpis: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getDescription(),  book.getAuthor());
            System.out.println("\n");
        }
        else {
            System.out.println("0 books found.");
        }

    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);
        ArrayList<Book> księga = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n",księga.size(), księga.size()>0 ? ":" : ".");
        for(Book book : księga) {
            System.out.printf("found:\n\tTitle: %s\n\tGenre: %s\n\tOpis: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getDescription(),  book.getAuthor());
        }
        System.out.println();
    }
}
