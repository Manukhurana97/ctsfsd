package DesignPattern;

public class Client {

    public static void main(String[] args) {
        /** Using class / Two was adapter*/
        EmployeeClassAdapterCustomer employeeAdapterCustomer = new EmployeeClassAdapterCustomer();
        populate(employeeAdapterCustomer);

        BusinessCard businessCard = new BusinessCard();
        String card = businessCard.printCard(employeeAdapterCustomer);
        System.out.println("card" + card);
        System.out.println("*****************************************");

        /** Using Object Apdapter*/
        Employee employee = new Employee();
        populate(employee);
        EmployeeObjectAdapterCustomer employeeObjectAdapterCustomer = new EmployeeObjectAdapterCustomer(employee);

        BusinessCard businessCard1 = new BusinessCard();
        String card1 = businessCard.printCard(employeeAdapterCustomer);
        System.out.println("card" + card1);
    }

    public static void populate(Employee employee) {
        employee.setFirstName("abc");
        employee.setLastName("def");
        employee.setDesignation("SDE2");
        employee.setEmployee("Atlassian");
    }
}
