package com.sg.service;

import com.sg.dto.Person;
import com.sg.dto.PersonPower;
import com.sg.dto.Power;

import java.util.List;

public interface PersonPowerService {

    PersonPower create(PersonPower personPower);

    PersonPower read(PersonPower personPower);

    void update(PersonPower personPower);

    void delete(PersonPower personPower);

    List<PersonPower> retrieveAllPersonPowers(int limit, int offset);

    List<PersonPower> retrieveAllPersonPowerByPerson(Person person, int limit, int offset);

    List<PersonPower> retrieveAllPersonPowerByPower(Power power, int limit, int offset);

}
