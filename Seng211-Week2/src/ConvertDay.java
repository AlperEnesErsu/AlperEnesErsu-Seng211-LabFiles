import java.util.Scanner;
public class ConvertDay {
    static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter  a number between 1 and 7: ");
        int num = kb.nextInt();

        if (num == 1){
            System.out.println("Day: Monday");
        } else if (num == 2) {
            System.out.println("Day: Tuesday");
        } else if (num == 3) {
            System.out.println("Day: Wedbesday");
        } else if (num == 4) {
            System.out.println("Day: Thursday");
        } else if (num == 5) {
            System.out.println("Day: Friday");
        } else if (num == 6) {
            System.out.println("Day: Saturday");
        } else if (num == 7) {
            System.out.println("Day: Sunday");
        }else{
            System.out.println("Invalid value! Please enter 1-7.");
        }
    }
}
