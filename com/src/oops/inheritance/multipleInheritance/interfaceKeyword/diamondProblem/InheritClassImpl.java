package oops.inheritance.multipleInheritance.interfaceKeyword.diamondProblem;

public class InheritClassImpl implements InterfaceParent2, InterfaceParent3{

    public static void main(String[] args) {
        InheritClassImpl ic = new InheritClassImpl();
        ic.show();
    }
}
