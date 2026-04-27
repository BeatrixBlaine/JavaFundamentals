package StaticKeyword;

public class CountryApp {

    public static void main(String[] args) {

        // static variable can be called without creating an object
        System.out.println(Country.COUNTRY);
        System.out.println(Country.PROVINCE);
        // static method from class MathUtil
        System.out.println(MathUtil.sum(1,2));
        // static block
        System.out.println(StaticKey.PROCESSORS);

    }
}