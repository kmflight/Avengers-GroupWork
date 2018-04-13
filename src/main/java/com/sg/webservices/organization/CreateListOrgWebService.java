package com.sg.webservices.organization;

import com.sg.commandmodel.organization.createorg.CreateOrgCmdModel;
import com.sg.dto.Organization;
import com.sg.viewmodel.organization.createlistorg.CreateListOrgViewModel;

public interface CreateListOrgWebService {


    public CreateListOrgViewModel getCreateListOrgViewModel(Integer limit, Integer offset, Integer pageNumbers);

    public Organization saveCreateOrgCmdModel(CreateOrgCmdModel commandModel);

}
