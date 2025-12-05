import java.util.Date;

public class Homework {
    private String courseName;
    private String description;
    private Date dueDate;

    public Homework(String courseName, String description, Date dueDate) {
        this.courseName = courseName;
        this.description = description;
        this.dueDate = dueDate;
    }

    public void printInfo() {
        System.out.println("--- Homework Details ---");
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Description: " + this.description);
        System.out.println("Due Date: " + this.dueDate);
    }
}