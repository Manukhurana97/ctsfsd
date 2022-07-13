<h1>Adaptive </h1>

<ul>
  <li>We have an existing obecjts which provides the functionality that client needs, But client code can't use this object because it expects an object with different interface.</li>
  <li>Using adaptive design pattern we make this existing object work with client by adapting the object to client expected interface.</li>
</ui>

<br>
<h2>Implementation</h2>
<ul>
  <li>We start creating a class for Adapter</li>
  <ui>
    <li>Adapter must implements the interface expected by client</li>
    <li>First we are going to try out a class adapter by also extending from out extending class.</li>
    <li>In the class adapter implementation we are simply going to forward the method to another method inherited by adaptee.</li>
    <li>Next for object adapter, we are only going to implement target interface and accept adeptee s constructor argument in adapter i.r make use of composition.</li>
   </ul>
  <li>An object adpater should take adaptee as an argument in constructor or as a less preferred solution, you can instantiate it in the constructor this tight coupling with a specific adaptee.</li>
</ul>
