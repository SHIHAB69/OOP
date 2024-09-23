public class SingleInheritance {
    public static void main(String[] args) {
    hr bj = new hr();
    bj.salary();
    System.out.println();
    bj.bonus();
    }
}


class Employee{
    void salary(){
        System.out.println("Salarr: 09000");
    }
}

class hr extends Employee{
    void bonus(){
        System.out.println("Bonus: 1000");
    }
}