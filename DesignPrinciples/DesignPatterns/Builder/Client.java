package DesignPattern;

public class Client {

    public static void main(String[] args){ 
        Address address = Address.builder().setStreet("14 avanue").setCity("cleveland").setState("ohio").setCountry("USA").build();
        User user = User.builder().setName("ABC").setAge(10).setAddress(address).build();

        System.out.println(user.toString());
     }
}
