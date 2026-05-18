public class Person {

    // declare variable to be modified by PersonApp
    String name;
    String address;
    int age;
    int phone;
    final String country = "Indonesia";

    public Person(){
    }

    public Person(String name, int age, String address, int phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    // create a method to be called by PersonApp
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }

}
