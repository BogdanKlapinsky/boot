package lits.ua.boot.service.mapper;

import dtos.PersonDto;
import lits.ua.boot.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public Person toEntity(PersonDto personDto){
        Person person = new Person();
        person.setUsername(personDto.getUserName());
        person.setAge(personDto.getAge());
        return person;
    }
    public PersonDto toDto(Person person){
        PersonDto personDto = new PersonDto();
        personDto.setUserName(person.getUsername());
        personDto.setAge(person.getAge());
        return personDto;

    }}
