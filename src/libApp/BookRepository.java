package libApp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> księga = new ArrayList();

    public BookRepository() {
        księga.add(new Book("4", "Nic", "nic", "nic", "Jakiś nikt"));
        księga.add(new Book("022","Przygody Szymona i Karola na dzikikim Zadupuiu w Czatkowach","Horro-Komedia","To było straszne, ha ha ha ha ha", "Szymon Karolak i Karol Szymoniak"));
        księga.add(new Book("888881","W pustyni i w puszczy","Przygoda", "Staś i Nel w Afryce...","Henryk Sienkiewicz"));
        księga.add(new Book("888882","Kolorowanki ","Cwiczenia", "100 szkiców do pokolorowania","Aleksandra Olla"));
        księga.add(new Book("888883","czterej pancerni i pies","Przygoda", "przygody żołnierzy w czołgu","Honorata C."));
        księga.add(new Book("888884","1000 sposobów parzenia kawy i herbaty","Poradnik kulinarny", "Niecodzienne sposoby parzenia napojów","Cecylia  "));
        księga.add(new Book("888885","Fizyka dla dzieci","Nauka i Technika", "Super przygoda z przykładami i doświadczeniami","Naomi B."));
        księga.add(new Book("888886","Interstellar","Sci-Fiction", "Wyprawa w odległy kosmos...Niesamowita przygoda","Shinny Grant"));
        księga.add(new Book("01","Woda w proszku ", "fantasticzno naukowa ", "takie tam pierdy o lodzie i wodzie",  "X"));
    }
    public Book findByIsbn(String isbn){
        for (Book book  :księga){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book : księga) {
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}
