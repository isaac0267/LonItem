public class Item {
    //attributes
    private int id;
    private String type;
    private String title;

    //contructors
    public Item(int id, String type, String title) {
        this.id=id;
        this.type=type;
        this.title=title;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return id + " " + type + " " + title;
    }


}
