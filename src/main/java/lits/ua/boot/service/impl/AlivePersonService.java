package lits.ua.boot.service.impl;

import dtos.PersonDto;
import lits.ua.boot.entity.Person;
import lits.ua.boot.repository.PersonRepository;
import lits.ua.boot.service.PersonService;
import lits.ua.boot.service.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("alive")
public class AlivePersonService implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDto getById(Integer id) {
        return personMapper.toDto(personRepository.findOne(id));
    }

    @Override
    public List<PersonDto> getAllPersons() {
//        PersonDto personDto = new PersonDto();
//        return personMapper.toEntity(personDto.get);
        return null;
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        Person person= personMapper.toEntity(personDto);
        return personMapper.toDto(personRepository.save(person));
    }


}