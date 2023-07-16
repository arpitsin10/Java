package oops.inheritance.constructor.superkeyword;

public class Derived extends Base {
    int y;
    Derived(int x1, int y1){
        super(x1);
        y =y1;
    }

    public void display(){
        System.out.println("Value of x: "+x+", Value of y: "+y);
    }

    public static void main(String[] args) {
        Base d = new Derived(10, 20);
        d.display();
    }
}
