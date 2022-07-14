package DesignPattern;

/**
 * A class adapter, works as two-way adapter
 * */
public class EmployeeObjectAdapterCustomer implements ICustomer {

    private Employee employeeAdaptee;

    public EmployeeObjectAdapterCustomer(Employee employeeAdaptee) {
        this.employeeAdaptee = employeeAdaptee;
    }

    @Override
    public String getName() {
        return employeeAdaptee.getFirstName() + "" + employeeAdaptee.getLastName();
    }

    @Override
    public String getTitle() {
        return employeeAdaptee.getDesignation();
    }


    @Override
    public String getEmail() {
        return employeeAdaptee.getFirstName() + "." + employeeAdaptee.getLastName() + "@gmail.com";
    }
}
