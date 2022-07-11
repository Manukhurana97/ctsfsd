package DesignPatters;

public class Client{
  public static void main(String args[]){
    EagerSingleton registery = EagerSingleton.getInstance();
    EagerSingleton registery2 = EagerSingleton.getInstance();
      System.out.println(registery == registery2);
    
    LazySingleton lregistery = LazySingleton.getInstance();
    LazySingleton lregistery2 = LazySingleton.getInstance();
    
    System.out.println(lregistery == lregistery2);
  }
}
  
