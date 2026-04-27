package finalClass;

public class SocialMediaApp {
    public static void main(String[] args) {
        Facebook person = new Facebook("Irsyad", "12345");
        Facebook person1 = new Facebook("Sarah", "12345");
        System.out.println(person);
        System.out.println(person1);
        person.login();
        person1.login();

        // Calling inner class with obj instance
        SocialMedia.Content obj = person.new Content();
        obj.setStory("this is your the story!");
        obj.showStory(person);
        obj.showStory(person1);
    }
}
