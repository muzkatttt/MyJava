package ru.sem1.sample;

import ru.sem1.regular.Decorator;
import ru.sem1.regular.OtherClass;

/**
 * https://www.docker.com/products/docker-desktop/
 *  https://hub.docker.com/
 * cd C:\sources\gb\coreV2\group2\lesson1\out\artifacts\lesson1_jar
 * java -jar lesson1.jar
 * cd C:\sources\gb\coreV2\group2\lesson1\src\main
 * javac -sourcepath ./java -d out java/ru/geekbrains/lesson1/sample/Main.java
 * java -classpath ./out ru.geekbrains.lesson1.sample.Main
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 *
 * FROM bellsoft/liberica-openjdk-alpine:11.0.16
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/geekbrains/lesson1/sample/Main.java
 * CMD java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 * > docker build . -t mycalcapp:v1
 *
 *
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(5, 5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(5, 5);
        System.out.println(Decorator.decorate(result));
    }
}
