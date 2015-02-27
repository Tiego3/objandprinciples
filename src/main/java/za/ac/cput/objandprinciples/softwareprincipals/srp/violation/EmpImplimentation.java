package za.ac.cput.objandprinciples.softwareprincipals.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class EmpImplimentation implements Employee {
    @Override
    public String employeeNo(String empNo) {
        return empNo;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public double annualSalary(double annSal) {
        return annSal*12;
    }
}
