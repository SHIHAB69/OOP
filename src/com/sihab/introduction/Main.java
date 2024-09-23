package src.com.sihab.introduction;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = student1;

        System.out.println(student2.name);


    }
public static class Student{
        String name;
        int rno;
        float marks;

    Student(){
        this("Sihab",203,100.5f);
    }

    Student(String name, int rno, float marks){
                this.name = name;
                this.rno= rno;
                this.marks = marks;
        }
}

}