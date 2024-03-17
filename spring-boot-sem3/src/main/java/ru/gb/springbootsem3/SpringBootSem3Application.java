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
	}
}

