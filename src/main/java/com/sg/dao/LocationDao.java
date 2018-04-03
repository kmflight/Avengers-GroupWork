package com.sg.dao;

import com.sg.dto.Location;
import com.sg.dto.Person;

import java.util.List;

public interface LocationDao {

    Location create(Location location);

    Location read(Location location);

    void update(Location location);

    void delete(Location location);

    List<Location> retrieveAllLocations(int limit, int offset);

    List<Location> retrieveAllLocationsByPerson(Person person, int limit, int offset);

}
