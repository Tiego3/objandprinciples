package za.ac.cput.objandprinciples;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.objandprinciples.inheritance.Transport;
import za.ac.cput.objandprinciples.inheritance.transImplement.TransImplPassengers;

/**
 * Created by student on 2015/02/26.
 */
public class TestTransImplPassengers extends TransImplPassengers {
    Transport car;

    @Before
    public void setUp() throws Exception {
        car = new TransImplPassengers();
    }

    @Test
    public void testCar() throws Exception {
        Assert.assertEquals(5,car.Trans(5));
    }

}
