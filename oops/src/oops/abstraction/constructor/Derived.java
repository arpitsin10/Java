package oops.abstraction.constructor;

public class Derived extends Base{
    Derived(){
        System.out.println("You are in constructor of Derived class");
    }
    @Override
    void fun() {
        System.out.println("You are in fun() method of Derived class");
    }
}
