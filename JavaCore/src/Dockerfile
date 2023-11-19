FROM bellsoft/liberica-openjdk-alpine:16.0.2
COPY . ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/sem1/sample/Main.java
CMD java -classpath ./out ru.sem1.sample.Main