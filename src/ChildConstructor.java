public class ChildConstructor extends SuperConstructor {

    ChildConstructor(String age) {
        super(age);
    }

    void displayAge() {
        System.out.println(age);
    }

}
