package com.example.learnspringboost.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learnspringboost.dao.PersonDAO;
import com.example.learnspringboost.model.Person;

@RestController
@RequestMapping("person")
public class PersonaRest {

    @Autowired
    private PersonDAO personDao; 

    @PostMapping("/save")
    public Person save(@RequestBody Person person){
      return personDao.save(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personDao.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable("id") Integer id){
       personDao.deleteById(id);
    }
}
