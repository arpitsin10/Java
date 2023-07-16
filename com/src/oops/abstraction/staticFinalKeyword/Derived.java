package oops.abstraction.staticFinalKeyword;

public class Derived extends Base{
    public static void main(String[] args) {
        Base.fun();
        Derived d1 = new Derived();
        d1.fun1();
    }
}
