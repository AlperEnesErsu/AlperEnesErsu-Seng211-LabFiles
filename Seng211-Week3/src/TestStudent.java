public class TestStudent {
    static void main() {
        Student s = new Student();

        System.out.println(s.age);
        System.out.println(s.name);

        s.age = 15;
        s.name = "Ayşe";
        s.gender = 'f';
        s.isJunior = true;

        System.out.println(s.age);
        System.out.println(s.name);
        s.info();
    }
}
