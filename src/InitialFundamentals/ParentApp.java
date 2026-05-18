package InitialFundamentals;

public class ParentApp {

    public static void main(String[] args) {

        // example of variable hiding
        Child child = new Child();
        child.name = "Sarah";
        child.doIt();
        System.out.println(child.name);

        // calling method from child, because the object is InitialFundamentals.Child()
        Parent parent = (Parent) child;
        parent.name = "Icad";
        parent.doIt();
        System.out.println(parent.name);
    }
}
