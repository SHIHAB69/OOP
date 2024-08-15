public class Constructor {
    public static void main(String[] args) {
     Students st1 = new Students(31, 21);

    }
}

class Students{

    int id;
    int age;

    Students(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("Called");
    }


}
