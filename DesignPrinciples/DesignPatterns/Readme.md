There are 26 type of Design patterns divided into 3 types
 
1. Creational : Deals with the process of creation of object and classes. | eg. Builder, Singleton, Simple Factory, Factory Method, Prototype, Abstract Factory, Object                                                                                  Pool
2. Structural : Deals with how classes and objects are arrange or structures. | eg. 
3. Behavioral : Deals with how clases and object intract with each other. | eg.   

<br>
<br>


<B>1. BUILDER Design Pattern:</B> </br>
    Object that need other object or part to construct / when we have a method or constructer that accept other object as an argument. <br>
    <i>eg</i> :  public user(String name, Address address, List<Role> roles) : access other class as input Q! </br>
    <br>
    <br>
    
    -- we have a complex process to contruct an object and involving multiple steps , then design pattern can be helpfull.
    -- In builder we remove the logic related to the object construction from the client code and abstract in seperate class.
    
    
    
    <br><br>-With builder aas a inner static class we can easily create the immutable class
    - Abstract builder is also not required where the product is class not a part of any inheritance hierarchy.
    - if running into too many constructor argument problem, it is good indicication to have  builder design pattern.
    
    
<br><br>Example of builder in java<br>
- java.lang.stringbuilder class as well as other buffer class bytebuffer, charbuffer are the example of builder class.
    
    
    
<br><br><b>Summery</b>
- when we have a complex construtor or an object is build in multiple steps.

