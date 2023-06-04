package oops.inheritance.constructor;

public class Apple extends Fruits{
    Apple() {
        System.out.println("This is apple constructor");
    }

    public static void main(String[] args) {
        Apple a1 = new Apple();
    }
}