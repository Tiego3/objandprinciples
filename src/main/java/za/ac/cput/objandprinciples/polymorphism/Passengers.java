package za.ac.cput.objandprinciples.polymorphism;

/**
 * Created by student on 2015/02/27.
 */
public class Passengers extends Vehicles{

    private int passengers;

    public Passengers(String name, String type,int passengers) {
        super(name, type);
        setPassengers(passengers);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void print(){
        System.out.print(getName()+" "+getType()+" "+getPassengers());
    }
}
