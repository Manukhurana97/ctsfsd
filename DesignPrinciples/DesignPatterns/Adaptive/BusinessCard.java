package DesignPattern;

/**
 * Client code which require customer interface
 * */
public class BusinessCard {

    public String printCard(ICustomer customerInfo){
        String card = "";
        card+= customerInfo.getName();
        card+="\n"+customerInfo.getEmail();
        card+="\n"+customerInfo.getTitle();
        return card;
    }
}
