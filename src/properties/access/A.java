package src.properties.access;

public class A {
   private int num;
    String name;
    int[] arr;

    int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num  = num;
    }


    public A(int num, String name ){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
