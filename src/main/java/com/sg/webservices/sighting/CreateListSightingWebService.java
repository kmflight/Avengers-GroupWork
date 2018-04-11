package com.sg.webservices.sighting;

import com.sg.commandmodel.sighting.createsighting.CreateSightingCmdModel;
import com.sg.dto.Sighting;
import com.sg.viewmodel.sighting.createlistsighting.CreateListSightingViewModel;

public interface CreateListSightingWebService {


    public CreateListSightingViewModel getCreateListSightingViewModel(int limit, int offset, int pageNumbers);

    public Sighting saveCreateSightingCmdModel(CreateSightingCmdModel commandModel);
}
