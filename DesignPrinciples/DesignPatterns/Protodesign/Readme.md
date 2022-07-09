<h2>ProtoDesign Pattern</h2>

- When we have complex object, that is costly to create, To create more instance of such class, we can use existing instance of our prototype.
- Prototype allow us to create copy of our existing object  &  save us from having the object to recreate .


<h2> Implement a Prototype </h2>
We state by creating a class which will be a prototype
<ul>
  <li> This class must implement Cloneable interface. </li>  
  <li> Class should override clone method and return copy itself. </li>
  <li> The methods declare CloneNotSupportException in throws clause to a given sub class chance to decide on whether to support cloning. </li>
</ul>

  
** Clone method implementation should consider the deep and shallow copy choose whichever is applicable.
  
  
