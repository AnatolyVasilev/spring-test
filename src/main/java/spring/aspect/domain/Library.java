package spring.aspect.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Library {

    private Map<Book, Integer> storage = new HashMap<>();

    public void addBook(Book book) {
        storage.put(book, storage.getOrDefault(book, 0) + 1);
    }

    public void returnBook(Book book) {
        int amount = storage.getOrDefault(book, 0);
        if (amount == 0) throw new RuntimeException("Wrong book");
        storage.put(book, amount - 1);
    }

    public Map<Book, Integer> getBooks() {
        return storage;
    }

}
