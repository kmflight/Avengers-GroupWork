package com.sg.dao;

import com.sg.dto.Person;
import com.sg.dto.Sighting;

import java.util.List;

public interface SightingDao {

    Sighting create(Sighting sighting);

    Sighting read(Sighting sighting);

    void update(Sighting sighting);

    void delete(Sighting sighting);

    List<Sighting> retrieveAllSightings(int limit, int offset);

    List<Sighting> retrieveAllSightingsByPerson(Person person, int limit, int offset);
}
