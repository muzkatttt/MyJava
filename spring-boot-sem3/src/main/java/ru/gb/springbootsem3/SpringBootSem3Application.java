import demo.SecondBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSem3Application {

	public SpringBootSem3Application() {
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSem3Application.class, args);
		((SecondBean)context.getBean(SecondBean.class)).postConstruct();

		/*
		1. контроллеры (controllers, api)
		2. сервисный слой (servises)
		3. репозиторий (repository, dao = data access object)
		4. Сущности (entity, model) в БД каждое поле - это название столбцов в БД
		 */

		// сущности для проекта
		/*
		/book/** - книга
		/reader/** - читатель
		/issue/** - выдача
		 */
	}
}
//@SpringBootApplication
//public class Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//}

