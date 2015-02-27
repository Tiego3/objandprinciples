package za.ac.cput.objandprinciples.softwareprincipalsTests.srp.violation;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.objandprinciples.softwareprincipals.srp.violation.EmpImplimentation;
import za.ac.cput.objandprinciples.softwareprincipals.srp.violation.Employee;

/**
 * Created by student on 2015/02/27.
 */
public class TestEmployee extends TestCase{
    Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new EmpImplimentation();

    }

    @Test
    public void testEmployee() throws Exception {
       assertEquals((5.00*12.00),emp.annualSalary(5));
    }
}
