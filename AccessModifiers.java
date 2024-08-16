public class AccessModifiers {
    public static void main(String[] args) {
    Studentt obj = new Studentt();
    obj.setName("Sihab");
    obj.setAge(22);
    obj.setRoll(123);
        System.out.println(obj.getName());
        System.out.println(obj.getRoll());
        System.out.println(obj.getAge());



    }
}

 class Studentt{
    private String name;
    private int age;
    private int roll;

    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRoll(int roll){
        this.roll = roll;

    }
    public void setAge(int age){
        this.age = age;
    }

 }

