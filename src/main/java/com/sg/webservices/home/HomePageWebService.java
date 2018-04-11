package com.sg.webservices.home;

import com.sg.viewmodel.home.HomeViewModel;

public interface HomePageWebService {

    //HUH?
    public HomeViewModel getHomeViewModel(int limit, int offset, int pageNumbers);

}
