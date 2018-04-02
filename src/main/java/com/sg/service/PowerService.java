package com.sg.service;

import com.sg.dto.Person;
import com.sg.dto.Power;

import java.util.List;

public interface PowerService {

    Power create(Power power);

    Power read(Power power);

    void update(Power power);

    void delete(Power power);

    List<Power> retrieveAllPowers(int limit, int offset);

    List<Power> retrieveAllPowersByPerson(Person person, int limit, int offset);
}
