# Домашнее задание к семинару 6
_*Взять реализованный код в рамках семинара 4 и продемонстрировать*_
_*применение принципов, усвоенных на семинаре.*_
_*Нужно в проекте прокомментировать участки кода,*_
_*которые рефакторим, какой принцип применяем и почему.*_
_*Формат сдачи: ссылка на гитхаб проект*_

#### План выполнения домашней работы
При выполнении домашней работы требуется использовать 5 принципов ООП,
среди которых:
- S - принцип единственной ответственности - каждый класс выполняет только одну задачу, и не имеет зависимостей на другие классы.

- O - принцип открытости/закрытости. Принцип означает, что сущности открыты для расширения и закрыты для модификации.
Реализовывать дополнительные методы необходимо в наследуемом классе, чтобы не сломать родительский класс.

- L - принцип подстановки барбары лисков - объекты в программе можно заменить их наследниками без изменения свойств программы.

- I - принцип разделения интерфейса - лучше добавить много специализированных интерфейсов, чем один.

- D - принцип инверсии зависимостей - зависимость на абстракциях. Модули верхних уровней не должны зависеть от модулей нижних уровней. Оба типа модулей должны зависеть от абстракций.
Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

*На семинаре разобрано создание 5 классов (User, Student, StudentIterator, StudentComparator, StudentGroup), ни один из классов не являлся абстрактным.*
> В домашней работе к семинару добавлены классы teacher.Teacher, teacher.TeacherComparator, teacher.TeacherGroup, teacher.TeacherGroupIterator >

> При работе над проектом к 6 семинару выполнена реструктурзация проекта: созданы абстрактные классы BaseUser & BaseUserGroup, добавлен интерфейс UserInterface, добавлены поля в класс User.

> Изменена структура проекта - классы распределены по директориям для лучшего восприятия информации.
## Реализация принципов SOLID в проекте:
- _Принцип единственной ответственности (Single Responsibility Principle)_ реализован в классах Student & Teacher, наследуемые от класса User, но имеют одно поле (Student - studentCourse) (Teacher - teacherId), которое определено в каждом из классов для определенной категории.
  А также в классах StudentGroup & TeacherGroup, которые наследуются от UserGroup.
- _Принцип подстановки лисков_ можно проверить путем замены объектов наследниками (User заменить на Teacher или Student) и программа продолжит работать без изменения свойств.
- _Принцип разделения интерфейсов_ реализован путем создания UserInterface. 
> Т.к. в конкретном проекте стояла задача сравнить объекты между собой, добавлен только один интерфейс. 
В случае, если бы потребовалось дополнить программу другим функционалом, то можно было бы создать еще несколько интрефейсов.
- _Принцип открытости/зактрытости_ реализован в домашней работе путем создания getter & setter, и обращение к полям класса через эти методы, что позволяет соблюсти принцип закрытости сущностей для модификации, а создание классов-наследников (таких как Student & Teacher), позволяет соблюсти принцип открытости - то есть наши сущности открыты для дальнейших расширений.
- _Принцип инверсии зависимостей_ реализован следующим образом: в данном проекте абстрактные классы BaseUser & BaseUserGroup не зависят от деталей.
В абстрактных классах перечислены поля, которые будут использоваться в проекте, а детали реализованы в классах-наследниках.
Модули верхних уровней не зависят от модулей нижних уровней.