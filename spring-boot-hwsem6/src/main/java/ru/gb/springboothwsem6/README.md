## Домашнее задание к семинару 6 (Spring)
1. Подключить swagger для вашего проекта с книгами.
2. Запустить проект и открыть страницу http://localhost:8080/v3/api-docs
3. Сохранить текст в файл, отформатировать в читаемый
4. Файл загрузить файл в гит репозиторий (не обязательно пустой репозиторий, можно и с проектом)
и ссылку на файл прислать в качестве ответа на дз.

Дополнительное:
1. Пофантазировать на тему какое api будет у проекта для создания заметок.
Сущности используемые в проекте: заметки, теги, пользователь(автор).

У проекта для созданичя заметок api будет схож с api проекта нашей библиотеки, и будет включать:  
- общую информацию: название, адрес сервера, 
- методы работы при запросе данных для всех сущностей заметки, теги и автор заметок.
- для каждой сущности также будут созданы репозитории, в которых созданы методы работы с полями классов, 
сервисный слой - который будет вызывать методы работы из репозиториев,
и контроллеры - для объединения отдельных частей обработки запроса API в единый механизм. 
В контроллерах создаются маршруты для обработки запросов и генерации ответов.
Таким образом создается многослойное приложение и изоляция сущностей.
При подключении к проекту swagger (по адресу: http://localhost:8080/swagger-ui/index.html) 
будут доступны методы get, post, delete, get/{id} для заметок и тегов. Считаю, что метод delete применим только 
для заметок, и не применим для тегов и автора, так как при удалении автора или тега смысл 
в сохранении самой заметки пропадает.
- для каждой сущности будут доступны схемы, в которых указаны названия палей и их тип. 

2. Попробовать в обычном текстовом файле описать api в формате 
"GET /user/{id} - получить пользователя по ID"
~~~json
"/user/{id}":{
    "get": {
        "tags": [
            "user-controller"
        ],
        "operationId": "findById",
        "parameters": [
            {
                "name": "id",
                "in": "path",
                "required": true,
                "schema": {
                    "type": "integer",
                    "format": "int64"
                }
            }
        ],
        "responses": {
            "200": {
                "description": "OK",
                "content": {
                    "*/*": {
                        "schema": {
                            "$ref": "#/components/schemas/User"
                        }
                    }
                }
            }
        }
~~~
4. Прикрепить файл в тот же репозиторий. Дополнительно в ответе указать ссылку на этот текстовый файл

