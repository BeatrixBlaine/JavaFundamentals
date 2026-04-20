public class PolymorphismApp {

    public static void main(String[] args) {

//        Polymorphism obj = new Polymorphism("Icad");
//        obj.sayHello("Sarah");
//
//        obj = new PolymorphismChild("Icad");
//        obj.sayHello("Dina");
//
//        obj = new PolymorphismNiece("Icad");
//        obj.sayHello("Aliyya");
//

        Polymorphism[] obj = {
                new Polymorphism("Icad"),
                new PolymorphismChild("Icad"),
                new PolymorphismNiece("Icad")
        };

        for (Polymorphism c : obj) {
            c.sayHello("Dina");
        }
    }

}
