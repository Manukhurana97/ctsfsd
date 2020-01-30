package servlet_hibernate.mapper;

import servlet_hibernate.model.Customer;
import servlet_hibernate.model.Customerdto;

public class Customermapper implements CustomerDtoInterface {

	@Override
	public Customer customerdtotocustomer(Customerdto dto) {
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer ctr = new Customer();
			ctr.setUid(dto.getUid());
			ctr.setFirstname(dto.getFirstname());
			ctr.setLastname(dto.getLastname());
			ctr.setEmail(dto.getEmail());
			return ctr;
		}
		
	}

	@Override
	public Customerdto customertocustomerdto(Customer customer) {
		if(customer==null)
		{
			return null;
		}
		else
		{
			Customerdto cdto = new Customerdto();
			cdto.setUid(customer.getUid());
			cdto.setFirstname(customer.getFirstname());
			cdto.setLastname(customer.getLastname());
			cdto.setEmail(customer.getEmail());
			
			return cdto;
		}
		
		
	}



}
