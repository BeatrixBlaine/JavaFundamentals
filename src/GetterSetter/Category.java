package GetterSetter;

public class Category {

    private String id;
    private String name;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null){
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
