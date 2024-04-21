Запустить контйнер для prometheus
- docker run -d -p 9090:9090 -v /Users/ekaterinarodionova/Desktop/MyJava/spring-boot-lesson-11/src/main/resources/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
Запустить контейнер для grafana
- docker run -d -p 3000:3000 grafana/grafana
