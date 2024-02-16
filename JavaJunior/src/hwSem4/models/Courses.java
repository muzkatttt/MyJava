package hwSem4.models;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "courses") // аннотация к таблице
public class Courses {

    // region Поля
    private static final String[] titles = new String[]
            {
                    "Course on programming",
                    "Course on analytics",
                    "Software testing course",
                    "Big Data science course",
                    "Mathematical modeling course"
            };
    private static final Random random = new Random();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title; // наименование курса
    int courseDuration; // продолжительность курса в неделях

    // endregion

    // region Конструкторы
    public Courses() {
    }

    public Courses(String title, int courseDuration) {
        this.title = title;
        this.courseDuration = courseDuration;
    }

    // endregion

    // region Методы
    public static Courses create(){
        return new Courses(titles[random.nextInt(titles.length)], random.nextInt(10, 52));
    }

    public void updateCourseDuration(){
        courseDuration = random.nextInt(1, 10);
    }

    public void updateTitle(){
        title = titles[random.nextInt(titles.length)];
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }
    // endregion

}
