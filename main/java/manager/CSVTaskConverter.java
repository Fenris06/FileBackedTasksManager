package manager;

import tasks.Task;
import tasks.TaskType;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CSVTaskConverter {

    public static String getHeader() {
        String getHeader = "id,type,name,status,description,epic";
        return getHeader;
    }

    public static String toString(Task task) {
        String toString =
                Integer.toString(task.getId())
                        + ","
                        + TaskType.valueOf(task.getName().toUpperCase().substring(0, 4))
                        + ","
                        + task.getName()
                        + ","
                        + task.getStatus()
                        + ","
                        + task.getSpecification()
                        + ","
                        + task.getEpicId();

        return toString;
    }

    public static Task fromString(String value) {
        return null;
    }

    public static String historyToString(HistoryManager manager) {
        List<Task> history = new ArrayList<>(manager.getHistory());
        String historyToString = "";
        for (Task task : history) {
            historyToString = String.valueOf(task.getId()) + ",";
        }

        return historyToString;
    }

    public static List<Integer> historyFromString(String value) {
        return null;
    }

}

