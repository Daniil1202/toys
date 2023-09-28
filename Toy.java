package toy;

public class Toy {


    private int id;
    private String name;


    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

