package za.ac.cput.objandprinciples.softwareprincipalsTests.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.objandprinciples.softwareprincipals.ocp.correction.Mark;

/**
 * Created by student on 2015/02/27.
 */
public class TestStudent {

    Mark m;

    @Before
    public void setUp() throws Exception {
        m = new Mark();
    }

    @Test
    public void testStudentMark() throws Exception {
        Assert.assertEquals(10,m.studentMark(10));
    }

}
