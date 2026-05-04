package Application;

public class NumberClass {
    public static void main(String[] args) {

        // reference Data Type
        Integer intValue = 10;
        // Casting reference
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        // Casting to primitive
        double value = doubleValue;

        System.out.println(longValue);
        System.out.println(value);

        // Cast String to Integer reference
        String example = "10000";
        Integer number = Integer.valueOf(example);
        System.out.println(number);

        // Cast Integer reference to String
        Integer value1 = 1000;
        String value2 = String.valueOf(value1);
        System.out.println(value2);

        // Cast String to int primitive
        String x = "100";
        int y = Integer.parseInt(x);
        System.out.println(y);
    }
}
