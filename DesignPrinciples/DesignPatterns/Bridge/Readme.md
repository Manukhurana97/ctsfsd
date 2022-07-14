<h1>Bridge</h1>
<ul>
<li> Our implementation & abstraction are generally coupled o each other in normal inheritance.</li>
<li> Using bridge pattern we can decouple them so they can bothe change withoout affecting each other.</li>
<li> we achieve this feat by changing two seperate inheritance hierarchies; one for implementation and other for abstractions.</li>
<li> we use composition to bridge these two hierarchies.</li>
</ul>


<br>
<ul>
  <li>We start by defining out abstraction as needed by client.</li>
  <ul>
    <li>We determine common base operations and  define them in abstrction. </li>
    <li>we can optionally also define a refined abstraction & provide more specializes operations</li>
    <li>The we define our implemenrot next, Implementor method do not have to much with abstraction. However abstraction can carry out its work by using implementor methods.</li>
    <li>Then we write one or more concrete implementor providing implemention</li>
  </ul>
</ul>
