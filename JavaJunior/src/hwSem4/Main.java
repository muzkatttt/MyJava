package hwSem4;

import hwSem4.models.Courses;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {

    private final static Random random = new Random();

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Password";

        // Подключение к базе данных
        Connection connection = DriverManager.getConnection(url, user, password);

        // Создание базы данных
        createDatabase(connection);
        System.out.println("Database created successfully");

        // Использование базы данных
        useDatabase(connection);
        System.out.println("Use database successfully");

        // Создание таблицы
        createTable(connection);
        System.out.println("Create table successfully");

        // Вставка данных
        int count = random.nextInt(1, 2);
        for (int i = 0; i < count; i++)
            insertData(connection, Courses.create());
        System.out.println("Insert data successfully");

        // Чтение данных
        Collection<Courses> courses = readData(connection);
        for (var course : courses)
            System.out.println(course);
        System.out.println("Read data successfully");

        // Обновление данных
        for (var course: courses) {
            course.updateTitle();
            course.updateCourseDuration();
            updateData(connection, course);
        }
        System.out.println("Update data successfully");

        // Удаление данных
        //for (var course: courses)
        //    deleteData(connection, course.getId());
        //System.out.println("Delete data successfully");

        // Закрытие соединения
        connection.close();
        System.out.println("Database connection close successfully");

    }

    private static void createDatabase(Connection connection) throws SQLException {
        String createDatabaseSQL =  "CREATE DATABASE IF NOT EXISTS courses;";
        try (PreparedStatement statement = connection.prepareStatement(createDatabaseSQL)) {
            statement.execute();
        }
    }

    private static void useDatabase(Connection connection) throws SQLException {
        String useDatabaseSQL =  "USE courses;";
        try (PreparedStatement statement = connection.prepareStatement(useDatabaseSQL)) {
            statement.execute();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS courses (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "title VARCHAR(255), " +
                "courseDuration INT);";
        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.execute();
        }
    }


    private static void insertData(Connection connection, Courses courses) throws SQLException {
        String insertDataSQL = "INSERT INTO courses (title, courseDuration) VALUES (?, ?);";
        try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
            statement.setString(1, courses.getTitle());
            statement.setInt(2, courses.getCourseDuration());
            statement.executeUpdate();
        }
    }

    /**
     * Чтение данных из таблицы courses
     * @param connection Соединение с БД
     * @return Коллекция студентов
     * @throws SQLException Исключение при выполнении запроса
     */
    private static Collection<Courses> readData(Connection connection) throws SQLException {
        ArrayList<Courses> coursesList = new ArrayList<>();
        String readDataSQL = "SELECT * FROM courses;";
        try (PreparedStatement statement = connection.prepareStatement(readDataSQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int courseDuration = resultSet.getInt("courseDuration");
                coursesList.add(new Courses(title, courseDuration));
            }
            return coursesList;
        }
    }

    /**
     * Обновление данных в таблице courses по идентификатору
     * @param connection Соединение с БД
     * @param courses наименование курса
     * @throws SQLException Исключение при выполнении запроса
     */
    private static void updateData(Connection connection, Courses courses) throws SQLException {
        String updateDataSQL = "UPDATE courses SET title=?, courseDuration=? WHERE id=?;";
        try (PreparedStatement statement = connection.prepareStatement(updateDataSQL)) {
            statement.setString(1, courses.getTitle());
            statement.setInt(2, courses.getCourseDuration());
            statement.setInt(3, courses.getId());
            statement.executeUpdate();
        }
    }
//
//    /**
//     * Удаление записи из таблицы courses по идентификатору
//     * @param connection Соединение с БД
//     * @param id Идентификатор записи
//     * @throws SQLException Исключение при выполнении запроса
//     */
//    private static void deleteData(Connection connection, int id) throws SQLException {
//        String deleteDataSQL = "DELETE FROM courses WHERE id=?;";
//        try (PreparedStatement statement = connection.prepareStatement(deleteDataSQL)) {
//            statement.setLong(1, id);
//            statement.executeUpdate();
//        }
//    }

}
