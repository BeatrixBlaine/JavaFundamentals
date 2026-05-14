package Generic;

public class PersonGeneric implements Comparable<PersonGeneric> {

    private String name;
    private String address;

    public PersonGeneric(String name, String address) {
        this.name = name;
        this.address = address;
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

    @Override
    public int compareTo(PersonGeneric o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "PersonGeneric{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
