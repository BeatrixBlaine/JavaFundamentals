public class PassByValue {

    public static int changeNumber(int value) {
        return value = 10;
    }

    public int changeValue(int value) {
        return value = 5;
    }

    public static void main(String[] args) {
        int number = 20;
        System.out.println(number);

        // static
        int result = changeNumber(number);
        System.out.println(result);

        // non static
        PassByValue obj = new PassByValue();
        int result2 = obj.changeValue(number);
        System.out.println(result2);
    }
}
