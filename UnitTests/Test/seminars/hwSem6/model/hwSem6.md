### Домашнее задание к семинару 6 (Unit-тесты)
В качестве языка программирования для выполнения проекта выбран ЯП Java.
Приложение написано в соответствии с принципами объектно-ориентированного программирования.
Код представлен в папке src -> hwSem6, тесты к нему в папке Tests -> seminars -> hwSem6.

Для написания тестов применена библиотека JUnit.
Над каждым тестом приведена краткая аннотация,
ксодержащая информацию о типе теста и метода, который он проверяет.
Применяла unit-тесты для проверки методов в классах MyList, AbstractClass, Controller, 
также при написании тестов применила фреймворк Mockito для создания mock-объектов 
(для тестирования взаимодействия контроллера и модели (интеграционные тесты)).
Сквозные тесты не создавала, так как у приложения пока нет графического интерфейса.
Остановилась на варианте формирования списков через Random, 
получение команд от пользователя в данном приложении не предусмотрено.

Установила плагин CheckStyle-IDEA. Проверкой в классе ControllerTest выявлены неиспользуемые строки кода,
строки закомментированы. Принцип работы понятен :)