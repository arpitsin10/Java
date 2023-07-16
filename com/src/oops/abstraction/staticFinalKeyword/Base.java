package oops.abstraction.staticFinalKeyword;

abstract class Base {
    static void fun(){
        System.out.println("You are in static method fun() of class Base");
    }

    final void fun1(){
        System.out.println("you are in final method fun1() of class Base");
    }
}
