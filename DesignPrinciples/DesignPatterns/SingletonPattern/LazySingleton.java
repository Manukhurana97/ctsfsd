package DesignPattern;

public class LazySingleton(){
  private static LazySingleton(){}
  
  private static volatile LazySingleton INSTANCE;// to avoid cpu cache 
  
  public static LazySingleton getInstance(){
    if(INSTANCE==null) {
      synchronized(LazySingleton.class){
         if(INSTANCE==null) {
          INSTANCE = new LazySingleton();
         
         }
      }
    }
    return INSTANCE;
  }
}
