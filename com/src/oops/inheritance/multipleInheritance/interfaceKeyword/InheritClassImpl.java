package oops.inheritance.multipleInheritance.interfaceKeyword;

public class InheritClassImpl implements InterfaceParent1, InterfaceParent2 {

    @Override
    public void show1() {
        System.out.println("implementation of show 1");
    }

    @Override
    public void show2() {
        System.out.println("implementation of show 2");
    }

    public static void main(String[] args) {
        InheritClassImpl ic = new InheritClassImpl();
        ic.show1();
        ic.show2();
    }
}
