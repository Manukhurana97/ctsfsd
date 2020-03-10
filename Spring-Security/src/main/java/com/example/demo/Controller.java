package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class Controller {
	
	@Autowired
	private BookDao dao;
	
	
    @GetMapping("/books")
    List<Books> findAll() {
        return dao.findAll();
    }
    
    @PostMapping("/books")
    @ResponseStatus(code = HttpStatus.CREATED)
    Books newBook(@Valid @RequestBody Books newBook) {
        return dao.save(newBook);
    }
    
    
    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable Long id) {
        dao.deleteById(id);
    }

}
