package duke;

public class UiGUI {
    public UiGUI() {
    }

    /**
     * Prints that a bad date/time was found
     */
    public static String badDateLoaded() {
        return "Invalid date/time format encountered";
    }

    /**
     * Prints the error
     */
    public static String Error() {
        return("An error occurred");
    }

    /**
     * Prints the error with the exception message
     *
     * @param e the Exception that was thrown
     */
    public static String Error(Exception e) {
        return("An error occurred" + e.getMessage());
    }

    private String printLines() {
        return("____________________________________________________________");
    }

    /**
     * Tells the user that he has entered in valid query for the specified type
     *
     * @param taskType string, the type of task
     */
    public String showError(String taskType) {
        return this.printLines() + "☹ OOPS!!! The description of a " + taskType
                + " cannot be empty." + this.printLines();
    }

    /**
     * Tells the user the number of tasks left
     *
     * @param i the number of tasks left
     */
    public String showNumTasks(int i) {
        return this.printLines() + "Now you have " + i + " tasks in the list." + this.printLines();
    }

    /**
     * Sends the user a welcome message
     */
    public String hello() {
        String logo =
                "___________  __________  __________  ||   \n"
                        + "|         | |         | |         |  ||      \n"
                        + "-----------  ---------- ----------   ||  \n"
                        + "    ||         ||          ||        ||       \n"
                        + "    ||         ||          ||        ||           \n"
                        + "    ||         ||          ||        ||           \n"
                        + "    ||         ||          ||        ||       \n"
                        + "    ||      __________  __________   ||      \n"
                        + "    ||      |         | |         |  ______ \n"
                        + "    ||      ----------  ----------   ______    \n";
        return this.printLines() + ("Hello! I'm \n" + logo) + "What can I do for you?" + this.printLines();
    }

    /**
     * says Goodbye to the user
     */
    public String goodbye() {
        return("Bye. Hope to see you again soon!");
    }

    /**
     * Notifies the user the tasks in list and the number of tasks
     *
     * @param tasks the TaskList of tasks
     */
    public String tasksInList(TaskList tasks) {
        String Total = this.printLines();
        Total += "Here are the tasks in your list:";
        int i = 1;
        for (Task t : tasks.getList()) {
            Total += (String.valueOf(i) + "." + t.toString());
            i++;
        }
        Total += this.printLines();
        return Total;
    }

    /**
     * Notifies the user that a task has been marked as done
     *
     * @param item the item marked as done
     */
    public String taskDone(Task item) {
        return this.printLines() + "Nice! I've marked this task as done:"
                + item.toString() + this.printLines();
    }

    /**
     * Notifies the user that a task has been unmarked
     *
     * @param item the item that has been unmarked
     */
    public String taskUndone(Task item) {
        return this.printLines() + ("OK, I've marked this task as not done yet:")
                + (item.toString())  + this.printLines();
    }

    /**
     * Notifies the user that a task has been added
     *
     * @param item  the item that has been added
     * @param tasks the TaskList containing the tasks
     */
    public String taskAdd(Task item, TaskList tasks) {
        return this.printLines() +  ("Got it. I've added this task:") + (item.toString())
                + ("Now you have " + tasks.getList().size() + " tasks in the list.") + this.printLines();
    }

    /**
     * Notifies the user that a task has been deleted
     *
     * @param item  the item that has been deleted
     * @param tasks the TaskList
     */
    public String taskDelete(Task item, TaskList tasks) {
        return this.printLines() + ("Noted. I've removed this task:")
                + (item.toString()) + ("Now you have "
                + tasks.getList().size() + " tasks in the list.")  + this.printLines();
    }

    /**
     * Prints that an unrecognised command was found
     */
    public String unrecognisedCommand() {
        return ("____________________________________________________________")
                + " ☹ OOPS!!! I'm sorry, but I don't know what that means :-("
                + ("____________________________________________________________");
    }

    public String printMatchingTasks(TaskList tasks, String query) {
        String total = this.printLines();
       total += ("Here are the matching tasks in your list:");
        int i = 1;
        for (Task t : tasks.getList()) {
            if (t.toString().contains(query)) {
                total += (i + "." + t);
                i++;
            }
        }
        total += this.printLines();
        return total;
    }

}
