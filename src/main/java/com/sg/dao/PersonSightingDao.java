package com.sg.dao;

import com.sg.dto.Person;
import com.sg.dto.PersonSighting;
import com.sg.dto.Sighting;

import java.util.List;

public interface PersonSightingDao {

    PersonSighting create(PersonSighting personSighting);

    PersonSighting read(PersonSighting personSighting);

    void update(PersonSighting personSighting);

    void delete(PersonSighting personSighting);

    List<PersonSighting> retrieveAllPersonSightings(int limit, int offset);

    List<PersonSighting> retrieveAllPersonSightingsByPerson(Person person, int limit, int offset);

    List<PersonSighting> retrieveAllPersonSightingsBySighting(Sighting sighting, int limit, int offset);
}
