package lits.ua.boot.service.impl;

import dtos.PersonDto;
import lits.ua.boot.entity.Person;
import lits.ua.boot.repository.PersonRepository;
import lits.ua.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("dead")
public class DeadPersonService implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDto getById(Integer id) {
        return null;
    }

    @Override
    public List<PersonDto> getAllPersons() {
        return null;
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        Person person = new Person();
        person.setAge(personDto.getAge());
        person.setUsername(personDto.getUserName());
        return null;
    }
}