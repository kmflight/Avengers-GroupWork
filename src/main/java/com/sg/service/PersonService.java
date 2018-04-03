package com.sg.service;

import com.sg.dto.*;

import java.util.List;

public interface PersonService {

    Person create(Person person);

    Person read(Person person);

    void update(Person person);

    void delete(Person person);

    List<Person> retrieveAllPersons(int limit, int offset);

    List<Person> retrieveAllPersonsByOrg(Organization organization, int limit, int offset);

    List<Person> retrieveAllPersonsByPower(Power power, int limit, int offset);

    List<Person> retrieveAllPersonsBySighting(Sighting sighting, int limit, int offset);

    List<Person> retrieveAllPersonsByLocation(Location location, int limit, int offset);
}
