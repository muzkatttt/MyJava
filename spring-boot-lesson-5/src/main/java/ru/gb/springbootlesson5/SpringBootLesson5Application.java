package ru.gb.springbootlesson5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@SpringBootApplication
public class SpringBootLesson5Application {

	/**
	 * JDBC JPA
	 * JDBC (java database connectivity) - библиотека внутри Java для работы с базами данных.
	 * Driver, Connection, Statement
	 *
	 * JPA (Jakarta Persistence API) - набор соглашений по работе с реляционными моделями.
	 * Основная идея - "замапить" вашу DB-модель на Java-классы и работать со строками таблиц как с объектами.
	 * JPA - это не реализация, а протокол (api, спецификация)
	 * Hibernate - это одна из реализаций JPA (еще одна реализация - EclipseLink)
	 *
	 * spring-data-jdbc - набор готовых инструментов для взаимодействия с базой данных.
	 * По сути оборачивает стандартный JDBC и предоставляет удобные интерфейсы для настройки и взаимодействия
	 * с базой данных
	 *
	 * spring-data-jpa -набор готовых инструментов для работы с JPA
	 */

	@SneakyThrows
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootLesson5Application.class, args);

//		DataSource dataSource = context.getBean(DataSource.class);
//
//		try (Connection connection = dataSource.getConnection()){
//			try (Statement statement = connection.createStatement()){
//				statement.execute("create table users(id bigint, name varchar(512))");
//			}
//
//			try (Statement statement = connection.createStatement()){
//				statement.execute("insert into users(id, name) values(1, 'Костя')");
//			}
//
//			try (Statement statement = connection.createStatement()){
//				ResultSet resultSet = statement.executeQuery("select * from users");
//				while (resultSet.next()){
//					System.out.println(resultSet.getLong("id"));
//					System.out.println(resultSet.getString("name"));
//				}
//			}
//		}

//		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//
//		jdbcTemplate.execute("create table users(id bigint, name varchar(512))");
//		jdbcTemplate.execute("insert into users(id, name) values(1, 'Костя')");
//
//		List<User> users = jdbcTemplate.query("select * from users",
//				(rs, rowNum) -> new User(rs.getLong("id"), rs.getString("name")));
//		System.out.println(users);
	}

//	@Data
//	@AllArgsConstructor
//	static class User{
//		private long id;
//		private String name;
//	}

}
