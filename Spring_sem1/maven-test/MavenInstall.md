## 1. Запуск maven-проекта
Сначала устанавливаем maven
После установки maven переходим в терминал и вводим команду 
~~~ 
mvn -v
~~~

если в терминале выводится версия maven - значит, все установлено! 
далее переходим в папку, из которой будем в интерактивном режиме собирать maven-проект (maven-test)
далее вводим команды 
~~~
mvn archetype:generate
~~~
в проекте на семинаре нажимали enter
'groupId': ru.muzkat  - название компании
'artifactId': maven-test - название проекта
'version' 1.0-SNAPSHOT:
'package' ru.muzkat:

pom.xml - всегда располагается в корне проекта!
в файле pom.xml в блоке можно заменить
~~~
<maven.compiler.source>20</maven.compiler.release>
<maven.compiler.target>20</maven.compiler.target>
~~~
 на
~~~
<maven.compiler.release>20</maven.compiler.release>
~~~
зависимости в проекте скачиваются с mavencentral
запуск .jar-файла из консоли
~~~
java -jar .\target\maven-test-1.0-SNAPSHOT.jar
~~~

## 2. Запуск gradle-проекта

Сначала устанавливаем gradle
После установки maven переходим в терминал и вводим команду
~~~ 
gradle -v
~~~

если в терминале выводится версия gradle - значит, все установлено!
далее переходим в папку, из которой будем в интерактивном режиме собирать gradle-проект (gradle-test)
далее вводим команды 

~~~ 
gradle init
~~~


В интерактивном режиме выбираем:
Select type of project to generate:
> 2: application

Select implementation language:

> 3: Java

Generate multiple subprojects for application? no

Select build script DSL:
> 1: Kotlin

Select test framework:

> 4: JUnit Jupiter

Project name (default: gradle-test):  
Enter target version of Java (min. 7) (default: 21): 

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) 
> yes

файл build.gradle.kts также должен быть расположен в корне проекта
после сборки проекта IJ предлагает связать новый проект с файлом build.gradle.kts 
(переходим по ссылке и выбираем build.gradle.kts) -> OK
дожидаемся, когда gradle соберет проект, и далее можно зайти в build.gradle.kts  
по ссылке выбрать application (это и есть наши зависимости в проекте, их можно дополнять и менять)
запускаем сборку проекта 
~~~
gradle build
~~~