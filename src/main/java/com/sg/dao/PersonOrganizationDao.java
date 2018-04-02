package com.sg.dao;

import com.sg.dto.Organization;
import com.sg.dto.PersonOrganization;

import java.util.List;

public interface PersonOrganizationDao {

    PersonOrganization create(PersonOrganization personOrganization);

    PersonOrganization read(PersonOrganization personOrganization);

    void update(PersonOrganization personOrganization);

    void delete(PersonOrganization personOrganization);

    List<PersonOrganization> retrieveAllPersonOrganization(int limit, int offset);
}
