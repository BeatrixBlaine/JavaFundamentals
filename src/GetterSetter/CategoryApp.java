package GetterSetter;

public class CategoryApp {

    public static void main(String[] args) {

        Category obj = new Category();
        obj.setId("1");
        obj.setName("Icad");
        obj.setExpensive(true);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.isExpensive());

    }

}
