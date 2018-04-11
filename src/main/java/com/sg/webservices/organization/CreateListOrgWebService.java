package com.sg.webservices.organization;

import com.sg.commandmodel.organization.createorg.CreateOrgCmdModel;
import com.sg.dto.Organization;
import com.sg.viewmodel.organization.createlistorg.CreateListOrgViewModel;

public interface CreateListOrgWebService {


    public CreateListOrgViewModel getCreateListOrgViewModel(int limit, int offset, int pageNumbers);

    public Organization saveCreateOrgCmdModel(CreateOrgCmdModel commandModel);

}
