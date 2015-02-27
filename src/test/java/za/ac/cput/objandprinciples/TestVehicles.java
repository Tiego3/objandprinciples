package za.ac.cput.objandprinciples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.objandprinciples.polymorphism.Passengers;
import za.ac.cput.objandprinciples.polymorphism.Vehicles;

/**
 * Created by student on 2015/02/27.
 */
public class TestVehicles {

    Vehicles v;
    Passengers p;

    @Before
    public void setUp() throws Exception {
            v = new Vehicles("bmw","car");
            p = new Passengers("myciti","bus",50);
    }

    @Test
    public void testName() throws Exception {
        p.print();
    }
}
