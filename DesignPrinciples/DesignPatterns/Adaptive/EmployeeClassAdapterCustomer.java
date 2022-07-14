package DesignPattern;

/**
 * A class adapter, works as two-way adapter
 * */
public class EmployeeClassAdapterCustomer extends Employee implements ICustomer {
    @Override
    public String getName() {
        return this.getFirstName() + "" + this.getLastName();
    }

    @Override
    public String getTitle() {
        return this.getDesignation();
    }


    @Override
    public String getEmail() {
        return this.getFirstName() + "." + this.getLastName() + "@gmail.com";
    }
}
