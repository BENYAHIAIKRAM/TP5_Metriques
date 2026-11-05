
package library.service;

import library.model.Book;
import library.model.Lendable;

public class BookDisplay {

    public void display(Lendable item) {
        if (item instanceof Book) {
            Book book = (Book) item;

            System.out.println(
                book.getTitle() + " by " + book.getAuthor()
            );
        } else {
            System.out.println("Unknown item type");
        }
    }
}
