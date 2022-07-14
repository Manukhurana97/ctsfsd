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


<br>
<h2>Implementation Consideration</h2>
<ul>
<li>How much word does depends upn the differences b/w target interface and object being adapted. if method arguments are same or different has very less work to do</li>
<li>Using class adpater "allows" you to override some of the adaptee's behaviour. But this has to bbe avoided as you end up with adapter that differently the adaptee,</li>
<li>Using obejct adpater allows you to potentially change the adaptee object to one of its subclasses.</li>
</ul>


<br>
<h2>Design</h2>
<ul>
  <li>In java a "class adapter" mey not be possible if bothe target and adpatee are concerte classes. In such cases the object adapter is the only solutions, ALso since there is no private inheritance in java , it's better to stick with object adapter.</li>
  <li> A class adapter is also called as a 2 way adpater, since it can stand in for both the target interfc e and for the adaptee. That is we can use object of adapter where either target interface is expected as well as where an adaptee object is expected</li>
</ul>


 <br>
<h2>Example</h2>
<ul>
  <li>Input stream reader</li>
  <li>Output Stream reader</li>
</ul>
