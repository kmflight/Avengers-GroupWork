package com.sg.dao;

import com.sg.dto.Organization;
import com.sg.dto.Person;

import java.util.List;

public interface OrganizationDao {

    Organization create(Organization organization);

    Organization read(Organization organization);

    void update(Organization organization);

    void delete(Organization organization);

    List<Organization> retrieveAllOrganizations(int limit, int offset);

    List<Organization> retrieveAllOrganizationsByPerson(Person person, int limit, int offset);

}
