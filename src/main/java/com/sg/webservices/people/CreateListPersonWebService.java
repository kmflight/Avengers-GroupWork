package com.sg.webservices.people;

import com.sg.commandmodel.people.createperson.CreatePersonCmdModel;
import com.sg.dto.Person;
import com.sg.viewmodel.people.createlistperson.CreateListPersonViewModel;

public interface CreateListPersonWebService {


    public CreateListPersonViewModel getCreateListPersonViewModel(Integer limit, Integer offset, Integer pageNumbers);

    public Person saveCreatePersonCmdModel(CreatePersonCmdModel commandModel);
}
