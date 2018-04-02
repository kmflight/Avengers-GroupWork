package com.sg.dao;

import com.sg.dto.PersonSighting;

import java.util.List;

public interface PersonSightingDao {

    PersonSighting create(PersonSighting personSighting);

    PersonSighting read(PersonSighting personSighting);

    void update(PersonSighting personSighting);

    void delete(PersonSighting personSighting);

    List<PersonSighting> retrieveAllPersonSightings(int limit, int offset);
}
