import java.util.Date;
public class TestHomework {
    public static void main(String[] args) {
        Date deadline = new Date();

        Homework myHomework = new Homework(
                "SENG 211 - OOP",
                "Prepare a slide about Array vs ArrayList and Date class",
                deadline
        );
        myHomework.printInfo();
    }
}