package com.sg.dao;

import com.sg.dto.Organization;
import com.sg.dto.Person;
import com.sg.dto.Power;
import com.sg.dto.Sighting;

import java.util.List;

public interface PersonDao {

    Person create(Person person);

    Person read(Person person);

    void update(Person person);

    void delete(Person person);

    List<Person> retrieveAllPersons(int limit, int offset);

    List<Person> retrieveAllPersonsByOrg(Organization organization, int limit, int offset);

    List<Person> retrieveAllPersonsByPower(Power power, int limit, int offset);

    List<Person> retrieveAllPersonsBySighting(Sighting sighting, int limit, int offset);
}
