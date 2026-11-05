
package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {
    private List<Lendable> items;
    private BookDisplay bookDisplay;

    public Library() {
        items = new ArrayList<>();
        bookDisplay = new BookDisplay();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();

        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }

    public void listAllItems() {
        for (Lendable item : items) {
            bookDisplay.display(item);
        }
    }
}
