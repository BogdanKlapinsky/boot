package lits.ua.boot.web;

import dtos.PersonDto;
import lits.ua.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/app")
public class PersonController {
    @Autowired
    @Qualifier(value = "alive")
    private PersonService personService;
    @GetMapping
    public List<PersonDto> getPersonById(){
        return personService.getAllPersons();
    }
    @PostMapping
    public PersonDto savePerson(@RequestBody PersonDto personDto){
        return personService.save(personDto);
    }

    @GetMapping(value = "/user")
    public PersonDto getPersonById(@RequestParam Integer id){
        return personService.getById(id);
    }
    public List<PersonDto> getAll(){
        return personService.getAllPersons();}
}
