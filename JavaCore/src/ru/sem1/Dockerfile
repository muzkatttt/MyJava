FROM bellsoft/liberica-openjdk-alpine:11.0.16
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/sem1/sample/Main.java
CMD java -classpath ./out ru.sample.ru.sem1.Main