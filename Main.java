import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Student[] student = new Student[5];

        Student shihab = new Student();
        shihab.greeting();

        System.out.println(shihab.name);
        System.out.println(shihab.roll);
        System.out.println(shihab.mark);

    }
}


class Student{
        int roll;
        String name;
        float mark;

        void greeting(){
            System.out.println("Greeting");
        }

        Student(){
            this.roll = 12;
            this.name = "Sihab";
            this.mark = 98.3f;
        }

    }
