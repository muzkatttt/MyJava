package sem1.task1;

import java.util.List;

public class LibraryV2 {

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Преступление и наказание", "Фёдор Достоевский", 1866),
                new Book("Евгений Онегин", "Александр Пушкин", 1833),
                new Book("Война и мир", "Лев Толстой", 1869),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967),
                new Book("Анна Каренина", "Лев Толстой", 1877),
                new Book("Война и мир", "Михаил Булгаков", 1877)
        );

        // Поиск книг, написанных автором "Лев Толстой"
        List<Book> authorBooks = books
                .stream()
                .filter(book -> "Лев Толстой".equals(book.getAuthor()))
                .toList();
        System.out.println("Книги Льва Толстого:\n" + authorBooks);

        // Поиск книг, изданных после 1866 года
        List<Book> booksAfter1866 =
                books.stream()
                        .filter(book -> book.getYear() > 1866)
                        .toList();
        System.out.println("Книги опубликованные после 1866 года:\n" + booksAfter1866);

        // Поиск уникальных названий книг
        List<String> uniqueTitles = books.stream()
                .map(Book::getTitle)
                .distinct()
                .toList();
        System.out.println("Уникальные наименования книг:\n" + uniqueTitles);
    }

}
