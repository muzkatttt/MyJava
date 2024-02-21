### План работы на семинаре 5 Java Junior
Для запуска проекта чат-сервера необходимо сначала настроить проект таким образом, чтобы два модуля
взаимодействовали между собой (клиент и сервер). Для этого в папке с проектом создаем два модуля:
New -> New Module, задаем имя (chat-server или chat-client), location (текущая папка), 
ЯП Java, build system Maven. 
В Advanced settings выбираем groupId (ru.gb.javaJunior) и artifactId (chat-server / chat-client).
После того, как создали два модуля в основных вкладках Build -> Build Project (в директории появятся два файла .iml).
Далее в директории chat-client (chat-client/src/main/java) создаем пакет ru.gb.junior.chat.client, 
то же самое проделываем для пакета ru.gb.junior.chat.server.
В каждом пакете создаем точку входа (Main, Program ...)
~~~
public class Program {
public static void main(String[] args) {
    System.out.println("Привет, сервер!");
    }
}
~~~
Далее создаем config по наименованию типа
Run/Debug Configurations -> даем имя (Server-Program или Client-Program) ->
сохраняем файл проекта (Store as project file) и сохраняем его в папку .config в самом проекте ->
настраиваем версию java, задаем путь к точке входа в данном модуле (ru.gb.junior.chat.server.Program) ->
-cp chat-server -> working directory (выбираем текущую) -> allow profiles in Run Configurations (ставим галку V) ->
apply.
То же самое сделать для Client-Program, только Client-Program скопировать еще пару конфигов, 
чтобы в Applications добавилось 4 конфига (один Server-Program и три Client-Program), далее пробуем запустить config-файлы для клиента и для сервера.
Чтобы создать несколько копий для чата клиента, необходимо в Edit Configurations 
выбрать Compound (Edit Configurations -> Applications -> добавить новый конфиг Compound -> name ChatDemo -> 
store as project и сохраняем в папку .config).
Compound позволит продемонстрировать работу чата (сервер + клиенты).
В конфиг Compound добавить уже имеющиеся в рамках проекта скопированные конфиги Client-Program, Client-Program-2,
Client-Program-3 и Server-Program -> apply -> ok.
Для целей отладки работы приложения задать две точки остановы в классе Program 
(можно в строке приветственного сообщения).