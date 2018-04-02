package com.sg.dao;

import com.sg.dto.PersonPower;

import java.util.List;

public interface PersonPowerDao {

    PersonPower create(PersonPower personPower);

    PersonPower read(PersonPower personPower);

    void update(PersonPower personPower);

    void delete(PersonPower personPower);

    List<PersonPower> retrieveAllPersonPowers(int limit, int offset);


}
