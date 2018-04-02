package com.sg.service;

import com.sg.dto.PersonOrganization;

import java.util.List;

public interface PersonOrganizationService {

    PersonOrganization create(PersonOrganization personOrganization);

    PersonOrganization read(PersonOrganization personOrganization);

    void update(PersonOrganization personOrganization);

    void delete(PersonOrganization personOrganization);

    List<PersonOrganization> retrieveAllPersonOrganization(int limit, int offset);
}
