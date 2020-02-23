package duke.tasklist;

import duke.tasks.Task;

import java.util.ArrayList;

public class deleteTasks extends TaskList {
    public deleteTasks(){
        super();
    }
    /**
     * Deletes the task at index taskNumber from the tasklist
     *
     * @param taskList Tasklist of all available tasks
     * @param ogString The index of the task we are trying delete
     */
    public static void execute(ArrayList<Task> taskList, String ogString) {
        String[] words = ogString.split(" ");
        int taskNumber = Integer.parseInt(words[1].trim()) - 1;
        Task task = taskList.get(taskNumber);
        String description = task.getDescription();
        String statusIcon = task.getStatusIcon();
        String typeIcon = task.getTypeIcon();
        System.out.println("Cool, we will remove the following task:");
        System.out.println(typeIcon + " [" + statusIcon + "] " + description);
        taskList.remove(taskNumber);
        System.out.println("Now you have " + Integer.toString(taskList.size()) + " items in your list");
    }
}
