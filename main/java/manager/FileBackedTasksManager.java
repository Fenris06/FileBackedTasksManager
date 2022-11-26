package manager;

import tasks.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(CSVTaskConverter.getHeader() + "/n");                   // try (BufferedReader writer =
            for (Task task : tasks.values()) {
                writer.write(CSVTaskConverter.toString(task) + "/n");
            }
            for (Task task : epics.values()) {
                writer.write(CSVTaskConverter.toString(task) + "/n");
            }
            for (Task task : subTasks.values()) {
                writer.write(CSVTaskConverter.toString(task) + "/n");
            }
            writer.write("/n");
            writer.write(CSVTaskConverter.historyToString();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // writer.write(CVSTaskConverter.getHeader()
        // Пишем в файл перенос строки - writer.newLine()
        // Сериализация и запись тасков
        // По очереди проходим в цикле for каждую мапу с таскми
        // Записываем новую строку. (перенос пустой строки)
        // Сериализуем историю
        // CSVTaskConverter.historyToString

    }
}
