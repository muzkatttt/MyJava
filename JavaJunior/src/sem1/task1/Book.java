package sem1.task1;

import java.util.Locale;

/**
 * Книга
 */
public class Book {

    //region Конструкторы

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //endregion

    //region Методы

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Книга:\n\tНаименование: %s\n\tАвтор: %s\n\tГод издания: %s\n",
                title, author, year);
    }

    //endregion

    //region Поля

    /**
     * Наименование
     */
    private final String title;

    /**
     * Автор
     */
    private final String author;

    /**
     * Год издания
     */
    private final int year;

    //endregion

}
