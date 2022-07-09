<h2>Simple Factory</h2>

- In this we simply move the instantiation logic to the seperate class and most commanly to a seperate static method of tthis class.
- We dont consider simple factory as design  pattern as it is just an encapsulation of object instantiation.
- Typically we do this if we have more than one option when instantiation object and simple logic is used to choose the correct class.

<h4>Implementation</h4>
- Simple Factory can be just a methods in a existing class, adding a seperate class from an existing class make it more easy to be access by other code.
- It doesnot make any state change so it is best to keep it as static.

<h4>Design</h4>
- Simple Factory will in turn mey use other design pattern like builder to construct the object.
- In case we want to specialize the factory in subclasses, you need factory method design pattern.


<table>
  <thead>
    <th>Simple Factory</th>
    <th>Factory Method</th>
  </thead>
  <tbody>
    <tr>
      <td>we simple move the instantation logic away from the client code, in a static method</td>
      <td>This is usefull when you want to delegation the object creation sub-classes in </td>
    </tr>
    <tr>
      <td>Simple factory know all classes whom object is created </td>
      <td>In Factory Metjod, we dont know about in advance about the other classes</td>
    </tr>
  </table>
  
