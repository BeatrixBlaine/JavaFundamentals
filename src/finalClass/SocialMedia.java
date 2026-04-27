package finalClass;

public class SocialMedia {
    private String name;
    private String password;

    public SocialMedia(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // make getter, because my variable is private
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // Inner Class
    public class Content {
        private String story;

        public String getStory() {
            return story;
        }

        public void setStory(String story) {
            this.story = story;
        }

        public void showStory(SocialMedia user) {
            System.out.println(user.getName() + ", " + getStory());
        }
    }
}

// final class cannot have a child
// this is an example of final class usage
final class Facebook extends SocialMedia {

    public Facebook(String name, String password) {
        super(name, password);
    }

    // overiding toString method, and make it final.
    @Override
    final public String toString() {
        return "Username: " + getName() + ", Password: " + getPassword();
    }

    public void login() {
        System.out.println("The user is logged in: " + getName());
    }

}
