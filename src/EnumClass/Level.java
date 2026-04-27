package EnumClass;

public enum Level {

    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    // constructor
    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
