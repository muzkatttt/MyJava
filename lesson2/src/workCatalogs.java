import java.io.File;

public class workCatalogs {
    public static void main(String[] args) {
        // работа с файловой системой. Каталоги
        String pathProject = System.getProperty("user.dir"); // прописываем путь к каталогу
        String pathDir = pathProject.concat("/files"); // указываем путь к папке в каталоге
        File dir = new File(pathDir); // связываем переменную dir с новой папкой в текущем каталоге
        System.out.println(dir.getAbsolutePath()); // выводим на печать абсолютный путь к каталогу
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            // функция list возвращает массив файлов и подкаталогов, которые находятся в каталоге
            System.out.println(fname);
        }
    }
}
 /*
Логирование
import java.util.logging.*;
    public class workCatalogs {
        public static void main(String[] args) {
            Logger logger = Logger.getLogger(workCatalogs.class.getName());
            logger.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логирование");
        }

import java.util.logging.*;
public class workCatalogs {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}


Использование
Logger logger = Logger.getLogger()
Уровни важности
INFO, DEBUG, ERROR, WARNING и др.
Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);
Формат вывода: структурированный, абы как*
XMLFormatter, SimpleFormatter
  */
