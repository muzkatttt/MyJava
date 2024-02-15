package sem4.task2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sem4.models.Student;

public class Program {

    public static void main(String[] args) {
        // Создание фабрики сессий
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Создание сессии
        Session session = sessionFactory.getCurrentSession();

        try {
            // Начало транзакции
            session.beginTransaction();

            // Создание объекта
            Student student = Student.create();

            session.save(student);
            System.out.println("Object student save successfully");

            Student retrievedStudent = session.get(Student.class, student.getId());
            System.out.println("Object student retrieved successfully");
            System.out.println("Retrieved student object: " + retrievedStudent);

            // Обновление объекта
            retrievedStudent.updateName();
            retrievedStudent.updateAge();
            session.update(retrievedStudent);
            System.out.println("Object student update successfully");

            // Удаление объекта
            //session.delete(retrievedStudent);
            //System.out.println("Object student delete successfully");

            // Коммит транзакции
            session.getTransaction().commit();
        }
        finally {
            // Закрытие фабрики сессий
            sessionFactory.close();
        }


    }

}
