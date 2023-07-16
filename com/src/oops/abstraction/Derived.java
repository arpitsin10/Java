package oops.abstraction;

public class Derived extends Base{
    @Override
    void fun() {
        System.out.println("You are in fun() of Derived class");
    }

    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.fun();
        d1.fun1();
    }
}

