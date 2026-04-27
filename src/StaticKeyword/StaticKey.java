package StaticKeyword;

public class StaticKey {

    public static final int PROCESSORS;

    static {
        System.out.println("Access Static Key Class");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
