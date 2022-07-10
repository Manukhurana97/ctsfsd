<h1>Abstract Factory</h1>

- we use abstract when we have 2 or more object which work together to forming a kit or set and there can be multiple sets or kits that are created by the client.
- so we seperate the client code from concrete objects formation such a set and also from the code which create these sets.


<h2> Implementation </h2>
** we start by studying the product "sets".
<ol>
    <li>Create abstract factory as an abstract class or in interface.</li>
    <li>Abstract factory defines abstract methods for creating products.</li>
    <li>Provide concrete implementation of factory for each set of products.</li>
</ol>

** Abstract Factory make use of factory method pattern. you can think of abstract factory as an object with multiple factory methods.


<h2>Implementation</h2>
<ul>
    <li>Factory can be implemented as singletons, we typically ever need only one instance of it anyway.
    But make sure to familiazize yourself with drawbacks of singleton.</li>
    <li>Adding new Products type require changes to the base factory as well as all implementation of factory.</li>
    <li>We provide the client code with concrete factory so that it can create objects.</li>
</ul>

<h2>Design Consideration</h2>
<ul>
       <li>When you want to constrain object creations so that they all work together then abstract factory      is good design pattern</li>
     <li>Abstract Factory uses factory method pattern.</li>
     <li> If object are expensive to create the you can transparently switch factory implementations to use prototype design pattern to create objects</li>
</ui>
