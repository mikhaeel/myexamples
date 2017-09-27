package info.everybodylies.collections;

import info.everybodylies.collections.helper.Book;

import java.util.Comparator;

public class ComparableClass {

    public static void main(String[] args) {

        Book book1 = new Book("title1", "991211322");
        Book book2 = new Book("title2", "991211322");
    }

    class CompareBooks implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareToIgnoreCase(o2.getTitle());
        }
    }
}
