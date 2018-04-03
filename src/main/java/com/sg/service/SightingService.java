package com.sg.service;

import com.sg.dto.Location;
import com.sg.dto.Person;
import com.sg.dto.Sighting;

import java.time.LocalDate;
import java.util.List;

public interface SightingService {

    Sighting create(Sighting sighting);

    Sighting read(Sighting sighting);

    void update(Sighting sighting);

    void delete(Sighting sighting);

    List<Sighting> retrieveAllSightings(int limit, int offset);

    List<Sighting> retrieveAllSightingsByPerson(Person person, int limit, int offset);

    List<Sighting> retrieveAllSightingsByLocation(Location location, int limit, int offset);

    List<Sighting> retrieveAllSightingsByDate(LocalDate date, int limit, int offset);
}
