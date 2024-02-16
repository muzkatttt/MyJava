package hwSem4.models;

public class Course {

    // region Поля
    private String title;
    private int courseDuration;

    // endregion

    // region Конструкторы
    public Course(String title, int courseDuration) {
        this.title = title;
        this.courseDuration = courseDuration;
    }

    // endregion

    // region Методы
    public static Course create(String title, int courseDuration)
    {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название курса не может быть пустым!");
        }
        if (courseDuration <= 0) {
            throw new IllegalArgumentException("Продолжительность курса должнf быть больше 0!");
        }
        return new Course(title, courseDuration);
    }

    // endregion
}
