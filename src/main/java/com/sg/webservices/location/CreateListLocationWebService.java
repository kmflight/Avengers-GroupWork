package com.sg.webservices.location;

import com.sg.commandmodel.location.createlocation.CreateLocationCmdModel;
import com.sg.dto.Location;
import com.sg.viewmodel.location.createlistlocation.CreateListLocationViewModel;


import java.util.List;

public interface CreateListLocationWebService {


    public CreateListLocationViewModel getCreateListLocationViewModel(int limit, int offset, int pageNumbers);

    public Location saveCreateLocationCmdModel(CreateLocationCmdModel commandModel);
}
