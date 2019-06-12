package lits.ua.boot.service;

import dtos.PersonDto;

import lits.ua.boot.entity.Person;

import java.util.List;

public interface PersonService {
    PersonDto getById(Integer id);

    List<PersonDto> getAllPersons();

    PersonDto save(PersonDto person);
}
