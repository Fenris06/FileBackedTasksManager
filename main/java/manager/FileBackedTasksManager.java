package manager;

import java.io.File;

public class FileBackedTasksManager extends InMemoryTaskManager {
    private File file;

    public FileBackedTasksManager(File file) {
        this.file = file;
    }

    public static FileBackedTasksManager loadFromFile(File file) {
        // Создать через конструктор FileBackedTasksManager
        // Обернем все в try, пы таясь поймать IOException
        // Прочитать из файла содержимое

        int generatorId = 0;
        // В цикле проходим все строки
        // Десереализуем таски из строки, например если получили Task task = ...
        // Если task.id > generatorId, то generatorId = task.id
        // Если мы наткнулись на пустую строку, то это - история, тогда парсим ее

        // Привязать сабтаски и эпики
        // Проходимся по сабтаскам и связываем с эпиком

        // дообработать историю
        // Пройти список айдишников из десериализованной истории и подобовлять в историю с помощью
        // уже существующего метода HistoryManager.add()

        // Не забываем привязать новый generatorId

        return null;

    }

    public void save() {
        // try (BufferedReader writer =
        // writer.write(CVSTaskConverter.getHeader()
        // Пишем в файл перенос строки - writer.newLine()
        // Сериализация и запись тасков
        // По очереди проходим в цикле for каждую мапу с таскми
        // Записываем новую строку. (перенос пустой строки)
        // Сериализуем историю
        // CSVTaskConverter.historyToString

    }
}
