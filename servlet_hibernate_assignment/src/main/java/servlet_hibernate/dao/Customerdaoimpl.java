package servlet_hibernate.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;

import servlet_hibernate.model.Customer;
import servlet_hibernate.util.Customerutil;

public class Customerdaoimpl implements Customerdao {
	
	private Session session;
	private EntityManager manager;
	
	{
		session = Customerutil.getsessionobj().openSession();
		session.getTransaction().begin();
		manager = session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
				
	}

	@Override
	public Customer createcustomer(Customer customer) {
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.getTransaction().commit();
		
		
		
		return customer;
	}

	@Override
	public List<Customer> displayall() {
		javax.persistence.Query q = manager.createQuery("from Customer");
		return q.getResultList();
	}

	@Override
	public void update(Customer customer) {
		manager.getTransaction().begin();
		manager.merge(customer);
		manager.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Customer findbyid(int id) {
		manager.getTransaction().begin();
		Customer ctr = manager.find(Customer.class, id);
		manager.getTransaction().commit();
		return ctr;
	}

	@Override
	public void delete(int id) {
		Customer ctr = findbyid(id);
		manager.getTransaction().begin();
		manager.remove(ctr);
		manager.getTransaction().commit();
		
	}
	
	

}
