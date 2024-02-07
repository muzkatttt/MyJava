Для выполнения задач на 2-м семинаре сначала необходиммо скачать зависимости в файл pom.xml
в раздел dependencies добавить следующие зависимости
~~~
<dependencies>
<!-- Добавляем зависимость для Jackson -->
<dependency>
<groupId>com.fasterxml.jackson.core</groupId>
<artifactId>jackson-databind</artifactId>
<version>2.16.0</version>
</dependency>
<!-- Поддержка xml-сериализатора -->
<dependency>
<groupId>com.fasterxml.jackson.dataformat</groupId>
<artifactId>jackson-dataformat-xml</artifactId>
<version>2.16.0</version>
</dependency>
</dependencies>
~~~