<h2>ProtoDesign Pattern</h2>

- When we have complex object, that is costly to create, To create more instance of such class, we can use existing instance of our prototype.
- Prototype allow us to create copy of our existing object  &  save us from having the object to recreate .

<br>

<h2> Implement a Prototype </h2>
We state by creating a class which will be a prototype
<ul>
  <li> This class must implement Cloneable interface. </li>  
  <li> Class should override clone method and return copy itself. </li>
  <li> The methods declare CloneNotSupportException in throws clause to a given sub class chance to decide on whether to support cloning. </li>
</ul>

  
** Clone method implementation should consider the deep and shallow copy choose whichever is applicable.

<br>
<h2> Implementation </h2>
<ul>
<li> Pay attention to the deep and the shallow copy of refrences. Immutable fields on clone.</ii>
<li> Make sure to reset the mutable state fo tthe object before returning the prototype.  it is good idea to implements this is method to allow subclass to initialize themselves</li>
<li>clone() method is protected in Object class and must overridden to be public to be callable from outside the class</li>
<li> clone us the "marker interface ", an indication that the class support cloning.</li>
</ul>
  
  
<br>
<h2> Design </h2>
<ul>
<li>Prototype arte usefull when we have large amount of object, where majority of state is unchanged b/w instances and you can easily identity the state.</li>
<li>Prototype are usefull when working with composite and decorate patterns</li>
</ul>
  
 
<br>
<h2>Example</h2>
<ul>
<li>Clone method is an example of a protytype (object.clone())</li>
</ul>
