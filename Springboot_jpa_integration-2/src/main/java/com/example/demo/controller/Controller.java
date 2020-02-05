package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.BookNotFound;
import com.example.demo.error.ErrorMgs;
import com.example.demo.model.Customer;
import com.example.demo.service.Service;

@RestController
@RequestMapping("/api")
public class Controller {
	public Service SS;

	@Autowired
	public Controller(Service s) {
		super();
		SS = s;
	}
	
	@GetMapping("/Customer")
	public List<Customer> getAllCustomers(){
		return SS.getAllCustomer();
		
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMgs> handleError1(BookNotFound bnf)
	{
		ErrorMgs Em = new ErrorMgs();
		Em.setMgs(bnf.printmgs());
		Em.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		Em.setTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMgs>(Em, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMgs> handleError2(Exception e)
	{
		ErrorMgs Em = new ErrorMgs();
		Em.setMgs(e.getMessage());
		Em.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		Em.setTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMgs>(Em, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/customer/{customerId}")
	public Optional<Customer>  getBookById(@PathVariable Integer customerId) throws Exception
	{
		Optional<Customer> opt = SS.findbyId(customerId);
		if(!opt.isPresent()) {
			throw new BookNotFound("Customer Not found with id"+customerId);
		}
		return opt;
		
	}
	
	@PostMapping("/Customer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
//		customer.setId(0);
		return SS.createCustomer(customer);
		
	}
	
	@DeleteMapping("/customerdel/{customerId}")
	public void deletebyid(@PathVariable Integer customerId)
	{
		SS.deletebyid(customerId);
		
	}
	
	@DeleteMapping("/customerdel")
	public void deleteall()
	{
		SS.deleteall();
		
	}
	
	@GetMapping("Customer/name/{name}")
	public List<Customer> findByname(@PathVariable String name)
	{
		return SS.findByname(name);
	}
	
	@GetMapping("Customer/email/{email}")
	public List<Customer> findByemail(@PathVariable String email)
	{
		return SS.findByemail(email);
	}
	
}
