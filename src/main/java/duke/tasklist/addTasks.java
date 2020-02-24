package duke.tasklist;
import duke.parser.Parser;
import duke.tasks.Deadline;
import duke.tasks.Event;
import duke.tasks.Task;
import duke.tasks.Todo;
import java.time.LocalDate;
import java.util.ArrayList;

public class addTasks extends TaskList {
    public addTasks() {
        super();
    }
    public static void execute(ArrayList<Task> taskList, String ogString, String taskType) {
        String[] taskDetails = Parser.returnStringToAdd(ogString, taskType);
        if (taskType.equals("todo")) {
            String description = taskDetails[1];
            Todo e = new Todo(description.trim());
            taskList.add(e);
        } else {
            String description = taskDetails[0];
            String date = taskDetails[1];
            LocalDate dateTask = LocalDate.parse(date);
            if (taskType.equals("event")) {
                Event t = new Event(description, dateTask);
                taskList.add(t);
            } else {
                Deadline t = new Deadline(description, dateTask);
                taskList.add(t);
            }


        }
    }
}

