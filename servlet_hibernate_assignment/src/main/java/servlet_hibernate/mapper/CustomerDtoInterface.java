package servlet_hibernate.mapper;

import servlet_hibernate.model.Customer;
import servlet_hibernate.model.Customerdto;

public interface CustomerDtoInterface {
	
	public Customer customerdtotocustomer(Customerdto dto);
	public Customerdto customertocustomerdto(Customer customer);

}
