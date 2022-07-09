- we want to move the object creational logic to seperate class
- we use this pattern when we do not know in advance which class we may need to instanciate before hand & also to allowed to be added to the system and handle there creation without affecting client code.
- we let the subclass to decide which object to instansiate by overrriding the factory method.



<h2> Implementation</h2>
<ul>  we starts by creating the class for our creater.</ul>
<li>  Creater itself can se concrete, it provide the default object or it can be abstract.</li>
<li>  Implementation will override the metord and return the object.</li>


<br></br>
- The creater can be a concrete class & provide default implementation in factory method. In some cases you will create some "default" object in base class.
- we can also use the simple factory way to accepting the additional argument to close between the different object types. Sub classes the can override the factory method to selectively create the different object of same criteria.

<h2> Design </h2>
- The creater hierarchy in factory method reflect the product hierarchy, we typically ends up with a concrete creater per object type. eg: message , json, text message is creater hierarchy.
- Template design pattern uses factory design pattern
- another design pattern called abstract design pattern uses factory design  pattern.


<B>Eg.</B>: iterator method

