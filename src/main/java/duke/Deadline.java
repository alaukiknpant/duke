package duke;

public class Deadline extends Task {

    public Deadline(String description) {
        super(description);
    }

    @Override
    public String getTypeIcon() {
        return ("[D]");
    }


}