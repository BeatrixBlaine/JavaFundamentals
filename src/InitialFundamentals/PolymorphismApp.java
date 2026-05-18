package InitialFundamentals;

public class PolymorphismApp {

    public static void main(String[] args) {

//        InitialFundamentals.Polymorphism obj = new InitialFundamentals.Polymorphism("Icad");
//        obj.sayHello("Sarah");
//
//        obj = new InitialFundamentals.PolymorphismChild("Icad");
//        obj.sayHello("Dina");
//
//        obj = new InitialFundamentals.PolymorphismNiece("Icad");
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
