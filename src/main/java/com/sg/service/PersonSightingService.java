package com.sg.service;

import com.sg.dto.PersonSighting;

import java.util.List;

public interface PersonSightingService {

    PersonSighting create(PersonSighting personSighting);

    PersonSighting read(PersonSighting personSighting);

    void update(PersonSighting personSighting);

    void delete(PersonSighting personSighting);

    List<PersonSighting> retrieveAllPersonSightings(int limit, int offset);
}
