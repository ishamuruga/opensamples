package com.supers.sb.hw.springboothw.repo;

import java.util.List;

import com.supers.sb.hw.springboothw.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    @Query(value = "select p from com.supers.sb.hw.springboothw.entity.Person p where p.pId=?1")
    public List<Person> getPersons(int id);

    @Query(value = "select p from com.supers.sb.hw.springboothw.entity.Person p")
    public List<Person> getPersons();
}
