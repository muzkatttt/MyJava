## Домашнее задание к семинару 3 Java Junior (Сериализация)
### 1) Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
Обеспечьте поддержку сериализации для этого класса.
Создайте объект класса Student и инициализируйте его данными.
Сериализуйте этот объект в файл.
Десериализуйте объект обратно в программу из файла.
> Выведите все поля объекта, включая GPA, и ответьте на вопрос,
почему значение GPA не было сохранено/восстановлено? 

Если поле gpa в классе Student помечено как transient, то при десериализации 
из JSON файла это поле будет проигнорировано, так как transient указывает, что поле не должно участвовать 
в сериализации и десериализации. При десериализации JSON объекта в Student будет загружены только значения 
без transient полей.

В итоге поставила аннотацию @JsonIgnore над полем со средним баллом студента.

### 2) Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документы).