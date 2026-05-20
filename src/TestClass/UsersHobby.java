package TestClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsersHobby {

    private String name;
    private List<String> hobbies;

    public UsersHobby(){
    }

    public UsersHobby(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies); // Immutable, so other method cannot modify the value
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void printData(){
        System.out.println("Name : " + getName());
        String result = String.join(", ", getHobbies());
        System.out.println("Hobbies : " + result);
    }

    @Override
    public String toString() {
        return name + " : " + hobbies;
    }
}
