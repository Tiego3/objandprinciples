package za.ac.cput.objandprinciples;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.objandprinciples.encapsulation.Vehicle;

/**
 * Created by student on 2015/02/26.
 */
public class TestEncapsulation {

    Vehicle newVehicle;

    @Before
    public void setUp() throws Exception {
        newVehicle = new Vehicle();
        newVehicle.setBrand("BMW");
        newVehicle.setModel("Z3");
    }

    @Test
    public void testVehicle() throws Exception {
        Assert.assertEquals("BMW",newVehicle.getBrand());
        Assert.assertEquals("Z3",newVehicle.getModel());

    }
}
