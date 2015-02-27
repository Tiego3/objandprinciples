package za.ac.cput.objandprinciples.encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class Vehicle {
    private String brand;
    private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
