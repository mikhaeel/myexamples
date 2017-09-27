package info.everybodylies.collections;

import info.everybodylies.collections.helper.Author;
import info.everybodylies.collections.helper.Book;

import java.util.HashMap;
import java.util.Map;

public class HashCodeSample {

    public static void main(String[] args) {
        Map<Book, Author> map = new HashMap<>();
        map.put(new Book("Петр I", "9992323"), new Author("Алексей Толстой", 45));
        map.put(new Book("Шантарам", "9992324"), new Author("Робертс", 41));
        System.out.println(map);
    }
}
