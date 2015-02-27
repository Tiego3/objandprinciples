package za.ac.cput.objandprinciples.polymorphism;

/**
 * Created by student on 2015/02/27.
 */
public class Vehicles {
    private String name;
    private String type;

    public Vehicles(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
