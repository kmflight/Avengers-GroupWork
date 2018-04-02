package com.sg.service;

import com.sg.dto.PersonPower;

import java.util.List;

public interface PersonPowerService {

    PersonPower create(PersonPower personPower);

    PersonPower read(PersonPower personPower);

    void update(PersonPower personPower);

    void delete(PersonPower personPower);

    List<PersonPower> retrieveAllPersonPowers(int limit, int offset);


}
